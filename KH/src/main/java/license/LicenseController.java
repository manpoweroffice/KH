package license;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;


 
@Controller
public class LicenseController {
	@Autowired
	private LicenseDAO dao; 
	@Autowired
	private KindsDAO dao1;
	
public void setDao(LicenseDAO dao){
	this.dao = dao;
}

public void setDao1(KindsDAO dao1){
	this.dao1 = dao1;
}

@RequestMapping(value="/career/kindsForm.do",method=RequestMethod.POST)
public ModelAndView getJobList(String jobcode, String parentId){
	
	String id = (parentId.equals("undefined"))? "1": parentId;

	 ModelAndView mav =  new ModelAndView("kindsForm");
	 List<KindsVo> jobList = dao1.getJobList(jobcode);
	 mav.addObject("jobList", jobList);
	 mav.addObject("parentId", id);
	 return mav;
}

@RequestMapping(value="/career/kindsForm.do",method = RequestMethod.GET)
public String kindsForm(){
	return "kindsForm";
}

@RequestMapping(value="/career/sendKinds.do",method = RequestMethod.GET)
public String sendKinds(String kinds){
	
	return "redirect:kindsForm?check=n";
}

@RequestMapping(value="/career/license.do", method=RequestMethod.GET)
public String licenseform(){
	return "career/licenseForm";
}

@RequestMapping(value="/career/license.do", method=RequestMethod.POST)
public String submit(MultipartHttpServletRequest request) //����Ÿ���̰� �Ϲ� �Ķ����Ÿ���̰� MultipartHttpServletRequest �� ����
{

	// �Ѿ�� ������ ����Ʈ�� ����
	List<MultipartFile> report = request.getFiles("uploadfile"); 
	if(report.size() == 1 && report.get(0).getOriginalFilename().equals("")){
	
	} else{
		for(int i = 0; i < report.size(); i++){
			/*String o_name = UUID.randomUUID().toString(); // ���� �ߺ��� ó��
*/			String name = report.get(i).getOriginalFilename(); // ���� ���ϸ�
			/*String savefileName = o_name + "." + getExtension(originalfileName); // ����Ǵ� �����̸�
*/			/*String o_name = report.getOriginalFilename(); */
			long now = System.currentTimeMillis();
			String file_name = now + name; // ���ϸ�
			/*Random r = new Random();
			int j = r.nextInt(50); // 0 49 ���� �������� �߻��ؼ� ������ ����
			// ���ϸ� �� ���ϰ��
*/			
			String stu_num = "910820"; // �й�
			String kinds = "123"; // �ڰ�������
			String publisher = "123"; // ����ó
			String dates = "123"; // �����
			String type = "�ڰ���"; // Ÿ��
			/*o_name = now +"_"+j+"_"+ o_name;*/
			
			File path = new File("C:/upload/"+name); // ���ϰ��
			try{
				report.get(i).transferTo(path);
				LicenseVo vo = new LicenseVo(stu_num, kinds, publisher, dates);
				StorageVo vo1 = new StorageVo(stu_num, file_name, path.getPath(), type);
				dao.upload2(vo); // �ڰ���
				dao.upload1(vo1); // ����� 
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
	return "career/licenseForm";
}
public void upload(List<MultipartFile> report){
	
}
}

