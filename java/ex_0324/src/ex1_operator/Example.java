package ex1_operator;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// 상자 하나에는 농구공	이 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가.
		
//		int ball = 23;
//		int box = (ball + 2) / 5;
//		System.out.println(box);
		
//		Scanner sc = new Scanner(System.in);
//		 System.out.print("농구공 개수 입력: ");
//	        int ball = sc.nextInt();
//
//	        int box = (ball + 4) / 5;
//
//	        System.out.println("필요한 상자 개수: " + box);
//
//	        sc.close();
//		int a = 32;
//		int box = (a + 4) / 6;
//		System.out.println(box);
		
//		int a = 45;
//		int box = (a + 10) / 12;
//		System.out.println(box);
		
		// *********************************************************
		// 사각형의 가로와 세로의 길이를 입력받아
		// 넓이와 둘레 구하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사각형의 가로 : ");
//		int width = sc.nextInt();
//		System.out.println("사각형의 세로 : ");
//		int height = sc.nextInt();
//		
//		int area = (width * height);
//		int round = 2 + (width + height);
//		System.out.println("넓이 : " + area);
//		System.out.println("둘레 : " + round);
		
		// 학생은 하루에 일정한 금액의 용돈을 받는다.
		// 하루에 받는 용돈 : money
		// 날짜 수 : day
		// 총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을
		// 출력하는 코드 작성하기
		
		// 각 값들은 키보드에서 입력받는다.
		
		Scanner sc = new Scanner(System.in);

//		System.out.println("하루에 받는 용돈 " );
//		int money = sc.nextInt();
//		
//		System.out.print("날짜 : ");
//		int day = sc.nextInt();
//		System.out.println("쓴 돈 : "  );
//		int used = sc.nextInt();
//		
//		int remain = (money * day) - used;
//		System.out.println("남은 돈 : " + remain);
		
		// 국어, 영어, 수학에 대한 점수를 키보드에서 입력받는다.
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기 (합계/3.0)
		// 3. 세 과목의 점수가 각각 60점 이상이고, 평균이 60점 이상일 때 합격
		// 아니면 불합격 처리
		// 60 60 60 -> 합격
		// 30 80 100 -> 불합격 
		
		System.out.println("국어 : ");
		int korean = sc.nextInt();
		
		System.out.println("영어 : ");
		int english = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		if(	korean >= 60 && english >= 60 && math >= 60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	
	}
}
