package ex1_lambda.exam;

public class Main {
	public static void main(String[] args) {
		
TextService ts = new TextService();
		
		String text = "This product is currently out of stock.";
		
	String result =	ts.processText(text, str -> str.toUpperCase());
	
		System.out.println(result);
		
		result = ts.processText(text, str -> str.replace("out of stock", "in stock"));
		System.out.println(result);
		
		
	}
}
