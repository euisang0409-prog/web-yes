package ex2_charstream.exam;

import java.io.FileReader;

public class Example {
	public static void main(String[] args) {
		// tset.txt 파일에 아무 내용이나 적는다.
		// 내용을 읽어와서 영어 대문자와 소문자가 몇개있는지
		// 각각 출력하세요
		
		// 대문자 : 7
		// 소문자 : 22
		
		
		try (FileReader fi = new FileReader("test.txt");){
			
			int upperCount = 0;
			int lowerCount = 0;
			
			int data;
			while((data = fi.read())!= -1) {
				
				char ch = (char)data;
				
		if(ch >= 'A' && ch <= 'Z') {
			upperCount++;			
		}else if(ch >= 'a' && ch <= 'z') {
			lowerCount++;
		}
	
		System.out.println("대문자: " + upperCount);
		System.out.println("소문자: " + lowerCount);
				
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
