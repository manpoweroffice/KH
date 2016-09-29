package self;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SelfDAO extends SqlSessionDaoSupport{

	public Self selectOne(String stu_num){
		return getSqlSession().selectOne("self.selectOne", stu_num);
	}
	
	public int insertSelf(Self self){
		return getSqlSession().insert("self.insert", self);
	}
	
	public int update(Self self){
		return getSqlSession().update("self.update", self);
	}
	
}
