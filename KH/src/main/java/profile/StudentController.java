package profile;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
			return "profile/form";
		}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView form(@RequestParam String stu_num){
		StudentCommand command=studentDao.selectOne(stu_num);
		return new ModelAndView("/profile/basicForm","command",command);
		
	}
	
	
}

