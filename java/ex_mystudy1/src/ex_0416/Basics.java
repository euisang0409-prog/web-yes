package ex_0416;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//			
//	System.out.println("최댓값: " + max);
//	System.out.println("최솟값: " + min);
	
		
//	int[] arr = new int[5];
//	System.out.println("점수 입력:");
//	for(int i = 0; i < arr.length; i++) {
//		arr[i] = sc.nextInt();
//	}
//		
//	int even = 0;
//	int odd = 0;
//	
//	for(int i = 0; i < arr.length; i++) {
//		if(arr[i] % 2 == 0) {
//		even++;
//		}else {
//			odd++;
//		}
//	}
//		
//	System.out.println("짝수: " + even);
//	System.out.println("홀수: " + odd);
		
		int[] arr = new int[5];
		System.out.println("점수 입력:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int second = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				
				second = max;
				max = arr[i];
			}else if(arr[i] > second && arr[i] != max) {
				second = arr[i];
			}
		}   
		
		System.out.println("두번째로 큰 값: " + second);
		
		
		
		
		
		
		
		
		
	}
}
