package profile;

public class StudentCommand {
	private String stu_num; /* 학번 */
	private String pwd; /* 비밀번호 */
	private String department; /* 학과 */
	private String major; /* 전공 */
	private String ko_name; /* 이름 */
	private String en_name; /* 영어이름 */
	private String birthday; /* 생년월일 */
	private String phone;/* 전화번호 */
	private String h_phone; /* 휴대전화 */
	private String p_check; /* 공개여부 */
	private String address; /* 주소 */
	private String mil_service; /* 병역여부 */
	private String last_rank; /* 최종계급 */
	private String tour_of_duty; /* 복무기간 */
	private String exemp; /* 면제사유 */
	private String h_tob; /* 취업희망업종 */
	private String h_job; /* 취업희망직업 */
	private String h_location; /* 희망취업지역 */
	private String h_income; /* 희망연봉 */
	private String college_state;/*학적상태*/
	public StudentCommand(){
	
	}
	public StudentCommand(String stu_num, String pwd, String department, String major, String ko_name, String en_name,
			String birthday, String phone, String h_phone, String p_check, String address, String mil_service,
			String last_rank, String tour_of_duty, String exemp, String h_tob, String h_job, String h_location,
			String h_income) {
		super();
		this.stu_num = stu_num;
		this.pwd = pwd;
		this.department = department;
		this.major = major;
		this.ko_name = ko_name;
		this.en_name = en_name;
		this.birthday = birthday;
		this.phone = phone;
		this.h_phone = h_phone;
		this.p_check = p_check;
		this.address = address;
		this.mil_service = mil_service;
		this.last_rank = last_rank;
		this.tour_of_duty = tour_of_duty;
		this.exemp = exemp;
		this.h_tob = h_tob;
		this.h_job = h_job;
		this.h_location = h_location;
		this.h_income = h_income;
	}
	public StudentCommand( String stu_num,String p_check,String college_state,String mil_service,String last_rank, String tour_of_duty, String exemp
			,String h_tob,String h_job,String h_location,String h_income) {
		super();
		this.stu_num = stu_num;
		this.p_check = p_check;
		this.college_state=college_state;
		this.mil_service = mil_service;
		this.last_rank = last_rank;
		this.tour_of_duty = tour_of_duty;
		this.exemp = exemp;
		this.h_tob = h_tob;
		this.h_job = h_job;
		this.h_location = h_location;
		this.h_income = h_income;
	}
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getKo_name() {
		return ko_name;
	}
	public void setKo_name(String ko_name) {
		this.ko_name = ko_name;
	}
	public String getEn_name() {
		return en_name;
	}
	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getH_phone() {
		return h_phone;
	}
	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}
	public String getP_check() {
		return p_check;
	}
	public void setP_check(String p_check) {
		this.p_check = p_check;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMil_service() {
		return mil_service;
	}
	public void setMil_service(String mil_service) {
		this.mil_service = mil_service;
	}
	public String getLast_rank() {
		return last_rank;
	}
	public void setLast_rank(String last_rank) {
		this.last_rank = last_rank;
	}
	public String getTour_of_duty() {
		return tour_of_duty;
	}
	public void setTour_of_duty(String tour_of_duty) {
		this.tour_of_duty = tour_of_duty;
	}
	public String getExemp() {
		return exemp;
	}
	public void setExemp(String exemp) {
		this.exemp = exemp;
	}
	public String getH_tob() {
		return h_tob;
	}
	public void setH_tob(String h_tob) {
		this.h_tob = h_tob;
	}
	public String getH_job() {
		return h_job;
	}
	public void setH_job(String h_job) {
		this.h_job = h_job;
	}
	public String getH_location() {
		return h_location;
	}
	public void setH_location(String h_location) {
		this.h_location = h_location;
	}
	public String getH_income() {
		return h_income;
	}
	public void setH_income(String h_income) {
		this.h_income = h_income;
	}
	public String getCollege_state() {
		return college_state;
	}
	public void setCollege_state(String college_state) {
		this.college_state = college_state;
	}
	
	
	

}