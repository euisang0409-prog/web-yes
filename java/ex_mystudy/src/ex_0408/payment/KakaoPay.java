package ex_0408.payment;

public class KakaoPay implements Payment{

	@Override
	public void pay() {
		System.out.println("카카오페이 결제");
	}
	
}
