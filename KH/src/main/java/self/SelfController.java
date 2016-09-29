package self;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/self/introduction")
public class SelfController {

	private SelfDAO selfDao;  
	
	public void setSelfDao(SelfDAO dao) {
		this.selfDao = dao;
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView form(@ModelAttribute Self self, HttpServletRequest request){
		request.getSession().setAttribute("stu_num", "130101");
		
		String stu_num = (String)request.getSession().getAttribute("stu_num");
		
		self = selfDao.selectOne(stu_num);

		return new ModelAndView("self/introduction", "self", self);
	}
	
	@ModelAttribute
	protected Object SelfObject() throws Exception{
		return new Self();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute Self self, HttpServletRequest request){
		request.getSession().setAttribute("stu_num", "130101");
		
		String stu_num = (String)request.getSession().getAttribute("stu_num");
		
		Self self1 = selfDao.selectOne(stu_num);

		if(stu_num.equals(self1.getStu_num())){
			self = new Self(stu_num, self.getContent1(), self.getContent2(), self.getContent3(), self.getContent4());
			selfDao.update(self);
		}
		else{
			selfDao.insertSelf(self);
		}
		
		return "self/introductionSuccess";
	}
}
