package stringIntger;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Converter converter = new Converter();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("문자열 입력: ");
			String input = sc.next();
			int num = converter.tolnt(input);
			
		} catch (Exception e) {
			System.out.println("숫자로 변환할수 없습니다.");
		}
		
		
		
		
	}
	
}
