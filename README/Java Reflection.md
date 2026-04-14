# Java 예외 처리 + Math + Calendar + Reflection 정리

---

# 1. 예외 처리 (Exception Handling)

## throws Exception

throws Exception

이 함수에서 예외가 발생할 수 있지만 직접 처리하지 않고 호출한 곳(Main 등)으로 던짐

---

## try

try {
}

에러가 발생할 수 있는 코드를 실행하는 블록

---

## Integer.parseInt()

Integer.parseInt(str)

문자열을 정수로 변환

- "123" → 123
- "abc" → NumberFormatException 발생

---

## catch (NumberFormatException e)

catch (NumberFormatException e) {
}

문자열 → 숫자 변환 실패 시 예외를 잡아서 처리

---

## throw Exception

throw new Exception("숫자 형식 오류");

강제로 예외를 발생시키고 메시지를 지정해서 호출한 곳으로 전달

---

## throw new IllegalArgumentException

throw new IllegalArgumentException("잘못된 값");

잘못된 값이 들어왔을 때 강제로 예외 발생

용도:
- "이 값은 처리 불가능하다"를 명확하게 표시

---

# 2. Math 클래스

ceil → 올림  
floor → 내림  
abs → 절대값  
max → 최대값  
min → 최소값  
round → 반올림  
pow → 제곱  
sqrt → 제곱근  

---

# 3. Calendar 클래스

Calendar.YEAR → 년도  
(Calendar.MONTH) + 1 → 월 (0부터 시작해서 +1 필요)  
Calendar.DAY_OF_MONTH → 일  

---

# 4. Reflection (리플렉션)

getDeclaredConstructors()

클래스의 모든 생성자 정보를 가져옴

---

Constructor

생성자 정보를 담고 있는 클래스

---

c.getParameterTypes()

생성자의 매개변수 타입을 배열로 반환

---

# 한줄 정리

throws → 예외 던짐  
try → 실행 구역  
catch → 예외 처리  
throw → 강제 예외 발생  

Math → 수학 계산 함수 모음  
Calendar → 날짜 정보  
Reflection → 클래스 구조 분석