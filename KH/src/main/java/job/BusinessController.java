package job;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import util.PagingUtil;

@Controller
public class BusinessController {

	
	private BusinessDAO bussDao;

	public void setBussDao(BusinessDAO bussDao) {
		this.bussDao = bussDao;
	}
	private int pageSize=10;
	private int blockCount=10;
	/*@ModelAttribute
	public BusinessVo formbacking(){
		return new BusinessVo();
	}
	List<BusinessVo> busslist =bussDao.getBussList();
	*/
	
	@RequestMapping(value="/job/business")
	public ModelAndView form(@RequestParam(value="pageNum",defaultValue="1")int currentPage,
			@RequestParam(value="keyField",defaultValue="")String keyField,
			@RequestParam(value="keyWord",defaultValue="")String keyWord
			){
		String pagingHtml="";
		
		HashMap<String,Object> map= new HashMap<String,Object>();
		map.put("keyField", keyField);
		map.put("keyWord", keyWord);
		
		//�� ���� ���� �Ǵ� �˻��� ���� ����
		int count = bussDao.bussCount(map);
		
		//����¡ ó��
		PagingUtil page= new PagingUtil(keyField,keyWord,currentPage,count,pageSize,blockCount,"job/business");
		pagingHtml= page.getPagingHtml().toString();
		
		map.put("start", page.getStartCount());
		map.put("end", page.getEndCount());
		
		List<BusinessVo> bussList=null;
		if(count>0){
			bussList=bussDao.getBussList(map);
		}else{
			bussList= Collections.emptyList();
		}
		
		//�� ��Ͽ� ǥ���� ����
		int number= count=(currentPage-1)*pageSize;
		ModelAndView mav= new ModelAndView();
		mav.setViewName("job/business");
		mav.addObject("count",count);
		mav.addObject("bussList", bussList);
		mav.addObject("pagingHtml", pagingHtml);
		return mav;
	}
}
