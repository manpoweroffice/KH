package job;

import java.sql.Timestamp;

public class BusinessVo {

	private int num;//�۹�ȣ
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
	private String bussnm; //ȸ���
	private String cer; //�ڰݿ��
	private String rel; //��������
	private String sar; //����
	private String content;//�� ����
	private Timestamp reg_date; //�����
	
	public BusinessVo(){}
	
	public BusinessVo(int num,String bussnm,String cer,String rel,String sar,String content,Timestamp reg_date){
		this.num=num;
		this.bussnm=bussnm;
		this.cer=cer;
		this.rel=rel;
		this.sar=sar;
		this.content=content;
		this.reg_date=reg_date;
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
	public String getSar() {
		return sar;
	}
	public void setSar(String sar) {
		this.sar = sar;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}


}
