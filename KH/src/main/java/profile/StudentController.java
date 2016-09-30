package profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("profile/form.do")
public class StudentController {
	
	private StudentDao studentDao;
	  
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	@ModelAttribute
	public Object studentinfo() throws Exception{
		return new StudentCommand();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(){
		//@requestparam(StudentCommand command)
		String stu_num="100101";
		StudentCommand command=studentDao.selectOne(stu_num);
		
		return new ModelAndView("/profile/basicForm","command",command);
		}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView modify(@ModelAttribute StudentCommand command){
		String stu_num="100101";
		
		command= new StudentCommand(stu_num,command.getMil_service(),command.getLast_rank(),command.getTour_of_duty(),command.getExemp()
				,command.getH_tob(),command.getH_job(),command.getH_location(),command.getH_income());
		studentDao.update(command);    
		
		command=studentDao.selectOne(stu_num);
		return new ModelAndView("/profile/basicForm","command",command);
		
	}
}

