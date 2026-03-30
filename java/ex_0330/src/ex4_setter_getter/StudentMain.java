package ex4_setter_getter;

public class StudentMain {
 public static void main(String[] args) {
	 // 객체를 만들어야함
	 // new 클래스명;
	
	 Student s = new Student();
	 
	 s.setName("홍길동");
	 s.setAge(30);
	 
	 System.out.println("학생의 이름은 : " + s.getName()	);
	 System.out.println("학생의 나이는 : " + s.getAge());
	 
	 
	 
	 
	 
 }
}
