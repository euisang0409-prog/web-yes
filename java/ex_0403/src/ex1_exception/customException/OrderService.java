package ex1_exception.customException;

class OrderService {
    public int calculate(int price, int count) {
        if(price <= 0) {
            throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
        }
        if(count <= 0) {
            throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
        }
        return price * count;
    }
}
