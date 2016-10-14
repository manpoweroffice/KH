package scholarship;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import profile.StudentCommand;
  
public class ScholarDao extends SqlSessionDaoSupport{
	
	public List<ScholarCommand> select_sch(String stu_num){
		return getSqlSession().selectList("stuInfo.select_sch", stu_num);
	}
	 
	public StudentCommand select_one(List<ScholarCommand> schcommand) {
		return getSqlSession().selectOne("stuInfo.select_one", schcommand);
	}

}
