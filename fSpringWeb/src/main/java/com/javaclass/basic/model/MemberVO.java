package com.javaclass.basic.model;

import lombok.Data;

@Data
public class MemberVO {

	private String id;
	private String name;
	private String age;
	
	private boolean state;
	
//	public void setState(boolean state) 
//	{
//		this.state = state;
//	}

	// boolean은 getter가 is로 시작
	
//	public boolean isState() 
//	{
//		return state;
//	}
	
	
	
	
}
