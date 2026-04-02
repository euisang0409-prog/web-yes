package ex1_innerclass;

public class Main {
    public static void main(String[] args) {

        RemoteControl rc = new RemoteControl(); // 외부 객체 생성

        RemoteControl.Button btn = rc.new Button(); // 내부 객체 생성
        btn.press(); // 버튼 누르기

        System.out.println("현재 전원 상태 : " + rc.power);
    }
}
