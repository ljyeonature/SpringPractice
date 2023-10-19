package ex3_annotation;

import org.springframework.stereotype.Component;

@Component("dao1")
//@Component
public class MemberBean {

	private String name    = "엑스맨";
	private int age        = 20;
	private String message = "화이팅";
	
	//toString()
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", age=" + age + ", message=" + message + "]";
	}
	
//	// 생성자 함수
//	public MemberBean(String name, int age, String message) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.message = message;
//	}
//
//	public MemberBean() {
//		super();
//	}
//	
//	// setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setMessage(String message) {
//		this.message = message;
//	}


	
}
