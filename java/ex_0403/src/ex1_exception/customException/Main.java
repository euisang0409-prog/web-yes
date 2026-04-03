import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter2 converter = new Converter2();
        OrderService service = new OrderService();

        try {
            // 입력
            System.out.print("가격 입력: ");
            String priceStr = sc.next();

            System.out.print("수량 입력: ");
            String countStr = sc.next();

            // 변환
            int price = converter.toInt(priceStr);
            int count = converter.toInt(countStr);

            // 계산
            int total = service.calculate(price, count);

            // 출력
            System.out.println("총 금액: " + total + "원");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}