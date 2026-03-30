package ex6_inheritance;

public class Pen {
	
	protected int amount; // 남은 양
	
	
	
	
}
class SharpPen extends Pen{
	public int width; // 심 굵기
	}

class BallPen extends Pen{
	public String color;
	public BallPen(String color) {
		this.color = color;
	}
}

class FountainPen extends BallPen{
	
	 public FountainPen(String color) {
	        super(color); // 부모 생성자 호출
	    }

	    // 리필 메서드
	    public void refill(int n) {
	        this.amount = n;
	    }
	    
}












