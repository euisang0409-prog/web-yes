package ex1_abstract;

public class Taxi extends TransPort{

	int distance;
	int farePerKm;
	
	// 오류가 났다면 생성자를 수정해보기 
	
	public Taxi(String name, int baseFare, int distance, int farePerKm) {
		super(name, baseFare);
		this.distance = distance;
		this.farePerKm = farePerKm;
	}
	
	
	
	
	public Taxi(String name, int baseFare) {
		super(name, baseFare);
		
	}

	@Override
	public int calculatorFare() {
		
		return baseFare + (distance * farePerKm);
	}

	
	
	
	
	
}
