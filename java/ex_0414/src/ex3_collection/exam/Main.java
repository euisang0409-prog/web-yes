package ex3_collection.exam;

public class Main {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		// 제품추가하기
		service.addProduct(new Product("p001","삼각김밥",1200,10));
		service.addProduct(new Product("p002","사탕",300,50));
		service.addProduct(new Product("p003","콜라",2100,100));
		service.addProduct(new Product("p004","도시락",500,30));
		
		// 모든 제품 출력하기
		service.printAllProducts();
		
		// p001 제품의 가격 10% 인상
	service.updateProduct("p001", product -> {
		product.setPrice((int)(product.getPrice() * 1.1));
	});
		
	// 재고가 있는 제품만 조회 
	service.findProductsByCondition(p -> p.getStock() > 0);
	
		
	
		
		
		
		
	}
}
