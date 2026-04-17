package ex_0416.ex_0416;

import ex_0416.Product;

public class Main {
	public static void main(String[] args) {
		
		Product p = new Product("≥Î∆Æ∫œ", 5);
		
		p.printInfo();
		p.sell(3);
		p.printInfo();
		p.sell(10);
		p.printInfo();
		
		
	}
}
