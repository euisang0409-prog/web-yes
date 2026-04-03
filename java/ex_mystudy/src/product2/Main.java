package product2;

public class Main {
	public static void main(String[] args) {
		
		Product p1 = new Product("키보드", 5000, 10);
		Product p2 = new Product("마우스", 15000, 20);
		Product p3 = new Product("모니터", 105000,100);
		
		Product [] products = {p1,p2,p3};
	
		for(int i = 0; i < products.length; i++) {
			products[i].showInfo();
		}
		
		
	}
}
