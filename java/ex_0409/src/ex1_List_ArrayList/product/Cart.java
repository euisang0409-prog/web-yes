package ex1_List_ArrayList.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products = new ArrayList<>();
	
	// 상품추가(같은 상품이 들어오면 수량만 증가)
	public void addProduct(String name, int price, int quantity) {
		// list의 size()가 0이면 반복문을 안들어간다.
		for(Product p : products) {
			if(p.getName().equals(name)) {
				p.setQuantity(p.getQuantity()+ quantity);
				System.out.println("기존 상품 수량 증가 완료");
				return;
			}
		}
		
		// 넘어온 제품이 겹치지 않는다면 list에 추가하기
	products.add(new Product(name,price,quantity));
	System.out.println("상품 추가 완료");
		
		
		
	}
	 
	public void printCart() {
		// 장바구니가 비어있으면 "장바구니가 비어있습니다." 출력하고 종료
		if(products.size() == 0) {
			System.out.println("장바구니가 비워있습니다.");
			return; // 메서드를 끝내는 용도로 사용
		}
			
		// 모든 상품을 출력하기
		for(Product p : products) {
			System.out.println(p);
		}
		
	}
	
	public void printTotalPrice() {
		int total = 0;
		
		for(Product p : products) {
			total += p.getPrice();
		}
		
		System.out.println("총 결제금액: " + total + "원");
		
	}
	
	public void removeProduct(String name) {
		// 제품이 있으면 삭제하고 " 상품 삭제 완료"
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				products.remove(i);
				System.out.println("상품 삭제 완료");
				return;
			}
		}
		
		
		//제품이 없으면 " 해당 제품이 없습니다."
		System.out.println("해당 상품이 없습니다.");
	}
	
	
	
	
	
	
}
