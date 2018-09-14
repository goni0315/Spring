package spring.web.test;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.web.test.dao.BoardDao;
import spring.web.test.vo.BoardVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Autowired
	private BoardDao boardDao;
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/main.do")
	public String home(Locale locale, Model model) {

		List<BoardVo> list = boardDao.getBoardList();

		model.addAttribute("list", list);
		
		return "home";
	}
	
}
