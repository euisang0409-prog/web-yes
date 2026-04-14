# Java 어노테이션(Annotation) 정리

---

# 1. 기본 어노테이션

## @Deprecated
더 이상 사용을 권장하지 않는 기능 표시

---

## @SuppressWarnings

@SuppressWarnings({"unchecked", "unused"})

컴파일러 경고 메시지를 무시하도록 설정

경고 종류:
- unchecked : 제네릭 타입 검사 경고 무시
- unused : 사용하지 않는 변수/필드/메서드 경고 무시
- deprecation : deprecated 관련 경고 무시
- all : 모든 경고 무시

---

## @FunctionalInterface

@FunctionalInterface

함수형 인터페이스 지정

조건:
- 추상 메서드 1개만 존재해야 함

---

# 2. 어노테이션 유지 범위 (Retention)

@Retention

어노테이션이 언제까지 유지될지 결정

RetentionPolicy 종류:
- SOURCE : 소스 코드까지만 존재 (컴파일 후 삭제)
- CLASS : class 파일에는 존재 (실행 중 사용 불가)
- RUNTIME : 실행 중에도 유지 (리플렉션 사용 가능)

---

# 3. 어노테이션 적용 대상 (ElementType)

@Target(ElementType.XXX)

어노테이션을 어디에 붙일 수 있는지 지정

ElementType 종류:
- TYPE : 클래스, 인터페이스, enum
- METHOD : 메서드
- FIELD : 필드
- PARAMETER : 매개변수
- CONSTRUCTOR : 생성자
- TYPE_USE : 타입이 사용되는 모든 위치

---

# 4. 핵심 구조 예시

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
}

의미:
- 실행 중에도 유지됨
- 메서드에만 적용 가능

---

# 5. @SuppressWarnings 경고 종류

- unchecked : 타입 체크 안됨
- unused : 사용 안됨
- deprecation : deprecated 사용
- all : 모든 경고 무시

---

# 6. 핵심 요약

Retention:
- SOURCE : 컴파일 후 사라짐
- CLASS : class 파일까지만 존재
- RUNTIME : 실행 중에도 존재

ElementType:
- TYPE : 클래스/인터페이스/enum
- METHOD : 메서드
- FIELD : 변수
- PARAMETER : 매개변수
- CONSTRUCTOR : 생성자

---

# 한줄 정리

어노테이션 = 코드에 붙이는 설정 정보
Retention = 언제까지 유지할지
Target = 어디에 붙일지
SuppressWarnings = 경고 무시
FunctionalInterface = 함수형 인터페이스 보장