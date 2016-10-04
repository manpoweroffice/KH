package register;

public class Reg_LectureVo {
	//학생이름 추가, 과목명추가
	private String stu_num; //학번
	private String stu_name; //학생명
	private String lecture_code; //강의코드
	private String lecture_name; //강의명
	private String term; //학기
	
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getLecture_name() {
		return lecture_name;
	}
	public void setLecture_name(String lecture_name) {
		this.lecture_name = lecture_name;
	}
	public Reg_LectureVo(){}
	public Reg_LectureVo(String stu_num,String stu_name,String lecture_code,String lecture_name,String term){
		this.stu_num=stu_num;
		this.stu_name=stu_name;
		this.lecture_code=lecture_code;
		this.lecture_name=lecture_name;
		this.term=term;
	}
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getLecture_code() {
		return lecture_code;
	}
	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
}
