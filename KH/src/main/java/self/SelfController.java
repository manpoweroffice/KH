package self;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/self/introduction")
public class SelfController {
	
	String stu_num = "130101";
	String content1 = "1";
	String content2 = "1";
	String content3 = "1";
	String content4 = "1";
	

	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "self/introduction";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("self") Self self, BindingResult result){
		insert();
		return "self/introductionSuccess";
	}
	
	private SelfDAO selfDao;  
	
	public void setSelfDao(SelfDAO dao) {
		this.selfDao = dao;
	}
	
	public void insert(){
		Self self = new Self(stu_num, content1, content2, content3, content4, null);
		selfDao.insertSelf(self);
	}

}
