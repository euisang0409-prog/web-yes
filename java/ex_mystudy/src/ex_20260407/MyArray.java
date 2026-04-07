package ex_20260407;

public class MyArray {
	
//	int[] arr;
//	public MyArray(int size) {
//		arr = new int[size];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = 10;
//		}
//	}
//	
//	public void print() {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
//	}
	
	int[] arr;
		// 기본생성자
		public MyArray(int size) {
			arr = new int[size];
		}
		// 오버로딩 생성자
		public MyArray(int size,int valus) {
			arr = new int[size];
			
		for(int i = 0; i < arr.length; i++) {
			arr[i] = valus;
		}	
	}

		public void print() {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
}
