package register;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeLimitCheckInterceptor extends HandlerInterceptorAdapter {
	Calendar cal= Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
		if(checkLimit(request)&&checkTimeLimit2()){
			TimeLimitCheck(request, response);
			return false;
		}
		return true;
	}
	
	private boolean checkLimit(HttpServletRequest request){//수강신청 기간이 아닐경우 보여줄 곳
		return request.getRequestURI().equals(request.getContextPath()+"/jun/register/classbasket.do");
	}

/*	private boolean checkTimeLimit1(){
		String t1= year+"0215";
		String t2= year+"0226";
		SimpleDateFormat simple= new SimpleDateFormat("yyyyMMdd");
		Date now=new Date();
		Date aft = null;
		Date be = null;
		try {
			aft = simple.parse(t1);
			be=simple.parse(t2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return now.after(aft)&&now.before(be);
	}
	private boolean checkTimeLimit1_2(){
		String t1= year+"0215";
		String t2= year+"0218";
		SimpleDateFormat simple= new SimpleDateFormat("yyyyMMdd");
		Date now=new Date();
		Date aft = null;
		Date be = null;
		try {
			aft = simple.parse(t1);
			be=simple.parse(t2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return now.after(aft)&&now.before(be);
	}
*/	//2학기일 경우를  확인
	private boolean checkTimeLimit2(){

		String t1= year+"1009";
		String t2= year+"1020";
		SimpleDateFormat simple= new SimpleDateFormat("yyyyMMdd");
		Date now=new Date();
		Date aft = null;
		Date be = null;
		try {
			aft = simple.parse(t1);
			be=simple.parse(t2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return now.after(aft)&&now.before(be);
	}
/*	private boolean checkTimeLimit2_2(){

		String t1= year+"1009";
		String t2= year+"1012";
		SimpleDateFormat simple= new SimpleDateFormat("yyyyMMdd");
		Date now=new Date();
		Date aft = null;
		Date be = null;
		try {
			aft = simple.parse(t1);
			be=simple.parse(t2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return now.after(aft)&&now.before(be);
	}
*/	private void TimeLimitCheck(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.sendRedirect("/KH/jun/register/class_basket.do");
	}
	/*private void TimeLimitCheck2(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.sendRedirect("/KH/jun/register/Class_BasketMinor1.do");
	}
	private void TimeLimitCheck3(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.sendRedirect("/KH/jun/register/Class_BasketMajor2.do");
	}
	private void TimeLimitCheck4(HttpServletRequest request, HttpServletResponse response)throws IOException{
		response.sendRedirect("/KH/jun/register/Class_BasketMinor2.do");
	}*/
}
