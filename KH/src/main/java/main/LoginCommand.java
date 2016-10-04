package main;

public class LoginCommand {

	private String stu_num;
	private String pwd;
	private String ko_name;
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
	public String getKo_name() {
		return ko_name;
	}
	public void setKo_name(String ko_name) {
		this.ko_name = ko_name;
	}
	@Override
	public String toString() {
		return "LoginCommand [stu_num=" + stu_num + ", pwd=" + pwd + ", ko_name=" + ko_name + "]";
	}
	
	

	
	
	

	
	
}
