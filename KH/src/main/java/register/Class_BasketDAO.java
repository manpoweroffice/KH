package register;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
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
	//예약에 담기 및 신청 학생수 증가 트랜잭션 적용
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
		System.out.println("인설트끝");
		getSqlSession().update("classMapper.updateAppli", lecture_code);
		System.out.println("업데이트끝");
		}
		}	
	}
	//예약에 담기 및 신청 학생수 증가 트랜잭션 적용
		public void combination2(String stu_num,List<String> lectcodeList)throws SQLException{
			
			HashMap<String, Object> map= new HashMap<String,Object>();
			Iterator<String> iter= lectcodeList.iterator();
			map.put("stu_num", stu_num);
			while(iter.hasNext()){
				String lecture_code=iter.next();
				map.put("lecture_code", lecture_code);
				int x= getSqlSession().selectOne("classMapper.checkinsert",map);
				if(x!=0){
			getSqlSession().delete("classMapper.deleteReserve", map);
			getSqlSession().update("classMapper.updateAppli2", lecture_code);
			System.out.println("업데이트끝");
			} 
			}	
		}
	public int insertReg(Reg_LectureVo reg_Lecture){
		return getSqlSession().insert("classMapper.insertRegLect",reg_Lecture);
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
