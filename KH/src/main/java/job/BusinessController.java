package job;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@ModelAttribute("bussVo")
	public BusinessVo formbacking(){
		return new BusinessVo();
	}
	
	@RequestMapping("/job/business.do")
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
		System.out.println("글 개수 ="+count);
		//페이징 처리
		PagingUtil page= new PagingUtil(keyField,keyWord,currentPage,count,pageSize,blockCount,"job/business.do");
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
		int number= count-(currentPage-1)*pageSize;
		ModelAndView mav= new ModelAndView();
		mav.setViewName("job/business");
		mav.addObject("number", number);
		mav.addObject("count",count);
		mav.addObject("bussList", bussList);
		mav.addObject("pageNum", currentPage);
		mav.addObject("pagingHtml", pagingHtml);
		return mav;
	}
	
	@RequestMapping(value="/job/busswrite.do",method=RequestMethod.GET)
	public String form(){
		return "job/busswrite";
	}
	@RequestMapping(value="/job/busswrite.do",method=RequestMethod.POST)
	public String insertbuss(BusinessVo bussVo){
		bussVo.setNum(0);
		
/*	  System.out.println(bussVo.toString());*/
		int x= bussDao.insertBuss(bussVo);
		if(x==0){
			System.out.println("실패");
		}else{
			System.out.println("성공");
		}
		return "redirect:/jun/job/business.do";
	}
	
	@RequestMapping("/job/bussView.do")
	public ModelAndView ShowView(@RequestParam("num")Integer num,@RequestParam(value="pageNum",defaultValue="1")Integer pageNum){
		ModelAndView mav= new ModelAndView();
		
		BusinessVo bussVo= bussDao.getBussOne(num);
		mav.setViewName("job/bussView");
		mav.addObject("bussVo", bussVo);
		return mav;
	}

	@RequestMapping(value="/job/bussUpdate.do",method=RequestMethod.GET)
	public ModelAndView modifyView(@RequestParam("num")int num){
	ModelAndView mav= new ModelAndView();
		
		BusinessVo bussVo= bussDao.getBussOne(num);
		mav.setViewName("job/bussModify");
		mav.addObject("bussVo", bussVo);
		return mav;
	}
	@RequestMapping(value="/job/bussUpdate.do",method=RequestMethod.POST)
	public String modify(BusinessVo bussVo){
		int t=bussDao.updateBuss(bussVo);
		if(t==0){
			System.out.println("실패");
		}else{
			System.out.println("성공");
		}
		return "redirect:/jun/job/business.do";
	}
	
	@RequestMapping("/job/bussDelete.do")
	public String delete(@RequestParam("num")int num){
		int Delc= bussDao.deleteBuss(num);
		return "redirect:/jun/job/business.do";
	}
}
