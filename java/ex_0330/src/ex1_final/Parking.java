package ex1_final;

public class Parking {

	//기본요금 : 10,000원(상수)
	// 추가요금 : 시간당 2,000원(상수)

	// 요금계산 메서드
	
	// 기본요금
	static final int ffe = 10000;
	
	// 추가 요금
	static final int  EXTRA_FEE = 2000;
	
	public int calculateFee(int time) {
		return ffe + (time * EXTRA_FEE);
		

		
	}
	
	
	
	
	
	
}
