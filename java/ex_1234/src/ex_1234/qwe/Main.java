package ex_1234.qwe;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("hong","홍길동", 20));
		list.add(new Member("lee","이영희", 18));
		list.add(new Member("kim","김철수", 40));
		
		for(Member m : list) {
			m.printInfo();
		}
		
		int count = 0;
		for(Member m : list) {
			if(m.getAge() >= 20) {
				count++;
			}
		}
		System.out.println("나이가 20세 이상인 회원 수: " + count);
		
	}
}
