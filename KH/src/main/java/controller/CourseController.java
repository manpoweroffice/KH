package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/regCourse/regCourse.do")
public class CourseController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "regCourse/regCourse";
	}
 
}
