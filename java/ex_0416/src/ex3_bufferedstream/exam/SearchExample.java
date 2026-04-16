package ex3_bufferedstream.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class SearchExample {
	public static void main(String[] args) {
		
	try (
		BufferedReader keybword = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader fileBr = new BufferedReader(new FileReader("story.txt"));
			){
		System.out.println("검색어 입력:");
		String keyword = keybword.readLine();
		String line;
		
		while ((line = fileBr.readLine()) != null) {
			if(line.contains(keyword)) {
				System.out.println(line);
			}
		}

	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
	

		
		
		
		
		
	}
}
