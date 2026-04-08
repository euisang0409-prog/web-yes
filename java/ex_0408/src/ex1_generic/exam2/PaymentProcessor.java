package ex1_generic.exam2;

public class PaymentProcessor<T extends Payment> {

	T paument;
	
	public PaymentProcessor(T paument) {
		this.paument = paument;
	}
	
	public void process() {
		paument.Pay();
	}
	
	
	
	
}
