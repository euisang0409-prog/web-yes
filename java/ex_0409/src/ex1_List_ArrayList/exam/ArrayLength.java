package ex1_List_ArrayList.exam;

import java.util.ArrayList;

public class ArrayLength {
	public static void main(String[] args) {
		
		// 문자열 타입 리스트 객체를 만든다.
		ArrayList<String> list = new ArrayList<String>();
		// 리스트에 "Java", "Spring","HTML","CSS"를 저장하기
		list.add("Java");
		list.add("Spring");
		list.add("HTML");
		list.add("CSS");
		// 각문자열의 길이를 계산하여 lengths라는 새로운 리스트를
		// 만들어서 저장하기
		ArrayList<Integer> lengths = new ArrayList<>();
		for(String str : list) {
			lengths.add(str.length());
		}
	System.out.println(lengths);
		
		
		// lengths 리스트를 출력하기
	
	// 문자열 형태의 리스트 생성하기
	// "김철수", "이영희", "김철수", "박민수", "김철수" 저장하기
	// 리스트에서 "김철수"가 몇번 들어있는지 계산하여 출력하세요
	
	ArrayList<String> list1 = new ArrayList<>();
	
	list1.add("김철수");
	list1.add("이영희");
	list1.add("김철수");
	list1.add("박민수");
	list1.add("김철수");
	
	int count = 0;
	for(String name: list1) {
		if(name.equals("김철수")) {
			count++;
		}
	}
	System.out.println("김철수 개수 : " + count);
	
	ArrayList<Integer> scores = new ArrayList<>();
	
	scores.add(88);
	scores.add(72);
	scores.add(95);
	scores.add(60);
	scores.add(81);
	
	int max = scores.get(0);
	int min = scores.get(0);
	
	for(int score : scores) {
		if(score > max) {	
			max = score;
		}
		if(score < min) {	
			min = score;
		}
	}
	
	System.out.println("최고점수: " + max);
	System.out.println("최소점수: " + min);
	
	
	
		
	}
}
