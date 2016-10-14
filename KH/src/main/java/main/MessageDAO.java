package main;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MessageDAO extends SqlSessionDaoSupport {

	public List<MessageCommand> selectList(String stu_num){
		return getSqlSession().selectList("message.selectList", stu_num);
	}
	
	public List<MessageCommand> selectList2(String stu_num){
		return getSqlSession().selectList("message.selectList2", stu_num);
	}
	
	public List<MessageCommand> selectList3(String stu_num){
		return getSqlSession().selectList("message.selectList3", stu_num);
	}
	
	public int selectOne3(String stu_num){
		return getSqlSession().selectOne("message.selectOne3", stu_num);
	}
	
	public MessageCommand selectOne(int m_num){
		return getSqlSession().selectOne("message.selectOne", m_num);
	}
	
	public int update(MessageCommand messageCommand){
		return getSqlSession().update("message.update", messageCommand);
	}
	
	public int insert(MessageCommand messageCommand){
		return getSqlSession().insert("message.insert", messageCommand);
	}
	
	public int delete(int m_num){
		return getSqlSession().delete("message.delete", m_num);
	}
}
