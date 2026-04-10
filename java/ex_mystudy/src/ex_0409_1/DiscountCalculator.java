package ex_0409_1;

public class DiscountCalculator {
	 public static void main(String[] args) {
	       int price = 10000;
	       String grade = "VIP";
	       int discountedPrice = 0;
	 
	       // [A] 오류발생로직  원인: == 연산자는 문자열의 값이 아니라 
	       // 주소(참조값)를 비교한다. 따라서 문자열의 내용 비교를 위해서는 equals()
	       // 메서드 사용해야한다.
	       
	       // 디스카운터 프라이스 프라이스 곱하게 0.8의 결과는 더블인데
	       // 이를 int 변수인 디스카운트프라이스에 저장하려고 하여 
	       // 타입 불일치가 발생한다. 따라사 형변환 (int)형변환이 필요하다.
	       // [A] 오류발생로직
	       if (grade.equals("VIP")) { 
	           discountedPrice = (int)(price * 0.8); 
	       }else {
	    	discountedPrice = price;   
	       } 
	      System.out.println(discountedPrice);
	      

	


	   }

}
