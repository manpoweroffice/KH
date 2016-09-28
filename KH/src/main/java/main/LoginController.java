package main;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login/login.do")
public class LoginController {
		
	@ModelAttribute("login")
	public LoginCommand formBacking(){
		return new LoginCommand();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "Login/loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("login") LoginCommand loginCommand, BindingResult result){
		
		return "loginForm";
		
	
	
}
}
