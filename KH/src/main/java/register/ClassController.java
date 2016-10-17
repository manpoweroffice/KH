package register;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClassController {

	Class_BasketDAO classDAO;

	public void setClassDAO(Class_BasketDAO classDAO) {
		this.classDAO = classDAO;
	}
	@RequestMapping(value="/register/Class_ASK.do", method=RequestMethod.GET)
	public String form(HttpSession session){
		String stu_num= (String)session.getAttribute("stu_num");
		List<Class_BasketBean> list=classDAO.checklist(stu_num);
		return "register/Class_ASK";
	}
	@RequestMapping(value="/register/Class_ASK.do",method=RequestMethod.POST)
	public String submit(Reg_LectureVo reg_Lecture){
		int x= classDAO.insertReg(reg_Lecture);
		return "register/Class_ASK";
	}
}
