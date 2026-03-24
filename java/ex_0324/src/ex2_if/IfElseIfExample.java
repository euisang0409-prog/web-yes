package ex2_if;

public class IfElseIfExample {

	public static void main(String[] args) {
		int score = 101;
		
		// 점수가 100점에서 90점 "A"
		// 89 ~ 80점 "B"
		// 79 ~ 70점 "C"
		// 69 ~ 60점 "F"
		// 0보다 작은수가 들어왔을 때도 " 
		
		if(score > 100 ) {
			System.out.println("100이하의 수 만 입력하세요");
		}else if(score < 0) {
			System.out.println("0이하의 숫자는 안됩니다.");
		}else if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
			
		
		
		
		
	}
}
