package ex1_innerclass.Example;

public class RemoteControl {

	String power = "off";

    class Button {  // 인스턴스 클래스
        public void press() {	
            power = "On";
            System.out.println("전원을 켭니다.");
        }
    }
}
