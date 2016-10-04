package certificate;

public class CertificateCommand {
	private String stu_num; /* 학번 */
	private String department; /* 학과 */
	private String major; /* 전공 */
	private String ko_name; /* 이름 */
	private String en_name; /* 영어이름 */
	private String birthday; /* 생년월일 */
	private String gradu_date; /*졸업날짜*/
	private String college_state; /*학적상태*/
	
	public CertificateCommand(){  
		
	}
	
	public CertificateCommand(String stu_num, String department, String major, String ko_name, String en_name,
			String birthday, String gradu_date, String college_state) {
		super();
		this.stu_num = stu_num;
		this.department = department;
		this.major = major;
		this.ko_name = ko_name;
		this.en_name = en_name;
		this.birthday = birthday;
		this.gradu_date=gradu_date;
		this.college_state=college_state;
	}

	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
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

	public String getGradu_date() {
		return gradu_date;
	}

	public void setGradu_date(String gradu_date) {
		this.gradu_date = gradu_date;
	}

	public String getCollege_state() {
		return college_state;
	}

	public void setCollege_state(String college_state) {
		this.college_state = college_state;
	}

	
}