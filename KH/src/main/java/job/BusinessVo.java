package job;

import java.sql.Timestamp;

public class BusinessVo {

	private int num;//글번호
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;   
	}
	private String bussnm; //회사명
	private String cer; //자격요건
	private String rel; //관련직종
	private String sal; //연봉
	private String content;//글 내용
	private Timestamp reg_date; //등록일
	
	public BusinessVo(){}
	
	public BusinessVo(int num,String bussnm,String cer,String rel,String sal,String content){
		super();
		this.num=num;
		this.bussnm=bussnm;
		this.cer=cer;
		this.rel=rel;
		this.sal=sal;
		this.content=content;
	}
	
	public String getBussnm() {
		return bussnm;
	}
	public void setBussnm(String bussnm) {
		this.bussnm = bussnm;
	}
	public String getCer() {
		return cer;
	}
	public void setCer(String cer) {
		this.cer = cer;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "BusinessVo [num=" + num + ", bussnm=" + bussnm + ", cer=" + cer + ", rel=" + rel + ", sal=" + sal
				+ ", content=" + content + ", reg_date=" + reg_date + "]";
	}


}
