package register;

public class Reserve_ListVo {

	private String stu_num;  //학번
	private String lecture_code; //강의코드
	
	public Reserve_ListVo(){}
	
	public Reserve_ListVo(String stu_num,String lecture_code){
			this.stu_num=stu_num;
			this.lecture_code=lecture_code;
	}
}
