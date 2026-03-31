package ex_8;

public class HybridWaterCar extends HybridCar{

	int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		System.out.println("잔여 가스: " + gasGauge);
		System.out.println("잔여 전기량" + electricGauge);
		System.out.println("잔여 물량 출력" + waterGauge);
	}
	
}
