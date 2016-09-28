package self;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SelfDAO extends SqlSessionDaoSupport{

	public int insertSelf(Self self){
		return getSqlSession().insert("self.insertA", self);
	}
	
}
