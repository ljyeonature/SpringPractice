package com.javassem.domain;

import java.util.Date;

//VO(Value Object)

public class BoardVO {

	private Integer seq;		// 게시글번호
	private String title;		// 제목
	private String writer;		// 작성자
	private String content;		// 글내용
	private Date regDate;		// 작성일
	private Integer cnt;		// 조회수
		
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}



}