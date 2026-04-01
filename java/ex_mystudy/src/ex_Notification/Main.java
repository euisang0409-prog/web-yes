package ex_Notification;

import ex3_interface.Notification;

public class Main {
	public static void main(String[] args) {
		
		Notification[] notiy = {
				new SmsNotification(),
				new EmailNotification()
		};
				for(Notification n : notiy) {
					n.send("æ»≥Á«œººø‰");
				}
				
		
	}
	
	
	
}
