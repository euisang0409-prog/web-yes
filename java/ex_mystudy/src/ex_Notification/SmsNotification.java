package ex_Notification;

public class SmsNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("[SMS]" + message + "전송합니다.");
		
	}

	
}
