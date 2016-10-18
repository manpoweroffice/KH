package job;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SchedulerDAO extends SqlSessionDaoSupport{

	public int insertSchedule(SchedulerVo schedule){
		return getSqlSession().insert("schedule.insert",schedule);
	}
	public List<SchedulerVo> selectSchedule(){
		return getSqlSession().selectList("schedule.selectList");
	}
	
	public SchedulerVo dtlSchedule(String title){
		return getSqlSession().selectOne("schedule.dtlSchedule",title);
	}
	public int dtlUpdate(SchedulerVo schedule){
		return getSqlSession().update("schedule.update", schedule);
	}
	public int dtlDelete(String title){
		return getSqlSession().delete("schedule.delete", title);
	}
}
