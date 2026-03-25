package ex4_for;

import java.util.Scanner;

public class ForEaxmple {

	public static void main(String[] args) {
		 //지역 변수: 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		// 안에서 만든 변수는 바깥에서 사용할 수 없다.
		// 바깥에서 만든 변수는 안쪽에서 사용할 수 있다.
		
		
//		for( int i = 1; i<=3; i++) {
//			System.out.println(i+" ");
//			
//		}
//		
//		System.out.println("외부 i의 값: " + i);
//		
//		System.out.println("------------------------");
//		// 5부터 1까지 출력하기
//		for(int i = 5; i >= 1; i--) {
//			System.out.println(i + "");
//			
//		}
		
//		int sum = 0; // 총 합을 담을 변수
//		for(int i = 1; i <=10; i++) {
//			sum += i; // sum = sum + i;
//		}
//		System.out.println("1 ~ 10 까지의 총 합 : " + sum);
		
		// 1부터 10까지 3의 배수만 출력하는 for문 작성하기
		// 1부터 10까지 순회하는 역할
		
//		for(int i = 1; i <= 10; i++) {
//			if( i % 3 == 0) {
//				System.out.println("1 ~ 10 까지 3의 배수 : " + i);
//			}
//		}
		// 1부터 20까지 홀수만 출력하기
		
//		for(int i = 1; i <= 20; i++) {
//			if( i % 2 != 0) {
//				System.out.println("1 ~ 10 까지 홀수 : " + i);
//			}
//		}
		
		// 정수형 변수를 하나 초기화 한다.
		// 해당 정수에 해당하는 구구단 출력하기
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 3 = 9
		// ...
		// 3 x 9 = 27
//		
//		int num = 3;
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d x %d = %d\n",num, i, num*i);
//		}
		
		// 키보드에서 정수를 하나 입력받고
		// 1부터 입력받은 정수까지의 총 합 구하기
		// 예를 들어 5를 입력받으면 1 ~ 5 까지의 총합인 15를 출력해야한다.
		
//		Scanner sc = new Scanner(System.in); // 키보드
//		System.out.println("정수 입력: ");
//		int n = sc.nextInt();
//		int total = 0;
//		
//		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			total += i;
//			 System.out.println("1부터" + n + "까지의 총합" + sum);
//		}
		
		// 10개의 정수를 입력받고 그 수들 중 짝수가 몇개인지 구하세요
		
//		for(int i = 0; i <=9; i++) {
//			System.out.println();""
//		}
//		Scanner sc = new Scanner(System.in);
//
//        int count = 0; // 짝수 개수를 세는 변수
//
//        for(int i = 1; i <= 10; i++) {
//            System.out.print(i + "번째 정수 입력: ");
//            int num = sc.nextInt();
//
//            if(num % 2 == 0) { // 짝수인지 확인
//                count++;       // 짝수이면 count 증가
//            }
//        }
//
//        System.out.println("입력한 10개의 수 중 짝수의 개수: " + count);
		
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		
		
		
		
		
		
	}

}
