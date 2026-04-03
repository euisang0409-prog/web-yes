package ex2_object;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		
		obj.toString();
		
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		System.out.println(myPhone);
		
		Product product = new Product("키보드", 5000, 10);
		Product product1 = new Product("마우스", 15000, 20);
		Product product2 = new Product("모니터", 105000, 100);
		
		
		
		
		
		
	}
}
