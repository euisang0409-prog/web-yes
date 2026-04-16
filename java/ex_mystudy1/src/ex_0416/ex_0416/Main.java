package ex_0416.ex_0416;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("hong", "È«±æµ¿", 20));
		list.add(new Member("kim", "±èÃ¶¼ö", 25));
		list.add(new Member("ho", "È£±æµ¿", 18));
		
		int count = 0;
		
		for(Member m : list) {
			m.printInfo();
			if(m.get() >= 20) {
				count++;
			}
		}
		System.out.println("20¼¼ ÀÌ»ó È¸¿ø ¼ö: " + count);
		
		
		
		
		
		
	}
}
