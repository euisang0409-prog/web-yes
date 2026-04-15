package ex1_lambda.exam;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {	
		Printer printer = new Printer();
		executePrint(printer::print, "람다식 전달 연습");
		
	}
	static void executePrint(Consumer<String> action, String message) {
		action.accept(message);
	
	}
}
