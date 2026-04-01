package ex1_abstract;

public class AirPlane extends TransPort{
	
	int airportFee; // 공항 이용료
	int fuelCharge; // 유류할증비
	
	public AirPlane(String name, int baseFare, int airportFee, int fuelCharge) {
		super(name,baseFare);
		this.airportFee = airportFee;
		this.fuelCharge = fuelCharge;
	}
	
	// 총요금 : 기본요금 + 공항 이용료 + 유류할증비
	@Override
	public int calculatorFare() {
		
		return baseFare + airportFee + fuelCharge;
	}
	
	// 필드는 생성자를 통해서 초기화 
	
	
	
	
	
	
	
	
}
