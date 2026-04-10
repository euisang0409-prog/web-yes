package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Bingo {
	public static void main(String[] args) {
		
	// 1 ~ 50사이의 난수가 있다.
	// 5 X 5의 빙고판에 25개의 숫자를 채운다.
	// 겹치면 안됨!
		
	// 만약 숫자가 오름차순으로 연속되게 나오면 섞어주기

	// ex) 	
	// 5 7 23 9 13
	// 41 38 17 10 3
	// 28 26
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 25){
			int rand = (int)(Math.random() * 50)+1;
			set.add(rand);
		}
		List<Integer> list = new ArrayList<>(set);
		 Collections.shuffle(list);
		
	int index = 0;	 
	for(int i = 0; i < 5; i++) {
		for(int j = 0; j < 5; j++) {
			System.out.print(list.get(index++) + "\t");
		}
		System.out.println();
	}
		
		
		
		
		
		
		
	}
}
