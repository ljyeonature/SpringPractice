package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

//@Component
@Service("boardService")
public class BoardServiceImpl implements BoardService {
//	너가 객체 생성 자동으로 좀 해줘
	@Autowired
	private BoardDao boardDAO;
	
	// 메소드오버라이딩
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return null;
	}


}
