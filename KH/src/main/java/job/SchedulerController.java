package job;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ModelAndView writeform(@RequestParam("start")String start){
		ModelAndView mav= new ModelAndView("job/write/writescheduler");
		mav.addObject("start", start);
		return mav;
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
	@RequestMapping(value="/job/dtlschedule.do",method=RequestMethod.GET)
	public ModelAndView dtlform(@RequestParam("title")String title){
		ModelAndView mav= new ModelAndView("job/write/dtlcheduler");
		SchedulerVo schedule=scheduleDao.dtlSchedule(title);
		schedule.setStartevent(schedule.getStartevent().substring(0, 11));
		schedule.setEndevent(schedule.getEndevent().substring(0, 11));
		mav.addObject("schedule", schedule);
		return mav;
	}
	@RequestMapping(value="/job/dtlschedule.do",method=RequestMethod.POST)
	public String dtlupdate(@ModelAttribute("schedule")SchedulerVo schedule){
		String e="";
		int x= scheduleDao.dtlUpdate(schedule);
		if(x==0){
			e="/job/write/fail";
		}else{
			e="job/write/success";
		}
		return e;
	}
	@RequestMapping("/job/deleteSchedule.do")
	public String dtlDelte(@RequestParam("title")String title){
		String e="";
		int x= scheduleDao.dtlDelete(title);
		if(x==0){
			e="/job/write/fail";
		}else{
			e="job/write/success";
		}
		return e;
	}
	@RequestMapping(value="/job/scheduleList.do",method=RequestMethod.POST)
	@ResponseBody
	public String scheduleList(HttpServletResponse resp)throws Exception{
		List<SchedulerVo> list= scheduleDao.selectSchedule();
		List ls= new ArrayList();
		
		for(SchedulerVo schedule:list){
			HashMap map =new HashMap();
			map.put("title", schedule.getTitle());
			System.out.println(schedule.getStartevent().substring(0, 11));
			map.put("start", schedule.getStartevent().substring(0, 11));
			map.put("end",schedule.getEndevent().substring(0, 11));
			ls.add(map);
		}
		
		JSONObject jso= new JSONObject();
		jso.put("list", ls);
		return jso.toString();
	}
} 
