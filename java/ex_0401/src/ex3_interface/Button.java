package ex3_interface;

// 물리적 버튼
public class Button {

	ClickListener listener;

	
	public void setClickListener(ClickListener listener) {
		this.listener = listener;
	}
		
	void click() {
		if(listener != null) {
			listener.onClick();
		}
	}
	
	
}
