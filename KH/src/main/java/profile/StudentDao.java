package profile;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDao extends SqlSessionDaoSupport {

	public StudentCommand selectAll(String stu_num){
		return getSqlSession().selectOne("stuInfo.selectAll", stu_num);
	}
	public StudentCommand select(String stu_num) {
		return getSqlSession().selectOne("stuInfo.select", stu_num);
	}
	
	public String selectOne2(String stu_num) {
		return getSqlSession().selectOne("stuInfo.selectOne2", stu_num);
	}
	
	public int check(String stu_num){
		return getSqlSession().selectOne("stuInfo.check", stu_num);
	}
	
	public void update(StudentCommand command){
		getSqlSession().update("stuInfo.update",command);
	}
	
	public int insertImg(Upload uplaod){
	      return getSqlSession().insert("stuInfo.insertImg", uplaod);
	}
		
	public void updateImg(Upload uplaod){
		getSqlSession().update("stuInfo.updateImg",uplaod);
	}
	

}
       