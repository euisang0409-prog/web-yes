package ex1_lombok;

public class Main {
	public static void main(String[] args) {
//		Member m = new Member();
//		m.setId("2026002");
//		m.setName("박길동");
//		m.setAge(30);
		
		Member m2 = new Member("2026001", "홍길동", 40);
		System.out.println(m2);
	}
}
