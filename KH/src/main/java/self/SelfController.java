package self;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/self/inroduction")
public class SelfController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "self/inroduction";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("self") SelfCommand selfCommand, BindingResult result){
		if(result.hasErrors()){
			return "self/inroduction"; 
		}
		try{ 
			return "self/inroductionSuccess";
		}catch(AuthenticationException ex){
			return "self/inroduction";
		}
	}

}
