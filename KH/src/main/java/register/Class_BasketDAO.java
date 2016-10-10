package register;

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
