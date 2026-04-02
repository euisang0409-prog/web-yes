package RemoteControl;

public class Main {
	public static void main(String[] args) {
		
		RemoteControl rct = new RemoteControl();
		RemoteControl.Button btn = rct.new Button();
		btn.press();
		System.out.println("현재 전원 상태 " + rct.power);
		
		
		
	}
	
	
}
