package ex_0330;

public class Discount {
	
	final double RATE_HIGH = 0.2;
	final double RATE_MID = 0.1;
	final double RATE_LOW = 0.05;
	
	// 할인률 결정 메서드
	public double disCountRate(int price) {
		if(price >= 100000) {
			return RATE_HIGH;
		}else if(price >= 50000) {
			return RATE_MID;
		}else {
			return RATE_LOW;
		}
			
	}
	
	public int calculatePrice(int price) {
		double rate = disCountRate(price); // 할인률 구하기
		return (int)(price - (rate * price)); //할인 적용 
	}
	
}
