package ex1_reflection.member;

public class Car {
	// 필드
	// 모두 private
	// String model
	// 오너 owner "문자열"
	
	// 기본생성자
	
	// 모델만 초기화하는 생성자
	
	//setter & getter
	
	private String model;
	private String owner;
	
	public Car() {
	
	}
	
	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
	
}
