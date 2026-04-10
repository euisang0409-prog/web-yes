package ex_0409_1;

public class AverageTest {

	public static void main(String[] args) {
	       int[] scores = {80, 90, 75, 100};
	       int sum = 0;

	       // 오류 발생 지점 [A] // 배열 인덱스 초과 오류 
	    // 배열의 인덱스는 0부터 length -1까지인데 조건식 <=를 사용하여
	    // 스코어[랭스]에 접근하여 오류가 발생
	      
	       for (int i = 0; i <= scores.length; i++) {
	           sum += scores[i];
	       }

	       // 오류 발생 지점 [B] intx double을 사용해야함 평균을 구해야 하기
	  // 정수 나눗셈으로 인한 손실 원인 정수형에서 나누면 정수형이 되어 소수점 삭제
	    // 평균을 실수형으로 계산해야 하므로 double타입을 사용해햐
	       double average = (double)sum / scores.length;

	       System.out.println("평균 점수: " + average);
	   }

}
