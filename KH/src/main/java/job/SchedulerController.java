package job;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

@Controller
public class SchedulerController {

	private SchedulerDAO scheduleDao;
	
	
	public void setScheduleDao(SchedulerDAO scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@RequestMapping("/job/scheduler.do")
	public ModelAndView scheduleform(){
		ModelAndView mav= new ModelAndView();
		List<SchedulerVo> list= scheduleDao.selectSchedule();
		mav.addObject("list", list);
		mav.setViewName("job/scheduler");
		return mav;
	}
	
	@RequestMapping(value="/job/writescheduler.do",method=RequestMethod.GET)
	public String writeform(){
		return "job/write/writescheduler";
	}
	@RequestMapping(value="/job/writescheduler.do",method=RequestMethod.POST)
	public String writeschedule(@ModelAttribute("schedule")SchedulerVo schedule){
		System.out.println(schedule.toString());
		int x= scheduleDao.insertSchedule(schedule);
		if(x>0){
			System.out.println("인설트성공");
		}else
			System.out.println("실패");
		return "job/write/success";
	}
	
	@RequestMapping(value="/job/scheduleList.do",method=RequestMethod.POST)
	@ResponseBody
	public String scheduleList(HttpServletResponse resp)throws Exception{
		List<SchedulerVo> list= scheduleDao.selectSchedule();
		List ls= new ArrayList();

		System.out.println("ㅇㅇㅇ  "+list.size());
		
		for(SchedulerVo schedule:list){
			HashMap map =new HashMap();
			map.put("title", schedule.getTitle());
			map.put("start", schedule.getStartevent());
			map.put("end",schedule.getEndevent());
			ls.add(map);
		}
		
		JSONObject jso= new JSONObject();
		jso.put("list", ls);
		System.out.println(jso.toString());
		return jso.toString();
	}
} 
