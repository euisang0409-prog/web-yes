package ex6_inheritance;

import java.util.Set;

public class Pen {
	
	protected int amount; // 남은 양
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	
	
}
public class SharpPen extends Pen{
	
	public int width; // 심 굵기
	}

public class BallPen extends Pen{
	public String color;
	public BallPen(String color) {
		this.color = color;
	}
}

public class FountainPen extends BallPen{
	
  public void refill(int n) {
	setAmount(n);
		    }
	        
	        
	        
	    }

	   
	    
}












