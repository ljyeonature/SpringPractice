package ex2_xml;

public class MemberDAO {
	
	private MemberBean member;

	// 생성자 함수
	public MemberDAO() {
	}

	public MemberDAO(MemberBean member) {
		this.member = member;
	}
	
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	public void insert() {
		System.out.println("디비에 입력하였습니다.");
		System.out.println(member.toString());
		System.out.println("--------------------------------------------------------------");
	}
	
	
	
	

}
