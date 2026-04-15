# Java 함수형 인터페이스 & 람다식 정리

## 1. 람다식과 함수형 인터페이스

람다식을 사용하기 위해서는 함수형 인터페이스가 필요하다.
매번 직접 만들기에는 부담스럽기 때문에 Java에서는 자주 사용되는 형태의 함수형 인터페이스를 미리 제공한다.

람다식은 결국 추상 메서드를 오버라이딩하는 것이다.

---

## 2. 주요 함수형 인터페이스

Function<T, R>
- R apply(T t)
- 매개변수 1개, 반환값 있음

Consumer<T>
- void accept(T t)
- 매개변수 1개, 반환값 없음

Supplier<T>
- T get()
- 매개변수 없음, 반환값 있음

Predicate<T>
- boolean test(T t)
- 매개변수 1개, 반환값 boolean

---

## 3. 매개변수가 2개인 경우

BiConsumer<T, U>
- void accept(T t, U u)

BiPredicate<T, U>
- boolean test(T t, U u)

BiFunction<T, U, R>
- R apply(T t, U u)

---

## 4. 람다식의 합성과 결합

Function 합성
- f.andThen(g) : f 실행 후 g 실행
- f.compose(g) : g 실행 후 f 실행

Predicate 결합
- f.and(g) : f와 g 모두 true일 때 true
- f.or(g) : f 또는 g 중 하나라도 true면 true
- f.negate() : true -> false, false -> true

---

## 5. 핵심 정리

람다식 = 추상 메서드 구현
Java는 자주 쓰는 형태를 함수형 인터페이스로 제공
상황에 맞게 Function / Consumer / Supplier / Predicate 사용