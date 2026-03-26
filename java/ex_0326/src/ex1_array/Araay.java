package ex1_array;

import java.util.Scanner;

public class Araay {
	
	public static void main(String[] args) {
		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
	      //프로그램을 실행하면 몇명의 정보를 저장할 것인지를 입력한 후,
	      //입력받은 수 만큼 학생들의 이름과 수학,영어 성적을 입력받는
	      //프로그램 작성하기
	      
	      //예시
	      //등록할 인원 수 : 2
	      //이름 : 홍길동
	      //수학 : 90
	      //영어 : 87
	      //--------------------
	      //이름 : 독고길동
	      //수학 : 70
	      //영어 : 100
	      //--------------------
	      //2명 등록 완료!
	      //홍길동 90 87
	      //독고길동 70 100
//		Scanner sc = new Scanner(System.in);
//		System.out.println("등록할 인원 수 : ");	
//		 int n = sc.nextInt(); 
//		
//		String[][] str = new String[n][3];
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println("이름 : ");
//			str[i][0] = sc.next();
//			
//			System.out.println("수학 : ");
//			str[i][1] = sc.next();
//			
//			System.out.println("영어 : ");
//			str[i][2] = sc.next();
//			System.out.println("-----------------------");
//		}
//		System.out.println(str.length+"명 등록완료!");
//		for(int i = 0; i < str.length; i++) {
//			for(int j = 0; j < str[i].length; j++) {
//				System.out.print(str[i][j]+" ");
//			}
//			System.out.println();
//		}
	
		// 향상된 for 문 // 총합
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("총 합 : " + sum);
		
		
		
		
		
		
		
	}
}
