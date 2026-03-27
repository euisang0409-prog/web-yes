package ex6_static;

public class Calculator {

	// 파이 : 3.141592
	static double pi = 3.141592;
	
	
	
	// 외부에서 두 수를  받아 더하여 반환하는 plus메서드 작성하기
	static public int plus(int x, int y) {
		return x + y;
	}
	
	
	
	
	// 외부에서 두 수를  받아 빼 반환하는 minus메서드 작성하기
	
	static public int minus(int x, int y) {
		return x - y;
	}
	
	String name;
	int age;
	
	
	public void showInfo() {
		System.out.println("이름: " + name );
		System.out.println("나이: " + age);
	}
	
	
	
	
	
}
