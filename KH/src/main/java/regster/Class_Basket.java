package regster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register/Class_Basket.do")
public class Class_Basket {
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "register/Class_Basket";
	}
 
}
