package ex_0406;

public class Main {
	public static void main(String[] args) {
		
//		Calculator c = new Calculator();
//		
//		System.out.println("add 결과: "+ c.add(10, 10));
//		System.out.println("subtract 결과:"+ c.subtract(11, 10));
//		System.out.println("multiply 결과 : " + c.multiply(5, 5));
//		System.out.println("divide 결과 : " + c.divide(10, 2));
		
		Animal[] animals = new Animal[2];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		
		for(Animal a : animals) {
			a.sound();
		}
		
		
		
		
		
	}
}
