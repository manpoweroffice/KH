package profile;


import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import profile.Upload;
@Controller
public class StudentController {
	
	private StudentDao studentDao;
	  
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	@ModelAttribute
	public Object studentinfo() throws Exception{
		return new StudentCommand();
	}
	
	@RequestMapping(value="profile/basicForm.do",method = RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request){
		//@requestparam(StudentCommand command)
		StudentCommand command;
		String stu_num = (String) request.getSession().getAttribute("msg");
		int check=studentDao.check(stu_num);
		if(check>0){
			command=studentDao.select(stu_num);
		}
		else{
			command=studentDao.selectAll(stu_num); 
		}
		//현재 Storge에 학번이 전부 올라가 있지 않으므로 join에러가 뜸!!
		//해결하기 위해서는 if문으로 storge 테이블에 로그인한 학번이 없을 경우는 join하지 않고 select를 사용하고
		//있으면 join문으로 넘어가게 수정해야됨.
		return new ModelAndView("profile/basicForm","command",command);
		}
	
	@RequestMapping(value="profile/basicForm.do",method=RequestMethod.POST)
	public ModelAndView modify(@ModelAttribute StudentCommand command, HttpServletRequest request){
		String stu_num = (String) request.getSession().getAttribute("msg");
		command= new StudentCommand(stu_num,command.getP_check(),command.getMil_service(),command.getLast_rank(),command.getTour_of_duty(),command.getExemp()
				,command.getH_phone(),command.getPhone(),command.getEn_name(),command.getAddress(),command.getH_tob(),command.getH_job(),command.getH_location(),command.getH_income());
		
		studentDao.update(command);    
		
		command=studentDao.select(stu_num);
		return new ModelAndView("profile/success","command",command);
		
	}
	@RequestMapping(value="/profile/upload.do",method = RequestMethod.GET)
	public String upload(){
		return "profile/upload";
	}
		
	 public String upload(MultipartFile up,HttpServletRequest request){
		      //사진 불러올때 저장(session)
		 	  String stu_num = (String) request.getSession().getAttribute("msg");
		 	 String file_path=request.getSession().getServletContext().getRealPath("resources/upload/");
		 	 // String file_path=request.getServletContext().getRealPath("resources/upload/");//파일저장경로
		      String file_name = up.getOriginalFilename();
		      String path ="/KH/resources/upload/"+up.getOriginalFilename();//db저장경로
		      String type="증명사진";
		      int check=studentDao.check(stu_num);
		      Upload upload = new Upload(stu_num,file_name, path, type);
		      if(file_name!=""){
		    	  if((type=="증명사진")&&(check>0)){
		    		  studentDao.updateImg(upload);
		    	  }
		    	  else 
		    	  {	  studentDao.insertImg(upload);  }
		      }
		      else System.out.println("저장 실패!");
		      File file = new File(file_path+"/"+file_name);
		      
		      try{
		         up.transferTo(file);
		      }catch(Exception e){
		         e.printStackTrace();
		      }
		      return path;
		   }
	 @RequestMapping(value="/profile/upload.do", method=RequestMethod.POST)
	   public ModelAndView submit(@RequestParam("upload") MultipartFile upload,HttpServletRequest request){
	      String path=upload(upload,request);
	      return new ModelAndView("profile/success_up","path",path);
	   }    

}




