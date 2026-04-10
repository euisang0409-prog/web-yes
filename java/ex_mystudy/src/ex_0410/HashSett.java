package ex_0410;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSett {
	public static void main(String[] args) {
		
	Set<Integer> lotto = new HashSet<Integer>();
		
	while(lotto.size() < 6) {
		int num = (int)(Math.random()*45)+1;
			lotto.add(num);	
	}
	Iterator<Integer> iter = lotto.iterator();

		while(iter.hasNext()){
			int n = iter.next();
			System.out.println(n);
		}
		while(iter.hasNext()) {
		    int n = iter.next();
		    
		    if(n % 2 == 0) {
		        iter.remove(); // Â¦¼ö »èÁ¦
		    }
		    System.out.print(n);
		}
		
	}
}
