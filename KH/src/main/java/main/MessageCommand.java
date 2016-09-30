package main;

public class MessageCommand {
	private int m_num;
	private String send;
	private String receive;
	private String subject;
	private String content;
	private String m_date;
	private String r_check;
	
	public MessageCommand(){}
	
	public MessageCommand(int m_num, String send, String receive, String subject, String content, String r_check) {
		super();
		this.m_num = m_num;
		this.send = send;
		this.receive = receive;
		this.subject = subject;
		this.content = content;
		this.r_check = r_check;
	}
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	public String getReceive() {
		return receive;
	}
	public void setReceive(String receive) {
		this.receive = receive;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getR_check() {
		return r_check;
	}
	public void setR_check(String r_check) {
		this.r_check = r_check;
	}
	
	
}
