package ex5_singleton;

public class AttendanceManager {

//	출석관리 프로그램이 있다.
//
//	AttendanceManager 클래스가 있다
//	- 학생 출석 수를 저장하는 count변수가 있다.
//	- addAttendance() 메서드를 호출하면 출석 수가 1증가한다.
//	- getAttendance()로 현재 출석수를 관리한다 
//	- 프로그램 전체에서 출석관리 객체는 하나만 존재해야 한다.

	// 클래스를 내부 객체
	
	private static AttendanceManager instance = new AttendanceManager();
	private int count;
	
	private AttendanceManager() {
		count = 0;
	}
		
	public static AttendanceManager getInstance() {
		return instance;
	}
	
	public void addAttendance() {
		count++;
	}
	
	public int getAttendance() {
		return count;
	}
	
	
	
	
	
	
	
}
