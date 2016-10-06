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
	
	//준영-출석부분
	//출석부 인설트
	public int insertAttend(AttendanceVo attend){
		return getSqlSession().insert("classMapper.insertAttend",attend);
	}
	//출석부 업데이트
	public int updateAttend(AttendanceVo attend){
		return getSqlSession().update("classMapper.updateAttend", attend);
	}
	//교수별 과목 뿌리기위해 과목코드를 가지고옴
	public List<Reg_LectureVo> selectLecCode(String prof_code){
		return getSqlSession().selectList("classMapper.selectLecCode",prof_code);
	}
	//학생수를 구함
	public int countLec(Reg_LectureVo reg_lecture){
		return getSqlSession().selectOne("classMapper.countLec", reg_lecture);
	}
	
	//
	public List<Reg_LectureVo> selectRegLect(String lect){
		return getSqlSession().selectList("classMapper.selectRegLect",lect);
	}
	
	// 출석부 
	public List<AttendanceVo> selectAttend(AttendanceVo attend){
		return getSqlSession().selectList("classMapper.selectAttend", attend);
	}
   
}
