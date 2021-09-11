<h2>13.제네릭</h2>
<h3>- 제네릭이란?</h3>
- 클래스 내부에서 사용할 테이터 타입을 외부에서 지정하는 기법
```java
package org.opentutorials.javatutorials.generic;
 
class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
 
}
```
- p1에서의 person은 String, p2에서의 person은 StringBuilder

---
<h3>- 제네릭 사용 이유?</h3>
```java
package org.opentutorials.javatutorials.generic;
class StudentInfo{
  public int grade;
  StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
  public int rank;
  EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
  public Object info;
  Person(Object info){ this.info = info; }
}
public class GenericDemo {
  public static void main(String[] args) {
    Person p1 = new Person("부장");
    EmployeeInfo ei = (EmployeeInfo)p1.info;
    System.out.println(ei.rank);
  }
}
```
- 위의 코드는 다음과 같은 문제 발생
```java
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to org.opentutorials.javatutorials.generic.EmployeeInfo
    at org.opentutorials.javatutorials.generic.GenericDemo.main(GenericDemo.java:17)
```
- 이유는 다음과 같음
- class Person의 매개변수 info의 데이터 타입이 Object이다. 모든 객체가 될 수 있는데
EmployeeInfo가 아니라 String인 "부장"이 와도 괜찮음(코드 상 에러 없음)
- 그러나 런타입 에러가 발생
- 타입이 안전하지 않음. 이를 제네릭화 해서 안전하도록 수정
```java
package org.opentutorials.javatutorials.generic;
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // 성공
         
        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        System.out.println(ei2.rank); // 컴파일 실패
    }
}
```
- 제너릭화한 후 p1은 성공이지만 p2의 경우 실패. 이유는 p2의 경우 p2.info는 
String인데 rank는 필드가 없는데도 호출하고 있기 때문이다.
---
<h3>- 제네릭의 특징-1</h3>
- 복수의 제네릭
```java
package org.opentutorials.javatutorials.generic;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1);
    }
}
```
- 두개의 제네릭(T,S)가 사용된 경우(복수의 제네릭)
- T값은 EmployeeInfo가 되고, S값은 int가 됨
- T에 올 수 있는 데이터 타입은 참조형만 올 수 있음(아래는 수정한 코드)
```java
package org.opentutorials.javatutorials.generic;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        System.out.println(p1.id.intValue());//wrapper클래스가 담고 있는 데이터 숫자, int 타입의 1을 돌려줌
    }
}
```
- 기본 데이터 타입을 사용하는 방법이 있는데, 'wrapper 클래스'를 사용하면 됨
- int 대신 integer로 변경
- 또 뒤의 1 대신 i로 변경한 후 integer 형식으로 변경
---
<h3>- 제네릭의 특징-2</h3>
- 제너릭의 생략
```java
EmployeeInfo e = new EmployeeInfo(1);
Integer i = new Integer(10);
Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
Person p2 = new Person(e, i);
```
- 위의 코드 중 일부인데, 제네릭인 <EmployeeInfo, Integer>을 생략해도 문제되지 않음


- 한편, 제네릭을 클래스에서만이 아니라, 메소드에도 적용할 수 있다.
```java
package org.opentutorials.javatutorials.generic;
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
    }
}
```
- printInfo의 메소드의 매개변수에 제너릭 사용
- p1.<EmployeeInfo>printInfo(e); -> 이 코드를 보면 메소드의 제네릭인 U가 EmployeeInfo가 되기 때문에
info 매개변수의 U는 EmployeeInfo가 됨
- 그러나 U의 데이터 타입을 수정할 수 있기 때문에 -> p1.printInfo(e); 이렇게 작성해도 괜찮음
---
<h3>- 제네릭의 제한</h3>
```java
package org.opentutorials.javatutorials.generic;
abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        Person<String> p2 = new Person<String>("부장");
    }
}
```
- extends를 사용
- 만일 T의 타입이 Info나 Info의 자식 클래스만 올 수 있도록 하고 싶은 경우, extends Info라고 작성
- 그러나 Person<String> p2 = new Person<String>("부장");-> 이 코드의 경우 String은 Info의 자식이 
아니기 때문에 컴파일 에러 발생(런타임에 발생할 에러를 미연에 방지)
- extends 다음에 꼭 클래스가 올 필요 없고 implements 인터페이스도 가능