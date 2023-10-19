package ex1_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//-------------------------------
		// 0. 기존방식(POJO)
		// MessageBean mb1 = new MessageBeanKoImpl();
		// mb1.sayHello("홍길동");
		
		// 1. DI
		// (1) 스프링 설정파일을 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml/applicationContext.xml");
		
		// (2) 스프링 컨테이너에서 빈 가져오기
		MessageBean bean1 = context.getBean("ko", MessageBean.class);
		bean1.sayHello("홍길동");
		MessageBean bean2 = context.getBean("ko", MessageBean.class);
		bean2.sayHello("홍길자");
		

	}

}
