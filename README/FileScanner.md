# System.in.read() 키보드 입력 (바이트 기반 입력)

# File / I/O 개념 포함 전체 정리 (수업용 + 주석 포함)

---

# File 클래스

// File 클래스는 파일의 내용보다는 파일 자체에 대한 정보를 다룬다.
// 예: 파일명, 경로, 크기, 존재 여부, 파일인지 폴더인지 확인

---

# 경로 개념

## 절대경로

// 윈도우 기준 전체 경로
// 어디서 실행하든 동일한 위치

C:\Users\...\test.txt

## 상대경로

// 현재 프로젝트 기준 경로

./test.txt  
../test.txt

---

# 입출력 (I/O)

// Input : 외부 → 프로그램으로 데이터 입력
// Output : 프로그램 → 외부로 데이터 출력

---

# 스트림(Stream)

// 데이터가 흐르는 통로

---

# 바이트 기반 스트림

// 데이터를 1byte 단위로 처리
// 이미지, 영상, txt, exe 등 모든 파일 처리 가능

## 특징

// 인코딩 영향 없음
// 모든 파일 처리 가능
// 저수준 제어 가능

## 단점

// 문자 처리 불편
// 한글 깨질 수 있음

---

# FileInputStream

// 외부 파일 내용을 바이트로 읽는 클래스

## 특징

// 파일 경로가 없으면 FileNotFoundException 발생 가능
// read() 사용 시 IOException 발생 가능

## 문제점

// 한글은 2~3byte라 깨질 수 있음

## 해결 방법

// read(byte[] b) + new String(byte[])

---

# 문자 기반 스트림

// 텍스트 전용 스트림

## FileReader

// 문자를 하나씩 읽는 클래스

## FileWriter

// 문자를 파일에 쓰는 클래스

## 특징

// 한글 안 깨짐
// 자동 인코딩 처리

## 단점

// 이미지/영상 처리 불가

---

# System.in.read() 키보드 입력

## 개념

// System.in : 자바의 표준 입력 스트림
// 키보드 입력을 byte 단위로 받는다
// System.in.read(byte[]) : 입력을 byte 배열에 저장

---

# 코드

byte[] keyboard = new byte[100];

try {
System.out.println("값 :");

    // 키보드 입력을 byte 배열에 저장
    System.in.read(keyboard);

    // byte → String 변환
    String s = new String(keyboard).trim();

    System.out.println(s);

} catch (Exception e) {
// 예외 처리
}

---

# 동작 과정

1. 사용자가 키보드로 값을 입력한다
   // 문자, 숫자, 기호 모두 byte로 변환됨

2. byte 배열 생성
   // 입력값을 저장할 공간
   byte[] keyboard = new byte[100];

3. System.in.read(keyboard) 실행
   // 입력값이 byte 배열에 저장됨
   // 엔터(\n)도 포함될 수 있음

4. new String(keyboard)
   // byte → 문자열 변환

5. trim()
   // 앞뒤 공백 + 엔터 제거

---

# 핵심 개념

## System.in 특징

// 표준 입력 스트림
// 키보드 입력을 byte 단위로 처리

## System.in.read 의미

// 입력을 byte 배열에 직접 저장하는 저수준 방식

## String 변환 이유

// byte는 사람이 읽을 수 없기 때문에 문자열로 변환 필요

## trim() 역할

// 공백 제거
// 엔터 제거
// 입력 정리

---

# 장점

// Scanner 없이 입력 가능
// 스트림 구조 이해 가능
// 저수준 입출력 학습 가능

---

# 단점

// 사용 불편
// 한글 처리 문제 가능
// 실무에서는 거의 사용 안 함

---

# 한 줄 요약

// System.in.read()는 키보드 입력을 byte로 받아 배열에 저장하고 String으로 변환한 뒤 trim()으로 정리해서 사용하는 방식이다.
