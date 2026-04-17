package ex_1234.qwe.qwee;

public class Employee {

	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 급여: " + salary);
	}
	
}
