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
