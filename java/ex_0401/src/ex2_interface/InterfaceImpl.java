package ex2_interface;

public class InterfaceImpl implements InterfaceC{

	@Override
	public void methdoA() {
		System.out.println("구현체 methodA 실행");
		
	}

	@Override
	public void methdoB() {
		System.out.println("구현체 methodB 실행");
		
	}

	@Override
	public void methdoC() {
		System.out.println("구현체 methodC 실행");
		
	}
	
}
