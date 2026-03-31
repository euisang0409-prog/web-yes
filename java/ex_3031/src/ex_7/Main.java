package ex_7;

public class Main {

	public static void main(String[] args) {
		
		Calculator plus = new CalPlus();
		Calculator minus = new CalMinus();
	
		System.out.println("Calplus" + plus.getResult(15, 15));
		System.out.println("CalMinus" + minus.getResult(30, 15));
		
		
		
		
		
	}
	
	
}
