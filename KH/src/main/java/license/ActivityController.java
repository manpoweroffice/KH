package license;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/career/activity.do")
public class ActivityController {
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "career/activity";
	}

}

