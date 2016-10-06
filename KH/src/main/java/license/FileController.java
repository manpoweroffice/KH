package license;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class FileController {
 
    @RequestMapping(value = "/career/file.do", method = RequestMethod.GET)
    public ModelAndView fileForm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("career/fileForm");
        return mv;
    }
     
    @RequestMapping(value = "/career/file.do", method = RequestMethod.POST)
    public String fileSubmit(FileDTO dto) {
        MultipartFile uploadfile = dto.getUploadfile();
        if (uploadfile != null) {
            String fileName = uploadfile.getOriginalFilename();
            dto.setFileName(fileName);
            try {
                // 1. FileOutputStream ���
                // byte[] fileData = file.getBytes();
                // FileOutputStream output = new FileOutputStream("C:/images/" + fileName);
                // output.write(fileData);
                 
                // 2. File ���
                File file = new File("C:/upload/" + fileName);
                uploadfile.transferTo(file);
            } catch (IOException e) {
                e.printStackTrace();
            } // try - catch
        } // if
        // ������ ���̽� ó���� ���� ��ġ���� ó��
        return "redirect:getBoardList.do"; // ����Ʈ ��û���� �������ϴµ� �ϴ� �����ϰ� ����
    }
}