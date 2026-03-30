package ex1_final;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("상품 가격 입력 : ");
		int price = sc.nextInt();

		Discount discount = new Discount();

		// 할인율
		double rate = discount.getDiscountRate(price);

		// 최종 금액
		double result = discount.calculatePrice(price);

		System.out.println("할인률 적용 : " + (rate * 100) + "%");
		System.out.println("최종 금액 : " + result);
		
		
		
		
	}
}
