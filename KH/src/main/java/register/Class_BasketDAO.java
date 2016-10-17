package register;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Class_BasketDAO extends SqlSessionDaoSupport{
	
	//�̸���� -�������ñⰣ 
	public List<Class_BasketBean> selectMajor(Map dept){
		return getSqlSession().selectList("classMapper.selectMajor", dept);
	}
	//�̸����- ��Ÿ ���ñⰣ
	public List<Class_BasketBean> selectMinor(Map dept){
		return getSqlSession().selectList("classMapper.selectMinor",dept);
	}
	//�̸���� - ������Ͽ� �ִ� �͵��� �������
	public List<Class_BasketBean> checklist(String stu_num){
		return getSqlSession().selectList("classMapper.checkList",stu_num);
	}
	//���࿡ ��� �� ��û �л��� ���� Ʈ����� ����
	public void combination(String stu_num,List<String> lectcodeList)throws SQLException{
		
		HashMap<String, Object> map= new HashMap<String,Object>();
		Iterator<String> iter= lectcodeList.iterator();
		map.put("stu_num", stu_num);
		while(iter.hasNext()){
			String lecture_code=iter.next();
			map.put("lecture_code", lecture_code);
			int x= getSqlSession().selectOne("classMapper.checkinsert",map);
			if(x==0){
		getSqlSession().insert("classMapper.insertReserve", map);
		System.out.println("�μ�Ʈ��");
		getSqlSession().update("classMapper.updateAppli", lecture_code);
		System.out.println("������Ʈ��");
		}
		}	
	}
	public int insertReg(Reg_LectureVo reg_Lecture){
		return getSqlSession().insert("classMapper.insertRegLect",reg_Lecture);
	}
	//�ؿ�-�⼮�κ�
	//�⼮�� �μ�Ʈ
	public int insertAttend(AttendanceVo attend){
		return getSqlSession().insert("classMapper.insertAttend",attend);
	}
	//�⼮�� ������Ʈ
	public int updateAttend(AttendanceVo attend){
		return getSqlSession().update("classMapper.updateAttend", attend);
	}
	//������ ���� �Ѹ������� �����ڵ带 �������
	public List<Reg_LectureVo> selectLecCode(String prof_code){
		return getSqlSession().selectList("classMapper.selectLecCode",prof_code);
	}
	//�л����� ����
	public int countLec(Reg_LectureVo reg_lecture){
		return getSqlSession().selectOne("classMapper.countLec", reg_lecture);
	}
	
	//
	public List<Reg_LectureVo> selectRegLect(String lect){
		return getSqlSession().selectList("classMapper.selectRegLect",lect);
	}
	
	// �⼮�� 
	public List<AttendanceVo> selectAttend(AttendanceVo attend){
		return getSqlSession().selectList("classMapper.selectAttend", attend);
	}
   
}
