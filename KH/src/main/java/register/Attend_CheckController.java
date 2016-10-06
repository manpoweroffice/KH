package register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Attend_CheckController {

	public Class_BasketDAO attendDao;

	public void setAttendDao(Class_BasketDAO attendDao) {
		this.attendDao = attendDao;
	}

	public Map getAtdDate(String term){
		String termStrDate="";
		String atdweek="";
		Calendar cal=Calendar.getInstance();
		HashMap<String,Date> map=new HashMap();
		SimpleDateFormat simple=new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		if(term.equals("1")){
			termStrDate=cal.get(cal.YEAR)+"-03-01";
		}else{
			termStrDate=cal.get(cal.YEAR)+"-09-01";
		}
		try {
			date=simple.parse(termStrDate);
			cal.setTime(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=16;i++){
			atdweek=i+"ÁÖÂ÷";
			map.put(atdweek, cal.getTime());
			cal.add(Calendar.DATE, 7);
		}
		return map;
	}

	@RequestMapping("/register/Attend_Check.do")
	public ModelAndView attendCheck(@RequestParam("lecture_code")String lect){
		ModelAndView mav= new ModelAndView();
		List<Reg_LectureVo> listRecLect= attendDao.selectRegLect(lect);
		HashMap map= new HashMap<>();
		for(Reg_LectureVo regLect:listRecLect){
			map=(HashMap) getAtdDate(regLect.getTerm());
		}
		mav.setViewName("register/Attend_Check");
		mav.addObject("listRecLect", listRecLect);
		mav.addObject(map);
		return mav;
	}
}
