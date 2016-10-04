package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {

	//���� ���� ���ε�
	@RequestMapping("/photoUpload.do")
	public String photoUpload(HttpServletRequest request, PhotoVo vo){
		String callback = vo.getCallback();
		String callback_func= vo.getCallback_func();
		String file_result="";
		try{
			if(vo.getFiledata()!=null&&vo.getFiledata().getOriginalFilename()!=null&&vo.getFiledata().getOriginalFilename().equals("")){
				//������ ������ ���
				String original_name= vo.getFiledata().getOriginalFilename();
				String ext= original_name.substring(original_name.lastIndexOf(".")+1);
				//���� �⺻���
				String defaultPath =request.getSession().getServletContext().getRealPath("/");
				//���� �󼼰��
				String path= defaultPath+"resources"+File.separator+"photo_upload"+File.separator;
				File file= new File(path);
				System.out.println("path : "+path);
				//���丮�� �������� ������� ���丮 ����
				if(!file.exists()){
					file.mkdirs();
				}
				//������ ���ε� �� ���ϸ� ( �ѱ۹����� ���� ���������� �ø��� �������� ����)
				String realname= UUID.randomUUID().toString()+"."+ext;
				//������ ���� ����//
				vo.getFiledata().transferTo(new File(path+realname));
				file_result +="&bNewLine=true&sFileName="+original_name+"&sFileURL=/resource/photo_upload/"+realname;
				
			}else
				file_result+="&errstr=error";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:"+callback+"?callback_func="+callback_func+file_result;
	}
	
	//�������� ���ε�
	@RequestMapping("/multiplePhotoUpload.do")
	public void multiplePhotoUpload(HttpServletRequest request, HttpServletResponse response){
		try{
			//��������
			String sFileInfo="";
			//���ϸ��� �޴´� - �Ϲ� �������ϸ�
			String filename= request.getHeader("file-name");
			
			//���� Ȯ����
			String filename_ext= filename.substring(filename.lastIndexOf(".")+1);
			//Ȯ���ڸ� �ҹ��ڷ� ����
			filename_ext=filename_ext.toLowerCase();
			//���� �⺻���
			String defaultPath =request.getSession().getServletContext().getRealPath("/");
			//���� �󼼰��
			String path= defaultPath+"resources"+File.separator+"photo_upload"+File.separator;
			File file= new File(path);
			System.out.println("path : "+path);
			//���丮�� �������� ������� ���丮 ����
			if(!file.exists()){
				file.mkdirs();
			}
			String realFileNm="";
			SimpleDateFormat sim=new SimpleDateFormat("yyyyMMddHHmmss");
			String today=sim.format(new Date());
			realFileNm= today+UUID.randomUUID().toString()+filename.substring(filename.lastIndexOf("."));
			String rlFileNm=path+realFileNm;
			//������ ���Ͼ���
			System.out.println("���ϸ� : " +rlFileNm);
			InputStream is= request.getInputStream();
			OutputStream os=new FileOutputStream(rlFileNm);
			int numRead;
			byte b[]= new byte[Integer.parseInt(request.getHeader("file-size"))];
			while((numRead=is.read(b,0,b.length))!=-1){
				os.write(b, 0,numRead);
			}
			if(is!=null){
				is.close();
			}
			os.flush();
			os.close();
			//������ ���� ����
			// ���� ���
			sFileInfo +="&bNewLine=true";
			//img�±��� title �Ӽ��� �������ϸ����� ��������ֱ� ����
			sFileInfo +="&sFileName="+filename;
			sFileInfo +="&sFileURL="+"/KH/resources/photo_upload/"+realFileNm;
			PrintWriter print =response.getWriter();
			print.println(sFileInfo);
			print.flush();
			print.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
