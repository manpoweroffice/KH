package register;

public class Class_BasketBean {
	private String lecture_code;
	private String prof_code;
	private String lecture_name;
	private String diagnosis;
	private int grade;
	private int time;
	private String prof_name;
	private String lecture_time;
	private int application;
	private int appli_limit;

	public Class_BasketBean(){}
	public Class_BasketBean(String lecture_code,String prof_code,String lecture_name,String diagnosis,int grade,int time,String prof_name,String lecture_time,int application,int appli_limit){
		this.lecture_code=lecture_code;
		this.prof_code=prof_code;
		this.lecture_name=lecture_name;
		this.diagnosis=diagnosis;
		this.grade=grade;
		this.time=time;
		this.prof_name=prof_name;
		this.lecture_time=lecture_time;
		this.application=application;
		this.appli_limit=appli_limit;
	}
	public String getLecture_code() {
		return lecture_code;
	}

	public void setLecture_code(String lecture_code) {
		this.lecture_code = lecture_code;
	}

	public String getProf_code() {
		return prof_code;
	}

	public void setProf_code(String prof_code) {
		this.prof_code = prof_code;
	}

	public String getLecture_name() {
		return lecture_name;
	}

	public void setLecture_name(String lecture_name) {
		this.lecture_name = lecture_name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getProf_name() {
		return prof_name;
	}

	public void setProf_name(String prof_name) {
		this.prof_name = prof_name;
	}

	public String getLecture_time() {
		return lecture_time;
	}

	public void setLecture_time(String lecture_time) {
		this.lecture_time = lecture_time;
	}

	public int getApplication() {
		return application;
	}

	public void setApplication(int application) {
		this.application = application;
	}

	public int getAppli_limit() {
		return appli_limit;
	}

	public void setAppli_limit(int appli_limit) {
		this.appli_limit = appli_limit;
	}
	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
}
