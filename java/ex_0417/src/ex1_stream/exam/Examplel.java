package ex1_stream.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examplel {
	public static void main(String[] args) {
		// 5만원 이상
		List<Integer> orders = 
		Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		
		orders.stream()
		.filter(x -> x >= 50000)
		.forEach(x -> System.out.print(x + " "));
		
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		
		System.out.println();
		System.out.println();
		boolean result = ages.stream()
				.anyMatch(x -> x > 20);
		System.out.println("미성년자가 한 명이라도 있는지: " + result);
		
		boolean result1 = ages.stream()
				.allMatch(x -> x < 20);
		System.out.println("전원이 성인지:" + result1);
		
		boolean result2 = ages.stream()
				.allMatch(x -> x < 100);
		System.out.println("100세 초과 회원이 없는지: "+ result2);
				
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println();
		
	int sum = numbers.stream()
		.filter(x -> x % 2 == 0)
		.mapToInt(x-> x * x)
		.sum();
	System.out.println("작수 제곱 합:" + sum);
		
	
//	학생 점수 목록에서 80점 이상인 점수만 내림차순 정렬하여 새로운 리스트로 만드시오
	
	List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		System.out.println();
		scores.stream()
		.filter(x -> x >= 80).sorted()
		.forEach(x -> System.out.print("학생점수:" + x + " \n" ));
		
//		단, 가격이 10000원 이상인 상품만 포함하시오.

		
		
		
	}
}
