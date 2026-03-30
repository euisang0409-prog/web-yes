package ex_mystudy;

public class Discount {

		// 문제
	
//할인률을 경정하는 Discount클래스 
//할인률을 상수로 가지고 있다.
//RATE_HIGH = 0.2;
//RATE_MID = 0.1;
//RATE_LOW = 0.05;
//
//금액에 따라서 할인률을 결정하는 disCountRate 메서드 만들기
//금액이 10만원 이상이면 0.2
//5만원 이상이면 0.1
//5만원 보다 적으면 0.05 적용
//
//최종 금액을 계산하는 calculatePrice 메서드 작성
//- 할인률이 적용된 금액을 반환하세요
//
//DiscountMain에서 금액을 키보드에서 입력받아서 할인 적용금액 구하기

	
	
	
	
	
	
	
    // 할인율 상수
    static final double RATE_HIGH = 0.2;
    static final double RATE_MID = 0.1;
    static final double RATE_LOW = 0.05;

    // 금액별 할인율 결정
    public double discountRate(int price) {
        if (price >= 100000) {
            return RATE_HIGH;
        } else if (price >= 50000) {
            return RATE_MID;
        } else {
            return RATE_LOW;
        }
    }

    // 최종 금액 계산
    public double calculatePrice(int price) {
        double rate = discountRate(price);
        return price * (1 - rate);
    }
}
