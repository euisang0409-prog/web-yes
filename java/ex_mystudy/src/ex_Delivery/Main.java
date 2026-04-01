package ex_Delivery;

public class Main {
	public static void main(String[] args) {
		
		Delivery[] del = {new RoketDelivery(), new StorePickup()};
		
		for(Delivery delivery : del) {
			delivery.printlnvoice();
			delivery.ship();
			delivery.complete();
		}
		
		
	}
}
