package ex_0408.payment;

public class PaymentProcessor<T extends Payment> {

	T payment;
	
	public PaymentProcessor(T payment) {
		this.payment = payment;	
	}
	
	public void process() {
		 payment.pay();
	}
	
	
	
	
}
