package main;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;
import profile.StudentDao;

@Controller
public class HeaderController {
	private MessageDAO messagedao;
	
	public void setMessagedao(MessageDAO messagedao) {
		this.messagedao = messagedao;
	}
	
	private StudentDao studentdao;
	public void setStudentdao(StudentDao studentdao) {
		this.studentdao = studentdao;
	}
	
	@RequestMapping(value="header")
	public String city() throws Exception{
		return "template/header";
	}
	
	@RequestMapping(value="header", method=RequestMethod.POST)
	public void messageList(HttpServletResponse resp, HttpServletRequest request) throws Exception{
		String stu_num = (String)request.getSession().getAttribute("msg");
		int num=0;
		if(stu_num!=null){
		String receive = studentdao.selectOne2(stu_num);
		num = messagedao.selectOne3(receive);
		}
		
		JSONObject jso = new JSONObject(); //JASON 객체 생성
		jso.put("data", num);

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(jso.toString());//put.print 내용을 ajax의 dataType이 json에게 데이터 쏴줌
	}

/*	@RequestMapping(value="main/header", method=RequestMethod.POST)
	public String messageList(HttpServletResponse resp, HttpServletRequest request) throws Exception{
		request.getSession().setAttribute("stu_num", "130101");
		String stu_num = (String)request.getSession().getAttribute("stu_num");
		
		String receive = studentdao.selectOne2(stu_num);
		List<MessageCommand> messageList = messagedao.selectList3(receive);
		
		int a = messagedao.selectOne3(receive);
		
		return "main/header";
	}*/
}
