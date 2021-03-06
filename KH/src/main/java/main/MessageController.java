package main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import profile.StudentDao;

@Controller
public class MessageController {

	private MessageDAO messagedao;
	public void setMessagedao(MessageDAO messagedao) {
		this.messagedao = messagedao;
	}
	
	private StudentDao studentdao;
	public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}

	@RequestMapping(value="/main/message", method=RequestMethod.GET)
	public ModelAndView form(MessageCommand messageCommand, HttpServletRequest request){
		String stu_num = (String)request.getSession().getAttribute("msg");
		String receive = studentdao.selectOne2(stu_num);
		
		List<MessageCommand> messageList = messagedao.selectList(receive);

		return new ModelAndView("main/message", "messageList", messageList);
	}
	
	@ModelAttribute
	protected Object messageObject() throws Exception{
		return new MessageCommand();
	}
	
	@RequestMapping(value="/main/message", method=RequestMethod.POST)
	public ModelAndView submit(MessageCommand messageCommand){
		int m_num = messageCommand.getM_num();

		messageCommand = new MessageCommand(m_num, messageCommand.getSend(), messageCommand.getReceive(), messageCommand.getSubject(), messageCommand.getContent(), messageCommand.getM_date(), "����");
		messagedao.update(messageCommand);
		
		MessageCommand message = messagedao.selectOne(m_num);
		
		return new ModelAndView("main/open/message_open", "message", message);
	}
	
	@RequestMapping(value="/main/message_send", method=RequestMethod.GET)
	public ModelAndView sendForm(MessageCommand messageCommand, HttpServletRequest request){
		String stu_num = (String)request.getSession().getAttribute("msg");
		
		String send = studentdao.selectOne2(stu_num);
		List<MessageCommand> messageList = messagedao.selectList2(send);

		return new ModelAndView("main/message_send", "messageList", messageList);
	}
	
	@RequestMapping(value="/main/message_insert", method=RequestMethod.GET)
	public String insertForm(MessageCommand messageCommand, HttpServletRequest request){
		request.getSession().getAttribute("msg");
		
		return "main/open/message_insert";
	}
	@RequestMapping(value="/main/message_insert", method=RequestMethod.POST)
	public ModelAndView insert(MessageCommand messageCommand, HttpServletRequest request){
		String stu_num = (String)request.getSession().getAttribute("msg");

		String send = studentdao.selectOne2(stu_num);
		String receive = studentdao.selectOne2(messageCommand.getReceive());
		
		messageCommand = new MessageCommand(messageCommand.getM_num(), send, receive, messageCommand.getSubject(), messageCommand.getContent(), null, null);
		messagedao.insert(messageCommand);
		
		List<MessageCommand> messageList = messagedao.selectList2(stu_num);
		
		return new ModelAndView("main/message", "messageList", messageList);
	}
	
	@RequestMapping(value="/main/message_del", method=RequestMethod.POST)
	public ModelAndView message_del(MessageCommand messageCommand, HttpServletRequest request){
		String stu_num = (String)request.getSession().getAttribute("msg");
		
		int m_num = messageCommand.getM_num();
		System.out.println(m_num);
		
		messagedao.delete(m_num);
		
		List<MessageCommand> messageList = messagedao.selectList2(stu_num);
		
		return new ModelAndView("main/message", "messageList", messageList);
	}
	
	
}
