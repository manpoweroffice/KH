package job;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SchedulerController {
	
	@ModelAttribute
	public SchedulerVo backing(){
		return new SchedulerVo();
	}
	private SchedulerDAO scheduleDao;
	
	
	public void setScheduleDao(SchedulerDAO scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@RequestMapping("/job/scheduler.do")
	public String scheduleform(){
		return "job/scheduler";
	}
	
	@RequestMapping(value="/job/writescheduler.do",method=RequestMethod.GET)
	public String writeform(){
		return "job/write/writescheduler";
	}
	@RequestMapping(value="/job/writescheduler.do",method=RequestMethod.POST)
	public String writeschedule(SchedulerVo schedule){
		System.out.println(schedule.toString());
		int x= scheduleDao.insertSchedule(schedule);
		if(x>0){
			System.out.println("인설트성공");
		}else
			System.out.println("실패");
		return "job/write/success";
	}
	
	
} 
