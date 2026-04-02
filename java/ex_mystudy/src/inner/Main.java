package inner;

public class Main {
	public static void main(String[] args) {
		
		Calculator1 c = new Calculator1() {
			@Override
			public void add(int x, int y) {
				System.out.println("두 수의 합" + (x + y));
			}
		};
		c.add(10, 20);
	}
}
