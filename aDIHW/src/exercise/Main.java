package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exercise.order.domain.Customer;
import exercise.order.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		// ##### 2. 스프링 설정 파일을 연결 코드를 작성하고 아래 코드의 주석을 해제
		ApplicationContext ctx = new ClassPathXmlApplicationContext("exercise/beans.xml");

		
		
		/*
		// --------------------------------------
		// 아래 코드의 주석을 해제하였을 때 구현되어야 한다.
		*/
		Customer customer = (Customer)ctx.getBean("customer");
		
		CustomerService customerService = (CustomerService)ctx.getBean("customerService");
		customerService.saveCustomer(customer);
		customerService.deleteCustomer(1);		
	}

}
