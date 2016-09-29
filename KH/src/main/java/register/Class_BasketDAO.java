package register;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class Class_BasketDAO extends SqlSessionDaoSupport{
	
	public List<Class_BasketBean> selectAll() {
		return getSqlSession().selectList("classMapper.selectAll");
	}
	
	public int insert() {
		return getSqlSession().insert("classMapper.test");
	}
}
