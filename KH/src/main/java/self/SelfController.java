package self;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/self/introduction")
public class SelfController {
	private SelfDAO dao;
	
	public void setDao(SelfDAO dao) {
		this.dao = dao;
	}
	
	String stu_num = "130201";
	String content1 = "1";
	String content2 = "1";
	String content3 = "1";
	String content4 = "1";
	

	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "self/introduction";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("self") SelfCommand selfCommand, BindingResult result){
		if(result.hasErrors()){
			return "self/introduction"; 
		}
		try{ 
			insert();
			return "self/introductionSuccess";
		}catch(AuthenticationException ex){
			return "self/introduction";
		}
	}
	
	public void insert(){
		SelfCommand selfCommand = new SelfCommand(stu_num, content1, content2, content3, content4);
		if(stu_num!=""){
			System.out.println(selfCommand.getContent1() +" ll" +selfCommand.getS_date());
			dao.insertSelf(selfCommand);
			System.out.println("uuuuuu");
		}
		else System.out.println("저장이 되지 않았습니다.");
	}

}
