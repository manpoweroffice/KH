package main;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class LoginDAO extends SqlSessionDaoSupport {
	public int checkMember(String stu_num, String pwd ){
		LoginCommand loc = new LoginCommand();
		loc.setStu_num(stu_num);
		loc.setPwd(pwd);
		System.out.println("������ 2");
		
		int checkMember = getSqlSession().selectOne("login.checkmember",loc);
		System.out.println("���൵�� 3");
		
		
		return checkMember;
	}
	
	
	
	

} 
