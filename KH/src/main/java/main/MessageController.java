package main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import profile.StudentDao;

@Controller
@RequestMapping("/main/message")
public class MessageController {

	private MessageDAO messagedao;
	public void setMessagedao(MessageDAO messagedao) {
		this.messagedao = messagedao;
	}
	
	private StudentDao studentdao;
	public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView form(MessageCommand messageCommand, HttpServletRequest request){
		request.getSession().setAttribute("stu_num", "130101");
		String stu_num = (String)request.getSession().getAttribute("stu_num");
		
		String receive = studentdao.selectOne2(stu_num);
		List<MessageCommand> messageList = messagedao.selectList(receive);

		return new ModelAndView("main/message", "messageList", messageList);
	}
	
}
