package Product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Converter converter = new Converter();
		OrderService service = new OrderService();
		
		
		try {
			System.out.println("가격 입력: ");
			String priceString = sc.next(); // 가격을 문자열로 받음
			
			System.out.println("수량 입력: ");
			String quanString = sc.next();
				
			int price = converter.tolnt(priceString); // 문자열 -> 정수 변환
			int quantity = converter.tolnt(quanString);
			
			int total = service.calculate(price, price); // 총금액 계산
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
