package profile;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDao extends SqlSessionDaoSupport {

	public StudentCommand selectOne(String stu_num) {
		return getSqlSession().selectOne("stuInfo.selectOne", stu_num);
	}
	
	public void update(StudentCommand command){
		getSqlSession().update("stuInfo.update",command);
	}

}
       