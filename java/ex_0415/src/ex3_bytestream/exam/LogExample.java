package ex3_bytestream.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LogExample {
	public static void main(String[] args) {
		// error.log파일을 읽어서 "ERROR" 라는 단어가 몇번 등장하는지 출력하세요
				
		try {
			FileInputStream fis = new FileInputStream("logs/error.log");
			byte[] buffer = new byte[1024];
			int length = fis.read(buffer);
			
	String text = new String(buffer, 0, length, "UTF-8");
	int count = 0;
	int index = 0;
	while((index = text.indexOf("ERROR",index)) != -1){
		count++;
		index += "ERROR".length();
	}
			System.out.println("ERROR 개수:" + count);
			fis.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
}
