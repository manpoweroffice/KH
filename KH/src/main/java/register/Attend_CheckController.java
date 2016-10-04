package register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Attend_CheckController {

	@RequestMapping("/register/Attend_Check.do")
	public String attendCheck(){
		System.out.println("ø‘¿Ω");
		return "register/Attend_Check";
	}
}
