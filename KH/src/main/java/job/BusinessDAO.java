package job;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BusinessDAO extends SqlSessionDaoSupport{

	public List<BusinessVo> getBussList(Map<String,Object> map){
		return getSqlSession().selectList("job.listjob",map);
	}
	
	public BusinessController getBussOne(int num){
		return getSqlSession().selectOne("job.bussOne",num);
	}
	
	public int insertBuss(BusinessController buss){
		return getSqlSession().insert("job.insertBuss",buss); 
	}
	public int updateBuss(BusinessController buss){
		return getSqlSession().update("job.updateBuss",buss);
	}
	public int deleteBuss(int num){
		return getSqlSession().delete("job.deleteBuss", num);
	}
	public int bussCount(Map<String,Object> map){
		return getSqlSession().selectOne("job.selectCount", map);
	}
}
