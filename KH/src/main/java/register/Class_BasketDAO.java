package register;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Class_BasketDAO extends SqlSessionDaoSupport{
	
	//미리담기 -전공선택기간 
	public List<Class_BasketBean> selectMajor(Map dept){
		return getSqlSession().selectList("classMapper.selectMajor", dept);
	}
	//미리담기- 기타 선택기간
	public List<Class_BasketBean> selectMinor(Map dept){
		return getSqlSession().selectList("classMapper.selectMinor",dept);
	}
	//미리담기 - 담은목록에 있는 것들을 가지고옴
	public List<Class_BasketBean> checklist(String stu_num){
		return getSqlSession().selectList("classMapper.checkList",stu_num);
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
