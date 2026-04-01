package ex4_Innerclass.instanceclass;

public class OrderMain {
	public static void main(String[] args) {
		// Order 객체 생성
        Order order = new Order(2026003);

        // ⭐ 내부 클래스 객체 생성 (중요)
        Order.Item item = order.new Item("키보드", 50000, 2);

        // 출력
        order.printOrderInfo(item);
	}
}
