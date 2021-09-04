<h2>10. 상속</h2>

-  상속의 개념
-  상속: 기존의 클래스에 기능을 추가하거나 재정의하는 것(부모 클래스, 자식 클래스)
-  자식 클래스: class 자식클래스이름 extends 부모클래스이름
-  Object 클래스: 모든 클래스의 부모가 되는 클래스
---
- super와 super()
- super 키워드: 부모클래스의 필드나 메소드를 자식 클래스에서 참조할 때 쓰는 참조변수

```java
class Parent {
    int a = 10;
}
class Child extends Parent {
    int a = 20;
    void display() {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}
public class Inheritance03 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
```

- super() 메소드
- 부모 클래스의 생성자를 호출할 때 사용
```java
class Parent {
    int a;
    Parent() { a = 10; }
    Parent(int n) { a = n; }
}
class Child extends Parent {
    int b;
    Child() {
      //super(40);
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Inheritance04 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
```
---
- 메소드 오버라이딩
- 상속받은 부모 클래스의 메소드를 재정의해서 사용하는 것
```java
class Parent {
    void display() {
        System.out.println("부모 클래스의 display() 메소드입니다.");
    }
}

class Child extends Parent {
    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }
}

public class Inheritance05 {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.display();
        Child ch = new Child();
        ch.display();
        Parent pc = new Child();
        pc.display(); // Child cp = new Parent();
    }
}
```
- 오버로딩과 오버라이딩
- 오버로딩: 새로운 메소드를 정의
- 오버라이딩: 상속받은 기준의 메소드를 재정의
---
<h2>11. 다형성</h2>
- 다형성은 상속, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나
- 참조 변수의 타입 변환: (변환할 타입의 클래스 이름) 변환할 참조 변수
```java
class Parent {}
class Child extends Parent {  }
class Brother extends Parent {  }

Parent pa01 = null;
Child ch = new Child();
Parent pa02 = new Parent();
Brother br = null;

pa01 = ch;          
br = (Brother)pa02;
```
- instanceof 연산자
- 참조변수가 참조하고 있는 인스턴스의 실제 타입을 확인할 수 있도록 해줌
- 참조변수 instanceof 클래스이름
---
- 추상 클래스
- 추상메소드: 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드
- abstract 반환타입 메소드이름();
- 추상 클래스: 하나 이상의 추상 메소드를 포함하는 클래스
- 추상 메소드의 사용 목적: 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함
---
- 인터페이스: 인터페이스를 통한 다중 상속 지원, 추상 메소드와 상수만을 포함
- 인터페이스 선언 형식
```
접근제어자 interface 인터페이스이름 {
    public static final 타입 상수이름 = 값;
    public abstract 메소드이름(매개변수목록);
}
```
- 인터페이스의 구현
```java
class 클래스이름 implements 인터페이스이름 {  }
```
---
- 내부 클래스
- 하나의 클래스 내부에 선언된 또 다른 클래스
1. 정적 클래스 : static 키워드를 가지는 클래스, 외부 클래스의 클래스 메소드로 사용될 목적
2. 인스턴스 클래스: 외부 클래스 중에서 static 키워드를 가지지 않는 클래스
3. 지역 클래스: 외부 클래스의 메소드, 초기화 블록에 선언된 클래스
4. 익명 클래스: 선언과 동시에 생성해서 참조변수에 대입
```
클래스이름 참조변수이름 = new 클래스이름(){
    // 메소드의 선언
};
```
<h2>12.자바 API 클래스</h2>
- Object 클래스
- java.lang.Object 클래스: 모든 메소드를 바로 사용할 수 있음
- toString() 메소드: 인스턴스에 대한 정보를 문자열로 반환
- equals() 메소드: 비교해서 true, false 값 반환
- clone() 메소드: 인스턴스 복제(단, 필드의 값만 복사하기 때문에 오버라이딩해서 제대로복제할 수 있도록 해야 함)
---
- String 클래스
- charAr() 메소드: 인덱스에 해당하는 문자 반환
```java
String str = new String("Java");
System.out.println("원본 문자열 : " + str);
for (int i = 0; i < str.length(); i++) {
    System.out.print(str.charAt(i) + " ");
}
System.out.println("\ncharAt() 메소드 호출 후 원본 문자열 : " + str);
```
- compareTo() 메소드: 사전 편찬 순으로 비교
```java
String str = new String("abcd");
System.out.println("원본 문자열 : " + str);//abcd

System.out.println(str.compareTo("bcef"));
System.out.println(str.compareTo("abcd") + "\n");

System.out.println(str.compareTo("Abcd"));
System.out.println(str.compareToIgnoreCase("Abcd"));
System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);//abcd
```
- concat() 메소드: 해당 문자열의 뒤에 인수로 전달된 문자열을 추가한 새로운 문자열 반환
- indexOf() 메소드: 특정 문자나 문자열이 등장하는 위치의 인덱스 반환
- trim() 메소드: 맨 앞과 맨뒤의 공백 문자 제거
- toLowerCase()와 toUpperCase()메소드: 각각 소문자, 대문자로 변환
---
- StringBuffer 클래스
- StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 수도 있음
- append() 메소드: 값을 문자열로 변환하고 문자열의 마지막에 추가
- capacity 메소드: 인스턴스의 버퍼 크기 반환
- delete() 메소드: 해당 부분의 문자열을 제거
- insert() 메소드: 해당 부분에 문자열을 추가
---
- Math 클래스
- random() 메소드: double 형을 생성하여 반환
- abs() 메소드: 음수이면 절대값을 반환, 양수이면 그대로 반환
- floor() 메소드: 가장 큰 정수 반환
- ceil() 메소드: 가장 작은 정수 반환
- round() 메소드: 소수점 첫째 자리에서 반올림한 정수 반환
- max()메소드: 비교를 통해 큰 값 반환
- min() 메소드: 비교를 통해 작은 값 반환
- pow() 메소드: 제곱 연산
- sqrt() 메소드: 제곱근 값 
- sin() 메소드, cos() 메소드, tan() 메소드
---
- Wrapper 클래스
- 객체로 변환할 때 사용
- Boxing과 Unboxing(자동으로 처리)
- 오토박싱, 오토 언박싱
```java
Integer num = new Integer(17); // 박싱
int n = num.intValue();        // 언박싱
System.out.println(n);

Character ch = 'X'; //  오토박싱
char c = ch;     //오토언박싱
System.out.println(c);
```
---
- Enum 클래스(열거체)
- values() 메소드: 모든 배열 반환
- valuedOf() 메소드: 표시한 상수 반환
- original() 메소드: 정의된 순서 반환
```java
enum Rainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
    private final int value;
    Rainbow(int value) { this.value = value; }
    public int getValue() { return value; }
}
public class Enum04 {
    public static void main(String[] args) {
        System.out.println(Rainbow.YELLOW.ordinal());
    }
}
```
---
- Arrays 클래스
- binarySearch() 메소드: 이진검색 알고리즘으로 검색하고 해당 위치 반환
- copyOf() 메소드: 길이만큼을 새로운 배열로 복사해서 반환
```java
int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = Arrays.copyOf(arr1, 3);
for (int i = 0; i < arr2.length; i++) {
    System.out.print(arr2[i] + " ");
}

 int[] arr3 = Arrays.copyOf(arr1, 10);
for (int i = 0; i < arr3.length; i++) {
    System.out.print(arr3[i] + " ");
}
```
- copyOfRange() 메소드: 매개변수 세개 중, 두번째 매개변수는 복사할 인덱스이고 세번째 매개변수는 마지막으로 복사될 배열의 다음 인덱스
```java
int[] arr1 = {1, 2, 3, 4, 5};

int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
for (int i = 0; i < arr2.length; i++) {
    System.out.print(arr2[i] + " ");
}
```
- fill() 메소드: 특정 값으로 초기화
- sort() 메소드: 오름차순 정렬
---
- Calendar 클래스
- add() 메소드: 일정 시간만큼 더하고 빼기
- before() 와 after() 메소드: 인스턴스가 전달 객체보다 앞서는지 나중인지 판단
- get() 메소드: Calendar 필드에 저장된 값 반환
- roll() 메소드: Calendar 필드에서 일정 시간만큼 더하거나 빼기(add() 메소드와는 달리 Calendar 필드에는 영향 주지 않음)
- set() 메소드: Calendar 필드를 특정값으로 설정

