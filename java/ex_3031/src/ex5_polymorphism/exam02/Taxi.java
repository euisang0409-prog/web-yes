package ex5_polymorphism.exam02;

public class Taxi extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
