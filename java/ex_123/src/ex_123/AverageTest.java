package ex_123;

public class AverageTest {

	public static void main(String[] args) {
	       int[] scores = {80, 90, 75, 100};
	       int sum = 0;

	       // 오류 발생 지점 [A] 
	 // 인덱스 배열 초과 오류 
	// 인덱스 배열은 0부터 length -1 까지 이므로 
	// 조건식 <=을 scores.length에 입력받아서 배열초과 오류가 됨
	       
	       for (int i = 0; i < scores.length; i++) {
	           sum += scores[i];
	       }

	 // 인트타입 정수 손실 오류
	 // int / int를 나누면 소수점이 사라지므로 
	 // 평균을 구할려면 형변환인 (doulbe)타입을 사용해야한다.
	       
	       // 오류 발생 지점 [B]
	       double average = (double)sum / scores.length;

	       System.out.println("평균 점수: " + average);
	   }	
}
