package ex1_bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CoypExample {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			// 원본 이미지 파일을 읽기 위한 InputStream 생성
			// wall.jpg 파일을 바이트 단위로 읽는다
			in = new FileInputStream("wall.jpg");

			// 복사본 파일을 만들기 위한 OutputStream 생성
			// wall_copy.jpg 파일이 생성되고 여기에 데이터가 저장된다
			out = new FileOutputStream("wall_copy.jpg");
			byte[] buffer = new byte[512];
			// 복사 시작 시간 측정
			long start = System.currentTimeMillis();

			int data;
			
			// 1바트식 파일을 읽어와서
			while ((data = in.read(buffer)) != -1) {
				// 바로 작성하기
				// buffer의 0부터 data개만큼 출력파일에 기록
				out.write(buffer,0,data);
			}
			// 파일은 4mb임 
			// 우리가 전달한 파일은512byte
			// 우리가 전달한 파일을 512바이트씩 잘라서 여러번 읽고 쓰는 방식
			
			// 복사 종료 시간 측정
			long end = System.currentTimeMillis();

			System.out.println("이미지 복사 완료");
			System.out.println("걸린 시간: " + (end - start) + "ms");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				// 자원 해제 (역순으로 닫기)

				// InputStream 닫기
				if (in != null) {
					in.close();
				}

				// OutputStream 닫기
				if (out != null) {
					out.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}