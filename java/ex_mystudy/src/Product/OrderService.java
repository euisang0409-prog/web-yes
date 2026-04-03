package Product;

public class OrderService {
	
	public int calculate(int price, int quantity) throws Exception{
		if(price <= 0) {
			throw new IllegalArgumentException("가격은 1이상이어야 합니다.");
		}else if(quantity <= 0) {
			throw new IllegalArgumentException("수량은 1이상이어야 합니다.");
		}
		return price * quantity;
	}
}
