package spring.web.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.web.test.dao.BoardDao;
import spring.web.test.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;	
	
	@RequestMapping("/getBoard")
	public String getBoard(@RequestParam("seq")String seq, Model model) {
		
		
		List<BoardVo> list = boardDao.getBoard(seq);

		model.addAttribute("list", list);
		
		return "board";
		
		
	}

}
