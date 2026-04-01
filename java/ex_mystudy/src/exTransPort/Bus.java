package exTransPort;

public class Bus extends TransPort{

	public Bus(String name, int baseFare) {
		super(name, baseFare);
		
	}

	@Override
	public int calculatorFare() {
		
		return baseFare;
	}
	
	
	
}
