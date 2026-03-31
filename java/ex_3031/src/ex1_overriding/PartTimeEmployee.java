package ex1_overriding;

public class PartTimeEmployee extends Employee{
	
	int payPerHour; // 시급
	int workTime;	// 근무시간
	
	public PartTimeEmployee(String name, int payPerHour, int workTime) {
		super(name);
		this.payPerHour = payPerHour;
		this.workTime = workTime;
	}
	
	  @Override
	    public int getPay() {
	        return payPerHour * workTime;
	  }
	  
	
	
	
	
	
	
	
}
