package exTransPort;

public abstract class TransPort {

	String name;
	int baseFare;
	

	
	public TransPort(String name, int baseFare) {
		 this.name = name;
		 this.baseFare = baseFare;	 
	}
	
	public String showname() {
		return name;
	}
	
	public abstract int calculatorFare();

	public void printFare() {
		System.out.println("ÃÑ ¿ä±Ý : " + baseFare + "¿ø");
		
		
		
	}

	
	
	
	
	
}
