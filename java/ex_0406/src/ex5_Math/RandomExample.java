package ex5_Math;

import java.util.Arrays;
import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		// 로또번호 (1 ~ 45)를 뽑아서 배열에 넣는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~45 숫자 6개 입력 : "); 		// 방은 6개 만들었다.
		int[] user = new int[6];
		for(int i = 0; i < user.length; i++) {	// 키보드로 6숫자를 적어라
			user[i] = sc.nextInt();		
		}
		
		int[] lotto = new int[6];
	outerLotto:for(int j = 0; j < lotto.length; j++) {
			lotto[j] = (int)(Math.random()*45)+1;
			
			// 중복제거
			for(int k = 0; k < j; k++) {
				if(lotto[j] == lotto[k]) {
					j--;	//중복제거
					continue outerLotto; // 다시뽑기
				}			
			}							
		}
		
		
		
		
		//키보드에서 6개의 숫자를 입력받아서 번호 맞추기
	Arrays.sort(lotto);
	Arrays.sort(user);
		
	System.out.println("로또 번호 : " + Arrays.toString(lotto));
	System.out.println("내 번호 : "  + Arrays.toString(user));
	
	if(Arrays.equals(lotto, user)) {
		System.out.println("1등 당첨");
	}else {
		System.out.println("꽝");
	}
	// 각 배열을 정렬한 뒤 Arrays.equals(null, null) 활용하기
		
		
		
		
		
		
	}
}
