package profile;

public class UploadCommand {
	private String stu_num;
	private String file_name;
	private String path;
	private String type;
	
	public UploadCommand(String stu_num, String file_name, String path, String type) {
		super();
		this.stu_num = stu_num;
		this.file_name = file_name;
		this.path = path;
		this.type = type;
	}
	
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
