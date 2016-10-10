package license;

public class EducationVo {
	private String stu_num; // ÇÐ¹ø
	private String edu_name; // ±³À°°ú¸ñ
	private String edu_indst; // ±³À°±â°ü
	private String edu_con; // ±³À°³»¿ë 
	private String edu_dates; // ±â°£
	
	EducationVo(){}
	
	public EducationVo(String stu_num, String edu_name, String edu_indst, String edu_con, String edu_dates){
		super();
		this.stu_num = stu_num;
		this.edu_name = edu_name;
		this.edu_indst = edu_indst;
		this.edu_con = edu_con;
		this.edu_dates = edu_dates;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public String getEdu_name() {
		return edu_name;
	}

	public void setEdu_name(String edu_name) {
		this.edu_name = edu_name;
	}

	public String getEdu_indst() {
		return edu_indst;
	}

	public void setEdu_indst(String edu_indst) {
		this.edu_indst = edu_indst;
	}

	public String getEdu_con() {
		return edu_con;
	}

	public void setEdu_con(String edu_con) {
		this.edu_con = edu_con;
	}

	public String getEdu_dates() {
		return edu_dates;
	}

	public void setEdu_dates(String edu_dates) {
		this.edu_dates = edu_dates;
	}

	@Override
	public String toString() {
		return "EducationVo [stu_num=" + stu_num + ", edu_name=" + edu_name + ", edu_indst=" + edu_indst + ", edu_con="
				+ edu_con + ", edu_dates=" + edu_dates + "]";
	}
	
}
