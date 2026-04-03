package ex_0330;

import java.util.Scanner;

public class DiscountMain {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("입력 :");
			 int price = sc.nextInt();
			 
			 Discount d = new Discount();
			
			 int result = d.calculatePrice(price);

			 System.out.println("할인 적용 금액: " + result + "원");
	}
}
