package ex2_interface;

public class Audio implements RemoteControl {

	
	
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 킨다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if(volume > RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}	
	}

	
	
	
	
	
	
	
}
