package ex6_sealed;

public class SealedExample {
	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Dlrector d = new Dlrector();
		
		p.work();
		e.work();
		m.work();
		d.work();
		
		
	}
}
