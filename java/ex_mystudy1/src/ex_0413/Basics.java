package ex_0413;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int [] arr = new int[5];
//			System.out.println("점수 입력: ");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//			}
			
//		int [] arr = new int[5];
//		int max = arr[0];
//		System.out.println("점수 입력: ");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] > max) {
//				max = arr[i];
//				
//			}
//			
//		}
//		System.out.println(max);
		
		
//		int[] arr = new int[5];
//		int min = 0;
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println(min);
//		
		
//		int[] arr = new int[5];
//		int max = 0;
//		int min = 0;
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(i == 0) {
//			
//			}else if(arr[i] < max) {
//				max = arr[i];
//				min = arr[i];
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
		
		
//		int [] arr = new int[5];
//		int max = arr[0];
//		int min = arr[0];
//		System.out.println("입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(i == 0) {
//							
//			}else if(arr[i] < max) {
//				max = arr[i];
//				min = arr[i];
//			}
//		}
//		System.out.println("최대값:" + max);
//		System.out.println("최소값:" + min); 
		
//		int [] arr = new int[5];
//		System.out.println("입력");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}else if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println("최대값:" + max);
//		System.out.println("최소값:" + min);
		
		

        int[] arr = new int[5];

        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;

        System.out.println("숫자 5개 입력:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if(arr.length % 2 == 0) {
        	System.out.println("짝수입니다.");
        }else if(arr.length % 1 == 0) {
        	System.out.println("홀수입니다.");
        }
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
	}
}
