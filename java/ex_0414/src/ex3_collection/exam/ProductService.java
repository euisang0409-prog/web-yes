package ex3_collection.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// 상품관리 기능들이 모여있는 클래스
public class ProductService {
	private List<Product> productList = new ArrayList<Product>();
	// 상품 추가하기 
	public void addProduct(Product product) {	
		if(findByCode(product.getCode()) != null) {
			System.out.println("이미 존재하는 상품 코드입니다.");
			return;
		}
		
		// 겹치는 상품이 없다면 리스트에 추가하기
		productList.add(product);
		
	}
	
	
	
	// 전체 상품 조회
	public void printAllProducts() {
		System.out.println("===전체 상품 목록===");
		for(Product p : productList) {
			System.out.println(p); // 오버라이딩 된 toString()메서드가 같이 실행
		}
	}
	
	// 제품 코드로 조회
	public Product findByCode(String code) {
		for(Product p : productList) {
			if(p.getCode().equals(code)) {
				return p;
			}
		}
		return null;	// if문에 못들어갈수도 있으니 바깥에 return을 써줌	
	}
	
	// 4. 상품 정보 수정
public void updateProduct(String code, Consumer<Product> updater) {
	// 코드에 해당하는 제품한개 찾기
		Product p = findByCode(code);
		
		if(p == null) {
			System.out.println("상품이 존재하지 않습니다.");
			return;
		}
		
		// 넘어온 람다식을 실행
		updater.accept(p);
	}

	// 5.조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product>predicate) {
		System.out.println("=== 재고가 있는 상품 ===");
		// 전체 순회하면서
		for(Product p : productList) {
			// 매개변수로 넘어온 람다식의 조건에 맞으면
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
	
	// 조건에 맞는 제품 삭제하기
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		Iterator<Product> iter = productList.iterator();
		
		while(iter.hasNext()) {
			Product p = iter.next();
			if(predicate)
		}
	}

	
	
	
}
