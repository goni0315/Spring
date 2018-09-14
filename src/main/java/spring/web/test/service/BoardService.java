package spring.web.test.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import spring.web.test.dao.BoardDao;
import spring.web.test.vo.BoardVo;

public class BoardService implements BoardDao{

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	
	@Override
	public List<BoardVo> getBoardList() {
		
		
		
		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);
		List<BoardVo> list = boardDao.getBoardList();		
		
		return list;
	}



	@Override
	public List<BoardVo> getBoard(String seq) {

		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);
		List<BoardVo> list = boardDao.getBoard(seq);	
		
		return list;
	}
	
	

}
