package ex1_lambda;

import ex1_lambda.exam.TextService;

public class Main {
	public static void main(String[] args) {
		
		CalculatorService cs = new CalculatorService();
		
		Calculator c = (a,b) -> a + b;
		
		cs.execute(c);
		// 직접전달 가능
		cs.execute((a,b) -> a-b);
		
		
		
	}
}
