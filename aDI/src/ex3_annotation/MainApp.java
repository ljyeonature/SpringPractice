package ex3_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3_annotation/applicationContext.xml");

		
//		MemberDAO d1 = (MemberDAO) context.getBean("dao1");
		MemberDAO d1 = (MemberDAO) context.getBean("memberDAO");
		d1.insert();

		
	}

}
