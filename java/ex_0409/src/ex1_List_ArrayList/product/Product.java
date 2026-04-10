package ex1_List_ArrayList.product;

public class Product {

 private String name;
 private int price;
 private int quantity;
 
  public Product(String name, int price, int quantity) {
	  this.name = name;
	  this.price = price;
	  this.quantity = quantity;
  }
		
  
  	public String getName() {
		return name;
	}
  
	public int getPrice() {
		return price * quantity;
	}
		
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return name + "(" + price + "¿ø) x " + quantity + "°³";
	
		
	}
	
	
	
	
	
	
}
