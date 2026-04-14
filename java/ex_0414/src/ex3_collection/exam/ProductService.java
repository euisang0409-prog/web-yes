package ex3_collection.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductService {
	List<Product> list = new ArrayList<Product>();
	// 상품등록 
	public void addProduct(Product product) {	
		for(Product p : list) {
			if(p.getCode().equals(product.getCode())) {
				System.out.println("이미 존재하는 상품 코드입니다.");	
				return;
			}
		}
		list.add(product);
	}
	// 전체 상품 조회
	public void printAllProducts() {
		list.forEach(s -> System.out.println(s));
	}
	
	// 상품 코드로 조회
	public Product findByCode(String code) {
		for(Product p : list) {
			if(p.getCode().equals(code)) {
				return p;
			}
		}
		return null;		
	}
	
	// 4. 상품 정보 수정
	public void updateProduct(String code, Function<Product, Product> updater) {
		for(int i = 0; i < list.size(); i++) {
			
			Product p = list.get(i);
			if(p.getCode().equals(code)) {
				Product updated = updater.apply(p);
				list.set(i, updated);
				
				return;
			}	
		}
		System.out.println("상품이 존재하지 않습니다.");	
	}

	// 5.조건에 맞는 상품 조회
	
	public void findProductsByCondition(Predicate<Product>predicate) {
		
	}
	
	
	
	
	
	
}
