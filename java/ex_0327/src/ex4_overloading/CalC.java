package ex4_overloading;

public class CalC {
	// 직사각형의 넓이를 구하는 area메서드를 작성하세요
	// 넓이는 메서드 내에서 출력하고 종료
	// 가로 * 세로
	public void area(int width, int height) {
		System.out.println("직사각형의 넓이 : " + (width * height));
	}
	
	// 오버로딩 해서 정사각형의 넓이를 구하는 메서드 만들기
		// 길이는 매개변수로 받는다.
		// 넓이는 반환받는다.
	public class Main {
	    public static void main(String[] args) {
	        Main m = new Main();

	        int result1 = m.area(5);
	        double result2 = m.area(3.5);

	        System.out.println(result1); // 25
	        System.out.println(result2); // 12.25
	    }

	    public int area(int side) {
	        return side * side;
	    }

	    public double area(double side) {
	        return side * side;
	    }
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

