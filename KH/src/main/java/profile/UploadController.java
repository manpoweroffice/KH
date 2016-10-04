package profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {
	
	@RequestMapping(value = "/profile/upload.do", method = RequestMethod.GET)
	public String form() {
			return "profile/upload";
		}

	@RequestMapping(value = "/profile/uploadImage.do", method = RequestMethod.POST)
	public String submitReport2(MultipartHttpServletRequest request) {
			String studentNumber = request.getParameter("studentNumber");
			MultipartFile report = request.getFile("report");
			return "profile/submissionComplete";
		}

}
