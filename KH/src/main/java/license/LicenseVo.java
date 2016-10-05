package license;

import java.sql.Timestamp;

public class LicenseVo {
	
	private String stu_num; // 학번
	private String kinds; // 자격증 종류
	private String publisher; // 발행처
	private String dates; // 취득일
	private Timestamp reg_date; //등록일
	
	LicenseVo(){}
	
	public LicenseVo(String stu_num, String kinds, String publisher, String dates){
		super();
		this.stu_num = stu_num;
		this.kinds = kinds;
		this.publisher = publisher;
		this.dates = dates;
		
		 /*kinds, publisher, dates, evidence, fileName
			private String kinds, publisher, dates, evidence, fileName;
		    private MultipartFile uploadfile;*/
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}
	
	public Timestamp getReg_date() {
		return reg_date;
	}

	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "LicenseVo [stu_num=" + stu_num + ", kinds=" + kinds + ", publisher=" + publisher + ", dates=" + dates
				+ ", reg_date=" + reg_date + "]";
	}
}