package spring.web.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import spring.web.test.vo.BoardVo;

public interface BoardDao {

	
	public List<BoardVo> getBoardList();
	public List<BoardVo> getBoard(@Param("seq") String seq);
}
