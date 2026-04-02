package app;

import Pack1.A;	// my_module_a¿¡¼­ °¡Á®¿È
import Pack2.B;	// my_module_a¿¡¼­ °¡Á®¿È
import Pack3.C;	// my_module_b


public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		B b = new B();
		b.mehod();
		
		C c = new C();
		c.method();
		
		c.result = a.getC();
		result.method();
		
		
	}
}
