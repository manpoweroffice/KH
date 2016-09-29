package util;

import org.springframework.web.multipart.MultipartFile;

public class PhotoVo {

	//photo_uploader.html페이지의 form 태그내에 존재하는 file태그의 name 명과 일치시켜줌
	private MultipartFile Filedata;
	//callback URL
	private String callback;
	
	private String callback_func;

	public MultipartFile getFiledata() {
		return Filedata;
	}

	public void setFiledata(MultipartFile filedata) {
		Filedata = filedata;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getCallback_func() {
		return callback_func;
	}

	public void setCallback_func(String callback_func) {
		this.callback_func = callback_func;
	}
	
	
}
