package aop1_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aop1_xml/applicationContext.xml");
		
		
		MessageBean bean = (MessageBean)context.getBean("targetBean");
		bean.sayHello();
		System.out.println("------------------------------");
		bean.engSayHello();
		System.out.println("------------------------------");
		bean.test();
		

	}

}
