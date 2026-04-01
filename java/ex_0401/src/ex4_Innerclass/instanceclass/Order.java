package ex4_Innerclass.instanceclass;

public class Order {

    // 필드
    int orderNumber;

    // 생성자
    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    // 주문 정보 출력
    void printOrderInfo(Item item) {
        System.out.println("주문번호: " + orderNumber);
        item.printInfo();
    }

    //  인스턴스 내부 클래스
    class Item {
        String name;
        int price;
        int count;

        // 생성자
        public Item(String name, int price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        // 상품 정보 출력
        void printInfo() {
            System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + count + "개");
        }
    }
}
