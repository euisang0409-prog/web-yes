package ex_0410_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lsitt {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
		System.out.println("문자 입력 (종료: exit):");	
		
			if(input.equals("exit")) {
				break;
			}
			
			list.add(input);
			
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
	}
}
