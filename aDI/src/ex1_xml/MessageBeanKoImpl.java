package ex1_xml;

public class MessageBeanKoImpl implements MessageBean{

	public MessageBeanKoImpl() {
		System.out.println("MessageBeanKoImpl 생성자");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println(name + "님 반갑습니다");
	}
	
}
