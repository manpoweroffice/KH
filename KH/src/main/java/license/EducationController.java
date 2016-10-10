package license;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EducationController{
	@Autowired
	private EducationDAO edu_dao;


public void setDao(EducationDAO edu_dao){
	this.edu_dao = edu_dao;
}


@RequestMapping(value="/career/education.do", method = RequestMethod.GET)
 public String form(){
	return "career/education";
}

@RequestMapping(value="/career/education.do", method = RequestMethod.POST)
public String submit(){
	return null;
}


}




 

