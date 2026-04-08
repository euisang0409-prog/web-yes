package ex_0408q1;

public class Main {
	public static void main(String[] args) {
		
		GenericBox<String> box1 = new GenericBox<>();
		box1.setItem("»ç°ú");
		
		GenericBox<Integer> box2 = new GenericBox<>();
		box2.setItem(100);
		
		System.out.println(box1.getItem());
		System.out.println(box2.getItem());
		
	}
}
