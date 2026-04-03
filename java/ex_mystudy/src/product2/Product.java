package product2;

public class Product {
	
	String name;
	int price;
	int stork;
	
	public Product(String name, int price, int stork) {
		this.name = name;
		this.price = price;
		this.stork = stork;
	}
	
		public void showInfo() {
			System.out.println("상품명: " + name + "가격: " + price +"원, 재고: " + stork);
		}
	
	
	
}
