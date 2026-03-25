package ex3_break;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// 1 ~ 45 사이의 난수 뽑기
//		int rand = (int)(Math.random()*45)+1;
//		
//		Scanner sc = new Scanner(System.in);
//		int answer;
//		
//		while(true) {
//			System.out.print("정답 : ");
//			answer = sc.nextInt();
//			// 입력받은 answer랑 난수랑 일치하면 
//			// 반복문을 빠져나가게 해줘
//			if(answer == rand) {
//				break;
//			}
//		}
		
		// updown 게임을 for문을 이용해서 만들기
		// 기회는 10번
		// 중간에 정답을 맞추면 반복문 종료하고 " 정답입니다 " 출력하기
		// 입력한 값이 정답보다 작으면 "up"
		// 입력한 값이 정답보다 크면 "down"
		// 10번만에 못맞추면 "정답을 맞추지 못했습니다."
		
//		System.out.println("맞추기 게임");
//		int rand = (int)(Math.random()*10)+1; // 정답
//		
//		Scanner sc = new Scanner(System.in);
//		int input;
//		
//		for(int i = 0; i < 10; i++) {  	//기회 10번
//			System.out.println(( i + 1) + " 번째 시도 :");
//			input = sc.nextInt();
//			if(rand == input) {
//				System.out.println("정답입니다.");
//				break;
//			}else if(input < rand) {
//				System.out.println("up");
//			}else if(input > rand) {
//				System.out.println("down");
//			}
//				
//			if( i ==9 ) {
//				System.out.println("정답을 맞추지 못했습니다.");
//			}
//				
//			}
			
		// 라벨 
		outer:for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println(i+" " + j);
				if(j == 3) {
					
					break outer;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
