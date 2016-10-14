package scholarship;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import profile.StudentCommand;

@Controller
public class ScholarController {

	private ScholarDao scholarDao;
  
	public void setScholarDao(ScholarDao scholarDao) {
		this.scholarDao = scholarDao;
	}
	@ModelAttribute
	protected Object scholarObject() throws Exception{
		return new ScholarCommand();
	}
	@RequestMapping(value="scholarship/scholarList.do", method=RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request){
		String stu_num = (String) request.getSession().getAttribute("msg");
		List<ScholarCommand> command=scholarDao.select_sch(stu_num);
		return new ModelAndView("scholarship/scholarList","command",command);
	}
	@RequestMapping(value="scholarship/scholarList.do",method=RequestMethod.POST)
	public ModelAndView submit(HttpServletRequest request){
		String stu_num = (String) request.getSession().getAttribute("msg");
		List<ScholarCommand> schcommand=scholarDao.select_sch(stu_num);
		StudentCommand command=scholarDao.select_one(schcommand);
		  
		return new ModelAndView("/scholarship/scholarForm","command",command);
	}   
} 
