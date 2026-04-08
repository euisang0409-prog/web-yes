package ex_0408;

public class Main {
	public static void main(String[] args) {
		
		
		Member m = new Member("홍길동", 27);
		
		MemberResponse<Member> res =
				new MemberResponse<>(true, "회원 조회 성공", m);
		
		
		
		System.out.println("성공여부 : " + res.isSuccess() );
		System.out.println("메시지 : " + res.getMessage());
		System.out.println("이름: " + res.getData().getName());
		System.out.println("나이 : " + res.getData().getAge());
		
		
		
	}
}
