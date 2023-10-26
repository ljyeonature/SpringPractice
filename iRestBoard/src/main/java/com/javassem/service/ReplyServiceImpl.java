package com.javassem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javassem.dao.ReplyDAO;
import com.javassem.domain.ReplyVO;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDAO replyDAO;
	
	 
	@Override
	public Integer insertReply(ReplyVO vo) {
		Integer result = replyDAO.insertReply(vo);
		return result;
	}

	@Override
	public List<ReplyVO> selectAllReply(Integer bno) {
		List<ReplyVO> result = replyDAO.selectAllReply(bno);
		return result;
	}

	@Override
	public Integer deleteReply(Integer rno) {
		int result = replyDAO.deleteReply(rno);
		return result;
	}

	@Override
	public Integer updateReply(ReplyVO vo) {
		int result = replyDAO.updateReply(vo);
		return result;
		
	}
	
	

}
