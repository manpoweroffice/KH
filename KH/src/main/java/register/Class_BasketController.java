package register;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Class_BasketController {

	Class_BasketDAO classDAO;
	
	public HashMap<String,Object> term1(String stu_num){
		String term="1";
		String hakcode= stu_num.substring(2, 5);
		HashMap<String,Object> map= new HashMap<String,Object>();
		List<Class_BasketBean> checklist=classDAO.checklist(stu_num);
		map.put("term", term);
		map.put("hakcode",hakcode);		
		map.put("list", checklist);
		return map;
	}
	
	public HashMap<String,Object> term2(String stu_num){
		String term="2";
		String hakcode= stu_num.substring(2, 5);
		HashMap<String,Object> map= new HashMap<String,Object>();
		List<Class_BasketBean> checklist=classDAO.checklist(stu_num);
		map.put("term", term);
		map.put("hakcode",hakcode);		
		map.put("list", checklist);
		return map;
	}
	public void setClassDAO(Class_BasketDAO classDAO) {
		this.classDAO = classDAO;
	}
	@RequestMapping("/register/classbasket.do")
	public String noform(){
		return "register/classbasket";
	}
	
	@RequestMapping(value = "/register/Class_BasketMajor1.do", method = RequestMethod.POST)
	public ModelAndView submit() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("register/Class_Basket");
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term1(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMajor(map);
		mav.addObject("searchList", searchList);
		mav.addObject(map);
		return mav;
	}
	@RequestMapping(value = "/register/Class_BasketMinor1.do", method = RequestMethod.POST)
	public ModelAndView submit1() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("register/Class_Basket");
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term1(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMinor(map);
		mav.addObject("searchList", searchList);
		mav.addObject(map);
		return mav;
	}
	
	@RequestMapping(value = "/register/Class_BasketMajor2.do", method = RequestMethod.POST)
	public ModelAndView submit2() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term2(stu_num);	
		List<Class_BasketBean> searchList = classDAO.selectMajor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
	@RequestMapping(value = "/register/Class_BasketMinor2.do", method = RequestMethod.POST)
	public ModelAndView submit3() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term2(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMinor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
	@RequestMapping(value = "/register/Class_BasketMajor1.do", method = RequestMethod.GET)
	public ModelAndView form() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term1(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMajor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
	@RequestMapping(value = "/register/Class_BasketMinor1.do", method = RequestMethod.GET)
	public ModelAndView form1() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term1(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMinor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
	
	@RequestMapping(value = "/register/Class_BasketMajor2.do", method = RequestMethod.GET)
	public ModelAndView form2() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term2(stu_num);	
		List<Class_BasketBean> searchList = classDAO.selectMajor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
	@RequestMapping(value = "/register/Class_BasketMinor2.do", method = RequestMethod.GET)
	public ModelAndView form3() {
		HashMap<String,Object> map= new HashMap<String,Object>();
		String stu_num="1000101";
		map=term2(stu_num);
		List<Class_BasketBean> searchList = classDAO.selectMinor(map);
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}
}
