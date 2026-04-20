# FileOutputStream 예제 (바이트 기반 출력 스트림)

---

# 개념
// FileOutputStream은 파일에 데이터를 "바이트 단위로" 출력(저장)하는 클래스이다.
// 파일이 없으면 생성하고, 있으면 덮어쓴다.

---

# 코드

package ex1_bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			// 파일 출력 스트림 생성
			// 파일이 없으면 생성됨
			// 접근 불가능하면 FileNotFoundException 발생
			fos = new FileOutputStream("test.txt");

			// 문자 하나씩 바이트로 저장
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');

			// 문자열 작성
			String msg = "fileOutput 예제입니다. \n";
			String msg2 = "여러줄도 가능합니다.\n";

			// 문자열 → byte 배열 변환 후 저장
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());

		} catch (FileNotFoundException e) {
			// 파일 생성 실패 또는 경로 문제
			e.printStackTrace();

		} catch (IOException e) {
			// 입출력 중 오류 발생
			e.printStackTrace();

		} finally {
			try {
				// 스트림 닫기 (필수)
				// 자원 해제
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

---

# 동작 과정

1. FileOutputStream 생성
// test.txt 파일을 열거나 새로 생성한다.

2. write('f') 실행
// 문자 1개를 ASCII/byte로 변환해서 저장

3. 문자열 처리
// 문자열은 그대로 저장할 수 없으므로 byte 배열로 변환

msg.getBytes()
// 문자열 → byte 배열 변환

4. write(byte[]) 실행
// 변환된 byte 배열이 파일에 저장됨

5. close() 실행
// 스트림 종료 및 자원 해제

---

# 핵심 개념

## FileOutputStream 특징
// 파일에 데이터를 바이트 단위로 저장하는 출력 스트림
// 파일이 없으면 생성됨
// 있으면 덮어쓰기 됨

---

## write() 종류

write(int b)
// 1바이트 출력

write(byte[] b)
// 여러 바이트 출력 (문자열 처리 시 사용)

---

## getBytes()
// 문자열을 byte 배열로 변환하는 메서드
// FileOutputStream에서 문자열 출력할 때 필수

---

## close()
// 스트림 종료
// 메모리 누수 방지
// 반드시 finally에서 처리

---

# 장점
// 이미지, 영상, 텍스트 등 모든 파일 처리 가능
// 저수준 제어 가능
// 인코딩 영향 없음

---

# 단점
// 문자 처리 불편
// 한글 직접 처리 어려움 (byte 변환 필요)

---

# 한 줄 요약
FileOutputStream은 데이터를 바이트 단위로 파일에 저장하는 출력 스트림이며, 문자열은 반드시 getBytes()로 변환해서 사용한다.