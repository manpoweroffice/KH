package license;

public class AwardVo {
	private String stu_num; //학번
	private String awa_name; // 수상종류
	private String awa_grade; // 등급 (금,은,동)
	private String awa_dates; // 수여날짜
	private String awa_indst; // 수여기관
	
	AwardVo(){}
	
	public AwardVo(String stu_num, String awa_name, String awa_grade, String awa_dates, String awa_indst){
		super();
		this.stu_num = stu_num;
		this.awa_indst = awa_indst;
		this.awa_name = awa_name;
		this.awa_grade = awa_grade;
		this.awa_indst = awa_indst;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public String getAwa_name() {
		return awa_name;
	}

	public void setAwa_name(String awa_name) {
		this.awa_name = awa_name;
	}

	public String getAwa_grade() {
		return awa_grade;
	}

	public void setAwa_grade(String awa_grade) {
		this.awa_grade = awa_grade;
	}

	public String getAwa_dates() {
		return awa_dates;
	}

	public void setAwa_dates(String awa_dates) {
		this.awa_dates = awa_dates;
	}

	public String getAwa_indst() {
		return awa_indst;
	}

	public void setAwa_indst(String awa_indst) {
		this.awa_indst = awa_indst;
	}

	@Override
	public String toString() {
		return "AwardVo [stu_num=" + stu_num + ", awa_name=" + awa_name + ", awa_grade=" + awa_grade + ", awa_dates="
				+ awa_dates + ", awa_indst=" + awa_indst + "]";
	}
	
	
}
