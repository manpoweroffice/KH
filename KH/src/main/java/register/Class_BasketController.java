package register;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Class_BasketController {

	Class_BasketDAO classDAO;

	public void setClassDAO(Class_BasketDAO classDAO) {
		this.classDAO = classDAO;
	}

	@RequestMapping(value = "/register/Class_Basket.do", method = RequestMethod.GET)
	public ModelAndView form() {
		List<Class_BasketBean> searchList = classDAO.selectAll();
		return new ModelAndView("register/Class_Basket", "searchList", searchList);
	}

}
