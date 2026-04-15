package ex3_bytestream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
 public static void main(String[] args) {
	// file.txt를 만들고 아무 내용이나 입력해둔다.
	// FileInputStream을 이용해 내용을 읽어온 뒤, 
	 // 뒤집어도 같은 내용인지 아닌지를 판별하세요
	 // 기러기, 토마토 -> 회문
	 
	 try {
		FileInputStream fis = new FileInputStream("file.txt");
		
		byte[] buffer = new byte[100];
		int length = fis.read(buffer);
		
		// 파일이 비어있는 경우
		if(length == -1) {
			System.out.println("파일이 비어있습니다.");
			fis.close();
			return;		
		}
		// 바이트 문자열 변환
		String text = new String(buffer, 0, length,"UTF-8").trim();
		
		// 뒤집기
		String reversed = new StringBuilder(text).reverse().toString();
		
		// 비교
		if(text.equals(reversed)) {
			System.out.println("회문입니다.");
		}else {
			System.out.println("회문이 아닙니다.");
		}
		
		fis.close();
		
	 } catch (FileNotFoundException e) {
		System.out.println("파일이 없습니다.");
	 } catch (IOException e) {
		e.printStackTrace();
	}
	 
	 
	 
	 
	 
	 
 
 	}
}
