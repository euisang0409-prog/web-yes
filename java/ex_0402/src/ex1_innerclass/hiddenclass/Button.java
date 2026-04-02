package ex1_innerclass.hiddenclass;

public class Button {

	public static interface ClickListener{
		void onClick();
	}
	
	ClickListener clickListener;
	
	// setter
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
		
		
	}
	
	// void click();
	void click() {
		clickListener.onClick();
	}
	
	// 전달받은 객체가 가지는 onClick()메서드 호출하기
	
	
	
	
	
}
