package ex3_interface;

public class Main {
	public static void main(String[] args) {
		
		Notification[] notiy = {
				new SmsNotification(),
				new EmailNotification()
		};
		
		
		for(Notification n : notiy) {
			n.send("æ»≥Á«œººø‰");
		}
			System.out.println("==================");
			
		Button but = new Button();
		
		but.setClickListener(new LoginListener());
		but.click();
		but.setClickListener(new LogoutListener());
		but.click();
		
		
		
		
		
		
	}
		
}
