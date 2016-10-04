package license;
 
import org.springframework.web.multipart.MultipartFile;
 
public class LicenseDTO {
	
   	private String kinds, publisher, dates, evidence, fileName;
    private MultipartFile uploadfile;
	
    LicenseDTO(){}
    
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
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	@Override
	public String toString() {
		return "LicenseDTO [kinds=" + kinds + ", publisher=" + publisher + ", dates=" + dates + ", evidence=" + evidence
				+ ", fileName=" + fileName + ", uploadfile=" + uploadfile + "]";
	}
}