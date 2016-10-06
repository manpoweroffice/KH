package license;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

 
@Controller
public class LicenseController {
	@Autowired
	private LicenseDAO dao; 

public void setDao(LicenseDAO dao){
	this.dao = dao;
}

@RequestMapping(value="/career/license.do", method=RequestMethod.GET)

public String form(){
	return "career/licenseForm";
}

@RequestMapping(value="/career/license.do", method=RequestMethod.POST)
public String submitReport2(MultipartHttpServletRequest request)
//����Ÿ���̰� �Ϲ� �Ķ����Ÿ���̰� MultipartHttpServletRequest �� ����
{
	/*String studentNumber = request.getParameter("studentNumber"); ���۵� Ÿ���� �Ķ���� ���̸� getParameter �޼ҵ� ���*/	
	
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
				dao.upload(vo); // �ڰ���
				dao.upload1(vo1); // ����� 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	upload(report);
	return "career/licenseForm";
}

public void upload(List<MultipartFile> report){
	
}

}