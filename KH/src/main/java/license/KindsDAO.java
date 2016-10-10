package license;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.support.SqlSessionDaoSupport;


public class KindsDAO  extends SqlSessionDaoSupport {
	
	public List<KindsVo> getJobList(String jobcode){
		List<KindsVo> jobList =  new ArrayList<KindsVo>();
		System.out.println(jobcode);
		jobList = getSqlSession().selectList("license.getJobList",jobcode);

		return jobList;
	}
	
}
