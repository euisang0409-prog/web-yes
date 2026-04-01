package ex_Notification;

public class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("[EMAIL]"+ message + "환영합니다.");
		
	}

}
