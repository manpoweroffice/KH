package profile;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class imageUploadController {

	@Resource(name="imageView")
	ImageView imageView;

	@Autowired 
	ImageService imageService;
	
	@RequestMapping("/uploadPage")
	private String uploadView(){
		return "upload";
	}
	@RequestMapping(value="/profile/fileupload.do",method=RequestMethod.GET)
	private String form() {
		return "profile/fileupload";
	}
	@RequestMapping(value="/profile/fileupload.do",method=RequestMethod.POST)
	private String upload(@RequestParam MultipartFile imageFile, ModelMap modelMap) {
		ImageFile fileInfo = imageService.save(imageFile);
		
		modelMap.put("imageFile", fileInfo);
		
		return "profile/fileupload";
	}
	@RequestMapping("/image/{imageId}")
	private ImageView getImage(@PathVariable String imageId, ModelMap modelMap) {
		ImageFile imageFile = imageService.get(imageId);
		
		modelMap.put("imageFile", imageFile);
		
		return imageView;
	}
	
}