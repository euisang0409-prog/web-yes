package exTransPort;

public class Main {
	public static void main(String[] args) {
		TransPort[] transport = {
				new Bus("버스", 1200),
				new Taxi("택시", 3000,10,100)
		};
		for(TransPort t2 : transport) {
			t2.printFare();
		}
		
		
	}
}
