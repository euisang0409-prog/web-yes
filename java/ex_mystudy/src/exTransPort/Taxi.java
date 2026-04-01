package exTransPort;

public class Taxi extends TransPort{

	int distance;
	int farePerKm;
	
	
	public Taxi(String name, int baseFare, int distance, int farePerKm) {
		super(name, baseFare);
		
	}

	@Override
	public int calculatorFare() {
		
		return distance * farePerKm;
	}

}
