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
		
		//총 글의 개수 또는 검색된 글의 개수
		int count = bussDao.bussCount(map);
		
		//페이징 처리
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
		
		//글 목록에 표시할 연번
		int number= count=(currentPage-1)*pageSize;
		ModelAndView mav= new ModelAndView();
		mav.setViewName("job/business");
		mav.addObject("count",count);
		mav.addObject("bussList", bussList);
		mav.addObject("pagingHtml", pagingHtml);
		return mav;
	}
}
