package license.controller;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
import license.model.LicenseDTO;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class LicenseController {
 
    @RequestMapping(value = "/career/license.do", method = RequestMethod.GET)
    public ModelAndView fileForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("career/licenseForm");
        return mv;
    }
     
    @RequestMapping(value = "/career/license.do", method = RequestMethod.POST)
    public String fileSubmit(LicenseDTO dto) {
        MultipartFile uploadfile = dto.getUploadfile();
        if (uploadfile != null) {
            String fileName = uploadfile.getOriginalFilename();
            dto.setFileName(fileName);
            try {
                // 1. FileOutputStream 사용
                // byte[] fileData = file.getBytes();
                // FileOutputStream output = new FileOutputStream("C:/images/" + fileName);
                // output.write(fileData);
                 
                // 2. File 사용
                File file = new File("C:/upload/" + fileName);
                uploadfile.transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            } // try - catch
        } // if
        // 데이터 베이스 처리를 현재 위치에서 처리
        return "redirect:getBoardList.do"; // 리스트 요청으로 보내야하는데 일단 제외하고 구현
    }
}