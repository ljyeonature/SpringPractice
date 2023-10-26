package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.ReplyVO;
import com.javassem.service.ReplyService;

// ***********
// 모두가 ajax여야지 가능합니다.
@RestController
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@DeleteMapping("/replies/{rno}")
	public int delete(@PathVariable Integer rno) {
		System.out.println("삭제할 댓글 번호 : " + rno);
		int result = replyService.deleteReply(rno);
		return result;
	}
	
	@PostMapping("/replies/{rno}")
	public int update(@PathVariable Integer rno, @RequestBody ReplyVO vo) {
		System.out.println("수정할 댓글 번호 : " + rno);
		System.out.println(vo.getReply());
		System.out.println(vo.getReplyer());
		int result = replyService.updateReply(vo);
		return result;
	}
	
	@PostMapping("/replies/new")
	public String insert(ReplyVO vo) {
		System.out.println("replies/new 요청 : " + vo);
		Integer result = replyService.insertReply(vo);
		if(result == 1) return "ok";
		else return "failed";
	}
	
	@GetMapping("/replies")
	public List<ReplyVO> selectAll(Integer bno) {
		System.out.println(bno + "번 게시글의 댓글 목록 요청");
		List<ReplyVO> result = replyService.selectAllReply(bno);
		return result;
	}
	

}
