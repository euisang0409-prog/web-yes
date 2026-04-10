package ex_123;

public class DiscountCalculator {

	public static void main(String[] args) {
		
//		grade가 "VIP"인 경우: 20% 할인
//		grade가 "GOLD"인 경우: 10% 할인
//		그 외의 경우: 할인 없음 (0%)
		
	       int price = 10000;
	       String grade = "VIP";
	       int discountedPrice = 0;
	 
	       // [A] 아래에 설계서에 맞는 조건문을 작성하시오.
// ==(참조값) 으로 문자열을 비교하려면 equals()메서드를 사용해야함
	// discountedPrice price * 0.8 을 곱하면 결과는 더블형이 되므로 
	//(int)형변환을 해야한다
	       
	       if (grade.equals("VIP")) { 
	           discountedPrice = (int)(price * 0.8); 
	       } else if(grade.equals("GOLD")) {
	    	   discountedPrice = (int)(price * 0.9);
	       }

	       // [B] 나머지 로직
	       System.out.println("최종 할인된 금액: " + discountedPrice);
	   }


	
}
