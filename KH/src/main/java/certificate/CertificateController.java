package certificate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("certificate/certificateForm_f.do")
public class CertificateController {
	
	private CertificateDao certificateDao;

	public void setCertificateDao(CertificateDao certificateDao) {
		this.certificateDao = certificateDao;
	}
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView form(@ModelAttribute CertificateCommand command){
		String stu_num="100101";
		command=certificateDao.select_c(stu_num);
		String gradu_date=command.getGradu_date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd",java.util.Locale.getDefault());
		Date date=new Date();
		String thisdate=dateFormat.format(date);
		String college_state=command.getCollege_state();
		int compare = thisdate.compareTo(gradu_date);
		
		command= new CertificateCommand(stu_num,college_state,gradu_date,command.getDepartment(),command.getMajor(),
				command.getKo_name(),command.getEn_name(),command.getBirthday());
		
		if(compare>0){//Á¹¾÷
			certificateDao.update_state(command);
		}
	    	command=certificateDao.select_c(stu_num);
	    	
	    if(college_state.equals("ÀçÇÐ"))
	    	return new ModelAndView("/certificate/certificateForm_f","command",command);
	    else
	    	return new ModelAndView("/certificate/certificateForm_g","command",command);
	}  

}
