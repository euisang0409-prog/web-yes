package ex3_interface;

public class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("[EMAUL]" + message +  " "
				+ "환영합니다.");
		
	}

}
