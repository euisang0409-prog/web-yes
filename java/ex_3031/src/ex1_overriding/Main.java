package ex1_overriding;

public class Main {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		
	RegularEmployee r = new RegularEmployee("김철수", 3000000);
    PartTimeEmployee p = new PartTimeEmployee("이영희", 10000, 500);

    System.out.println("정규직 " + r.name + "의 급여 : " + r.getPay());
    System.out.println("아르바이트 " + p.name + "의 급여 : " + p.getPay());
        
		
		
	}
	
	
	
	
	
}
