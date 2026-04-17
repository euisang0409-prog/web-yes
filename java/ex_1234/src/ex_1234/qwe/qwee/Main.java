package ex_1234.qwe.qwee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("±èÃ¶¼ö", 5500));
		list.add(new Employee("ÀÚÃ¶¼ö", 2500));
		list.add(new Employee("µ¿Ã¶¼ö", 6500));
		list.add(new Employee("È£Ã¶¼ö", 8500));
		
		
		 Collections.sort(list, (e1, e2) -> e2.getSalary()- e1.getSalary());
		
		System.out.println("=== ±Þ¿© ³ôÀº ¼ø ===");
		
		for(Employee e : list) {
			e.printInfo();
		}
		
		
		Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		System.out.println("===ÀÌ¸§ ¿À¸§Â÷¼ø===");
		for(Employee e : list) {
			e.printInfo();
		}
		
	}
}
