package main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class LoginController {
	
	private  LoginDAO dao;

	public LoginDAO getDao() {
		return dao;
	}

	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/login/login.do", method = RequestMethod.GET)
    public String init(Model model) {
        
        return "loginForm";
    }
 
    @RequestMapping(value = "/login/login.do",method = RequestMethod.POST)
    public String submit(@RequestParam String stu_num,@RequestParam String pwd,HttpServletRequest request) {
    	int check = dao.checkMember(stu_num, pwd);

    	if(check==0){
    		return "loginForm";
    		//실패했을경우
    	}else{
    		request.getSession().setAttribute("msg", stu_num);

    		return "main/main"; 
    		//성공했을경우
    	}

        }
    
	@RequestMapping(value = "/main/main.do",method = RequestMethod.POST)
	public String submit(@RequestParam String stu_num, HttpServletRequest request) {

		request.getSession().setAttribute("msg", stu_num);
	
		return "main/main"; 
			//성공했을경우
		
	
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
