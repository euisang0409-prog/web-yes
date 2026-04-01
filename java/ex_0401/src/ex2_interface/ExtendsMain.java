package ex2_interface;

public class ExtendsMain {
	public static void main(String[] args) {
		
		InterfaceImpl impl = new InterfaceImpl();
		// 인터페이스의 타입 변환
		// 인터페이스와 구현클래스 사이에서 발생한다.
		// 자동 타입변환
		// 구현 객체를 인터페이스 타입변수에 대입할 때
		
		
//		impl.methdoA();
//		impl.methdoB();
//		impl.methdoC();
			
		// 강제 타입변환
		InterfaceA ia = impl;
		ia.methdoA();
//		ia.methdoB(); 
//		ia.methdoC();
		
		InterfaceB ib = impl;
//		ib.methdoA();
		ib.methdoB();
//		ib.methdoC();
		
		// 다른 인터페이스를 상속받았기 때문에 세개의 메서드 전부 가능
		
		InterfaceC ic = impl;
		ic.methdoA();
		ic.methdoB();
		ic.methdoC();
		
	
		
		
		
	}
}
