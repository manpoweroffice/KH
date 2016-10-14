package scholarship;

public class ScholarCommand {
	       
	private String stu_num;
	private int year_s;
	private int term;
	private String scholar;
	private int amount;
	
	public ScholarCommand(){
		
	}
	public ScholarCommand(String stu_num,int year_s, int term, String scholar){
		super();
		this.stu_num = stu_num;
		this.year_s = year_s;
		this.term = term;
		this.scholar = scholar;
	}
	public ScholarCommand(String stu_num, int year_s, int term, String scholar, int amount) {
		super();
		this.stu_num = stu_num;
		this.year_s = year_s;
		this.term = term;
		this.scholar = scholar;
		this.amount = amount;
	}
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public int getYear_s() {
		return year_s;
	}
	public void setYear_s(int year_s) {
		this.year_s = year_s;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getScholar() {
		return scholar;
	}
	public void setScholar(String scholar) {
		this.scholar = scholar;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
