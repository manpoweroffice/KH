package self;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SelfDAO extends SqlSessionDaoSupport{

	public List<SelfCommand> selectAllSelf(){
		return getSqlSession().selectList("selfCon.selectAll");
	}
	
	public int insertSelf(SelfCommand selfCommand){
		System.out.println("이상 발생!!!!!!!!!");
		return getSqlSession().insert("selfCon.insert", selfCommand);
	}
	
	public int updateSelf(SelfCommand selfCommand){
		return getSqlSession().update("selfCon.update", selfCommand);
	}

	
}
