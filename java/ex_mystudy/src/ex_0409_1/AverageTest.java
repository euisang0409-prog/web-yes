package ex_0409_1;

public class AverageTest {

	public static void main(String[] args) {
	       int[] scores = {80, 90, 75, 100};
	       int sum = 0;

	       // 오류 발생 지점 [A] // 배열 인덱스 초과 오류 
	       for (int i = 0; i <= scores.length; i++) {
	           sum += scores[i];
	       }

	       // 오류 발생 지점 [B] intx double을 사용해야함 평균을 구해야 하기
	       int average = sum / scores.length;

	       System.out.println("평균 점수: " + average);
	   }

}
