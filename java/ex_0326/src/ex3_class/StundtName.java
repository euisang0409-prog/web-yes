package ex3_class;

public class StundtName {
 public static void main(String[] args) {
	 Stundt s = new Stundt();
		
		s.name = "유의상";
		s.age = 26;
		s.score = 100;
		
		System.out.println("이름 : " + s.name);
		System.out.println("나이 : " + s.age);
		System.out.println("점수 : " + s.score);
		
		Stundt s2 = new Stundt();
		
		System.out.println("--------------------------------------");
		
		s2.name = "홍길동";
		s2.age = 260;
		s2.score = 1000;
		
		System.out.println("이름 : " + s2.name);
		System.out.println("나이 : " + s2.age);
		System.out.println("점수 : " + s2.score);
		
		Stundt s3 = new Stundt();
		
		System.out.println("--------------------------------------");
		
		s3.name = "고길동";
		s3.age = 2600;
		s3.score = 10000;
		
		System.out.println("이름 : " + s3.name);
		System.out.println("나이 : " + s3.age);
		System.out.println("점수 : " + s3.score);
		
    }	
}
