package register;

import java.sql.Timestamp;

public class AttendanceVo {

	private String stu_num;
	private String stu_name;
	private String attendance;
	private String lecture_code;
	private Timestamp atd_date;
	public AttendanceVo(){}

	public AttendanceVo(String stu_num,String stu_name,String attendance,String lecture_code,Timestamp atd_date){
		this.stu_num=stu_num;
		this.stu_name=stu_name;
		this.attendance=attendance;
		this.lecture_code=lecture_code;
		this.atd_date=atd_date;
	}

	public String getLecture_code() {
		return lecture_code;
	}

	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public Timestamp getAtd_date() {
		return atd_date;
	}

	public void setAtd_date(Timestamp atd_date) {
		this.atd_date = atd_date;
	}
}
