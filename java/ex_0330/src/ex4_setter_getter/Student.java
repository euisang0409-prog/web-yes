package ex4_setter_getter;

public class Student {

//	Student 클래스를 만들기
//	필드
//	- 문자열 타입의 이름
//	- 정수 타입의 나이
//	모든 필드는 private으로 선언
//	setter / getter를 각각 구현
//	Main 클래스에서 학생 객체를 만든 후 값을 세팅하고 콘솔에 값을 출력하기
	// 나이에 0미만의 값이 들어오면 "잘못된 나이입니다" 출력하기
	
	// private으로 선언
	private String name;
	private int age;
	
	// 하나에 하나의 필드만 설정
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}else {
			System.out.println("잘못된 나이입니다.");
		}
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	
	
	
	
	
	
}
