package ex1_generic.exam;

import ex1_generic.DeviceManager;

public class Main {
	public static void main(String[] args) {
		
		GenericBox<String> g1 = new GenericBox<String>();
		g1.setItem("사과");
		System.out.println(g1.getItem());
		GenericBox<Integer> g2 = new GenericBox<Integer>();
		g2.setItem(10);
		System.out.println(g2.getItem());
	System.out.println("==============================");	
		
	MemberResponse<Member> mr 
	= new MemberResponse<Member>(true,
			 "테스트", new Member("홍길동",30));
		
	System.out.println(mr.isSuccess());
	System.out.println(mr.message);
	System.out.println(mr.getData().getName());
	System.out.println(mr.getData().getAge());
		
	AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
	AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat());
	
	// 동물병원은 동물만 다루는 곳인데
	// 문자열이나 숫자 다른 객체가 들어오면 이상해진다.
	dogHospital.treat();
	catHospital.treat();
		
		
		
	}
}
