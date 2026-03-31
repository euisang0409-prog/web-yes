package ex5_polymorphism.exam01;

public class KaKaoPayment extends Payment{

	@Override
	public void Pay(int amount) {
		System.out.println("카카오페이로 " + amount);
	}
}
