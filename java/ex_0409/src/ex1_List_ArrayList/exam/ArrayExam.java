package ex1_List_ArrayList.exam;

import java.util.ArrayList;

public class ArrayExam {
	public static void main(String[] args) {
		// Integer 타입의 리스트 객체 만들기
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		// 리스트에 (1~30사의) 난수 10개 넣기
		
		for(int i = 0; i <10; i++) {
			int randomNumber = (int)(Math.random()*30)+1;
			list.add(randomNumber);
		}
		
		
		//리스트에 담긴 데이터 중 홀수의 총합을 구하세요
		int total = 0;
		
		for(int x : list) {
			if(x % 2 == 1) {
				total += x;
			}
		}
		System.out.println(list);
		System.out.println("총 합: " + total);
		
	}
}
