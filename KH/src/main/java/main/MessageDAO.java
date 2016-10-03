package main;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MessageDAO extends SqlSessionDaoSupport {

	public List<MessageCommand> selectList(String stu_num){
		return getSqlSession().selectList("message.selectList", stu_num);
	}
}
