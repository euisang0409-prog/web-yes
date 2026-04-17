package ex_0416.member;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("hong","홍길동",20));
		list.add(new Member("hong","고길동",17));
		list.add(new Member("hong","동길동",30));
		
		 for(Member m : list) {
			 m.printInfo();
		 }
		
		 int count = 0;
		 for(Member m : list) {
			 if(m.getAge() >= 20) {
				 count++;
			 }
		 }
		 System.out.println("나이가 20세 이상인 회원 수:" + count);
		 
	}
}
