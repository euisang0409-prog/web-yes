package ex_8;

public class HybridCar extends Car{

	int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		this.gasGauge = gasGauge;
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		System.out.println("ÀÜ¿© °¡½º:" + gasGauge);
		System.out.println("ÀÜ¿© Àü±â·® : " + electricGauge);
	}
	
	
	
	
}
