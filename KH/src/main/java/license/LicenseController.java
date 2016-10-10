package license;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;


 
@Controller
public class LicenseController {
	@Autowired
	private LicenseDAO dao; 
	@Autowired
	private KindsDAO dao1;
	
public void setDao(LicenseDAO dao){
	this.dao = dao;
}

public void setDao1(KindsDAO dao1){
	this.dao1 = dao1;
}

@RequestMapping(value="/career/kindsForm.do",method=RequestMethod.POST)
public ModelAndView getJobList(String jobcode, String parentId){
	
	String id = (parentId.equals("undefined"))? "1": parentId;

	 ModelAndView mav =  new ModelAndView("kindsForm");
	 List<KindsVo> jobList = dao1.getJobList(jobcode);
	 mav.addObject("jobList", jobList);
	 mav.addObject("parentId", id);
	 return mav;
}

@RequestMapping(value="/career/kindsForm.do",method = RequestMethod.GET)
public String kindsForm(){
	return "kindsForm";
}

@RequestMapping(value="/career/sendKinds.do",method = RequestMethod.GET)
public String sendKinds(String kinds){
	
	return "redirect:kindsForm?check=n";
}

@RequestMapping(value="/career/license.do", method=RequestMethod.GET)
public String licenseform(){
	return "career/licenseForm";
}

@RequestMapping(value="/career/license.do", method=RequestMethod.POST)
public String submit(MultipartHttpServletRequest request) //파일타입이건 일반 파라미터타입이건 MultipartHttpServletRequest 에 저장
{

	// 넘어온 파일을 리스트로 저장
	List<MultipartFile> report = request.getFiles("uploadfile"); 
	if(report.size() == 1 && report.get(0).getOriginalFilename().equals("")){
	
	} else{
		for(int i = 0; i < report.size(); i++){
			/*String o_name = UUID.randomUUID().toString(); // 파일 중복명 처리
*/			String name = report.get(i).getOriginalFilename(); // 본래 파일명
			/*String savefileName = o_name + "." + getExtension(originalfileName); // 저장되는 파일이름
*/			/*String o_name = report.getOriginalFilename(); */
			long now = System.currentTimeMillis();
			String file_name = now + name; // 파일명
			/*Random r = new Random();
			int j = r.nextInt(50); // 0 49 까지 랜덤값이 발생해서 변수에 저장
			// 파일명 과 파일경로
*/			
			String stu_num = "910820"; // 학번
			String kinds = "123"; // 자격증종류
			String publisher = "123"; // 발행처
			String dates = "123"; // 취득일
			String type = "자격증"; // 타입
			/*o_name = now +"_"+j+"_"+ o_name;*/
			
			File path = new File("C:/upload/"+name); // 파일경로
			try{
				report.get(i).transferTo(path);
				LicenseVo vo = new LicenseVo(stu_num, kinds, publisher, dates);
				StorageVo vo1 = new StorageVo(stu_num, file_name, path.getPath(), type);
				dao.upload2(vo); // 자격증
				dao.upload1(vo1); // 저장소 
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	return "career/licenseForm";
}
public void upload(List<MultipartFile> report){
	
}
}

