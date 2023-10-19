package ex2_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2_xml/applicationContext.xml");

//		MemberBean mb = (MemberBean)context.getBean("member");
//		System.out.println(mb.toString());
//		
//		MemberBean mb2 = (MemberBean)context.getBean("member2");
//		System.out.println(mb2.toString());
		
		MemberDAO d1 = (MemberDAO)context.getBean("dao1");
		d1.insert();
		
		MemberDAO d9 = (MemberDAO)context.getBean("dao9");
		d9.insert();
		
	}

}
