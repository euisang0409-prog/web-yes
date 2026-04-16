package ex2_charstream.exam;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		
		try {
		FileWriterExample fw = new FileWriterExample("hello.txt",true);
		
		fw.write("첫번째 줄 작성합니다.\n");
		fw.write("두번째 줄도 문제 없습니다.");
		
		fw.clone();
		} catch (Exception e) {
			
		}
		
		
		
		
	}
}
