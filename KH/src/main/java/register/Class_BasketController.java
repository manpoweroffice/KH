package register;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.sf.json.JSONObject;

@Controller
public class Class_BasketController {

	Class_BasketDAO classDAO;
	String stu_num="1000101";
	public void setClassDAO(Class_BasketDAO classDAO) {
		this.classDAO = classDAO;
	}
	public HashMap<String,Object> term2(String stu_num){
		String term="2";
		String hakcode= stu_num.substring(2, 5);
		HashMap<String,Object> map= new HashMap<String,Object>();
		List<Class_BasketBean> list=classDAO.checklist(stu_num);
			map.put("term", term);
		map.put("hakcode",hakcode);		
		map.put("list", list);
		return map;
	}
	@RequestMapping("/register/classbasket.do")
	public String noform(){
		return "register/classbasket";
	}
	@RequestMapping(value="/register/class_basket.do",method=RequestMethod.GET)
	public String form()throws Exception{
		return "register/Class_Basket";
	}
	
	@RequestMapping(value="/register/lectureList.do" ,method=RequestMethod.POST)
	public void lectureList(HttpServletResponse resp)throws Exception{
		HashMap<String, Object> map= new HashMap<String,Object>();
		map=term2(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMajor(map);
		JSONObject jso=new JSONObject();
		jso.put("data",searchList);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out =resp.getWriter();
		out.print(jso.toString());
	}
	@RequestMapping(value="/register/reserveList.do" ,method=RequestMethod.POST)
	public void reserveList(HttpServletResponse resp)throws Exception{
		List<Class_BasketBean> checkList=classDAO.checklist(stu_num);
		JSONObject jso=new JSONObject();
		jso.put("data1",checkList);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out =resp.getWriter();
		out.print(jso.toString());
		
	}
	@RequestMapping(value="/register/class_basket.do",method=RequestMethod.POST)
	public String submit(@RequestParam("lecture_code")List<String> lecture_code) {
		
		try{
			classDAO.combination(stu_num,lecture_code);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return "register/Class_Basket";
	}
}
