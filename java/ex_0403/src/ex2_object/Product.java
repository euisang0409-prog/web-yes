package ex2_object;

public class Product {

	 String name;
	 int price;
	 int stock;
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "상품명: " + name +", 가격: " + price +", 재고 " + stock;
	}
		
	
}
