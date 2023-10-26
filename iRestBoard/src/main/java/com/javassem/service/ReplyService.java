package com.javassem.service;

import java.util.List;

import com.javassem.domain.ReplyVO;

public interface ReplyService {
	
	// 댓글 추가
	Integer insertReply(ReplyVO vo);
	// 댓글 목록 보기
	List<ReplyVO> selectAllReply(Integer bno);
	
	// 댓글 삭제
	Integer deleteReply(Integer rno);
	
	// 댓글 수정
	Integer updateReply(ReplyVO vo);
}
