package ex1_innerclass.Example;

public class Main {
	  public static void main(String[] args) {
	        RemoteControl rc = new RemoteControl();
	        RemoteControl.Button btn = rc.new Button();
	        btn.press();
	        System.out.println("현재 전원 상태 : " + rc.power);
	        
	        
	        Calculator result = new Calculator();
	        Calculator.Result result2 = result.add(10, 20);
	        		
	        result2.show();
	             
	       
	        Calculator1 cal = new Calculator1() {
	        	
	        
	        
	        
	        
	    }
	  
}
