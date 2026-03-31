package ex5_polymorphism.exam01;

public class CardPayment extends Payment {

	@Override
	public void Pay(int amount) {
		System.out.println("Ä«µå·Î" + amount );
	}
}
