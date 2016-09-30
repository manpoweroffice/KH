package self;

import java.sql.Timestamp;

public class Self {
	private String stu_num;
	private String content1;
	private String content2;
	private String content3;
	private String content4;
	private Timestamp s_date;
	
	public Self(){}
	
	public Self(String stu_num, String content1, String content2, String content3, String content4){
		this.stu_num=stu_num;
		this.content1=content1;
		this.content2=content2;
		this.content3=content3;
		this.content4=content4;
	}
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getContent1() {
		return content1;
	}
	public void setContent1(String content1) {
		this.content1 = content1;
	}
	public String getContent2() {
		return content2;
	}
	public void setContent2(String content2) {
		this.content2 = content2;
	}
	public String getContent3() {
		return content3;
	}
	public void setContent3(String content3) {
		this.content3 = content3;
	}
	public String getContent4() {
		return content4;
	}
	public void setContent4(String content4) {
		this.content4 = content4;
	}
	public Timestamp getS_date() {
		return s_date;
	}
	public void setS_date(Timestamp s_date) {
		this.s_date = s_date;
	}
	
}
