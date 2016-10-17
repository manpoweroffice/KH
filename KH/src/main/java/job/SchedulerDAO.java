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
}
