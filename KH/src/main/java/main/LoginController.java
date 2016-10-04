package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class LoginController {
    @RequestMapping(value = "/login/login.do", method = RequestMethod.GET)
    public String init(Model model) {
        
        return "loginForm";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("LoginCommand") LoginCommand loginCommand) {
    	
    	
    	
        if (loginCommand != null && loginCommand.getId() != null & loginCommand.getPassword() != null) {
            if (loginCommand.getId().equals("test") && loginCommand.getPassword().equals("123")) {
                model.addAttribute("msg",loginCommand.getId());
                return "loginsuccess";
            } else {
                model.addAttribute("error", "아이디 또는 비밀번호가 다릅니다");
                return "loginForm";
            }
        }
		return "loginForm"; 
        }
    }


/*import java.util.ArrayList;
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
		return "loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("login") LoginCommand loginCommand, BindingResult result){
		
		return "loginForm";
		
	
	
}
}*/
