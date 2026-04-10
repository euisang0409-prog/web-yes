package ex_123;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름:");
		String name = sc.next();
		
		System.out.println("Java 점수:");
		int Java = sc.nextInt();
		
		System.out.println("DB 점수 :");
		int DB = sc.nextInt();
		
		System.out.println("HTML 점수:");
		int HTML = sc.nextInt();
		
		int sum = Java + DB + HTML;
		double average = sum / 3;
		
		
		String result;
		
		if(average >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		System.out.println("결과: " + result);
		
		
		
		
		
		
		
		
	}
}
