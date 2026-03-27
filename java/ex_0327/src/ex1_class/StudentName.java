package ex1_class;

public class StudentName {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "유의상";
		s.age= 26;
		s.score = 100;
		
		System.out.println("이름 : " + s.name);
		System.out.println("나이 : " + s.age);
		System.out.println("점수 : " + s.score);
		
		Student s2 = new Student();
		
		System.out.println("--------------------------------------");
		
		s2.name = "홍길동";
		s2.age = 260;
		s2.score = 1000;
		
		System.out.println("이름 : " + s2.name);
		System.out.println("나이 : " + s2.age);
		System.out.println("점수 : " + s2.score);
		
		
		
		System.out.println("--------------------------------------");
		Student s3 = new Student();
		
		s3.name = "고길동";
		s3.age = 2600;
		s3.score = 10000;
		
		System.out.println("이름 : " + s3.name);
		System.out.println("나이 : " + s3.age);
		System.out.println("점수 : " + s3.score);
		
		
		Student[] students = {s, s2 , s3};
		
		// 배열에는 같은 타입의 데이터만 넣을 수 있다.
		// 데이터의 타입은 배열 앞에 명시한다.
		
		System.out.println("--------------------------------------");
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name); 
			System.out.println("나이 : " +students[i].age);
			System.out.println("점수 : " +students[i].score);
			System.out.println("-------------------");
			+
			
		}
		
		 
		
	}

}
