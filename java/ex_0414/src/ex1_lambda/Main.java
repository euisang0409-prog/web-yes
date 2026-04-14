package ex1_lambda;

import ex1_lambda.exam.TextService;

public class Main {
	public static void main(String[] args) {
		
		CalculatorService cs = new CalculatorService();
		
		Calculator c = (a,b) -> a + b;
		
		cs.execute(c);
		// 직접전달 가능
		cs.execute((a,b) -> a-b);
		
		// 람다식을 반환받아서 사용
		
		Calculator add = cs.getCalculator("add");
		Calculator sub = cs.getCalculator("sub");
		
		System.out.println(add.calc(2, 4));
		System.out.println(sub.calc(8, 6));
	}
}
