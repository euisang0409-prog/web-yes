package ex1_innerclass.staticclass;

public class Main {

	public static void main(String[] args) {
		
		// 정적 내부 클래스의 객체 생성방법
		
		Outer.Inner ineer = new Outer.Inner();
		
		User user = new User.Builder()
		        .id("user1")
		        .password("1234")
		        .name("홍길동")
		        .email("test@test.com")
		        .age(25)
		        .address("서울")
		        .phone("010-1234-5678")
		        .build();
		
		
		

		
		
		
		// 단점
		//매개변수가 많아서 순서를 헷갈리기 쉽다.
		// 어떤값이 필수인지 한눈에 안보인다.
		// 생성자가 너무 많이 오버로딩 될 수 있다.
//		User user = new User("hong", "1234", "hong@gmail.com", 홍길동, 20, "서울", "010-1111-2222");
				  
		// 객체 생성 책임 분리
		// Builder가 값을 하나씩 모으고
		// 마지막 build() 메서드를 통해서 실제 객체를 만드는 방식
		
		
		
		
	}
}
