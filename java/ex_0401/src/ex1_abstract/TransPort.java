package ex1_abstract;

public abstract class TransPort {

	String name; // 운송수단 이름
	int baseFare; // 기본요금
	
	// 생성자를 통해서 필드의 내용을 전달받는다.
	public TransPort(String name, int baseFare) {
		this.name = name;
		this.baseFare = baseFare;
	}
	
	public String showName() {
		return name;
	}
	
	// 총 요금 계산
	public abstract int calculatorFare();
	
	public void printFare() {	// 거리
		System.out.println("교통수단 : " + showName());
		System.out.println("기본요금 : " + baseFare);
		System.out.println("총 요금 :" + calculatorFare() +"원");
		
	}
	
	
	
}
