package com.javassem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/*
	 * @RequestMapping("/insertBoard.do") public void insertBoard() {
	 * 
	 * }
	 */
// DB연결하지 않은 아이들
	@RequestMapping("/{step}.do")
	public String viewPage(@PathVariable String step)
	{
		return "board/"+step;
	}
	
	@RequestMapping("/saveBoard.do")
	public String saveBoard(BoardVO vo)
	{
		System.out.println("saveBoard.do 요청");
		System.out.println(vo.toString());
		boardService.insertBoard(vo);
		// 목록보기로 지정하려면?
		return "redirect:getBoardList.do";
	}
	
	// VO에 들어있는 값이면 그걸로 넘기자(1개라도..)
	@RequestMapping("/getBoard.do")
	public void getBoard(BoardVO vo, Model m)
	{
		BoardVO result = boardService.getBoard(vo);
		System.out.println(result);
		m.addAttribute("board", result);
	}
	
	@RequestMapping("/getBoardList.do")
	public void getBoardList(Model m, String searchCondition, String searchKeyword)
	{
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", searchKeyword);
		
		List<BoardVO> result = boardService.getBoardList(map);
		m.addAttribute("boardList", result);
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo)
	{
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo)
	{
//		System.out.println(vo.toString());
		boardService.updateBoard(vo);
		return "redirect:getBoard.do?seq=" + vo.getSeq();
	}
	


}
