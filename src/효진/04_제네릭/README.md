## 제네릭
* 제네릭 : 데이터의 타입(data type)을 일반화한다(generalize)는 것
    - 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법
    - 데이터 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 것
    - 클래스 내부에서 데이터 타입을 지정하지 않고, 외부에서 사용자의 필요에 의해 지정할 수 있도록 하는 것
* 장점
    - 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있음
    - 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있음  
    - 코드의 재사용성이 높아짐


1. 제네릭 활용
    - 제네릭 클래스/인터페이스 선언
    ```java
    public class ClassName <T> { ... }
    public Interface InterfaceName <T> { ... }
    ```
    ```java
    public class ClassName <T, K> { ... }
    
    public class Main {
        public static void main(String[] args) {
            ClassName<String, Integer> a = new ClassName<String, Integer>();
        }
    }
    ```
    - 예제
    ```java
    //제네릭 클래스
    class ClassName <E> {
        private E element;
        void set(E element) {           // 제네릭 타입 변수
            this.element = element ;    // 제네릭 파라미터 메소드
        }

        
        E get() {       // 제네릭 타입 반환 메소드
            return element
        }
    }

    class Main {
        public static void main(String[] args) {
            ClassName<String> a = new ClassName<String>();
            ClassName<Integer> b = new ClassName<Integer>();

            a.set("10");
            b.set(10);

            System.out.println("a data : " + a.get());
            // 반환된 변수의 타입 출력
            System.out.println("a E Type : "+ a.get().getClass().getName());

            System.out.println();
            System.out.println("b data : " + b.get());
            // 반환된 변수의 타입 출력
            System.out.println("b E Type : "+ b.get().getClass().getName());
        }
    }
    ```
    <출력결과>
    ```
    a data : 10
    a E Type : java.lang.String

    b data : 10
    b E Type : java.lang.Integer
    ```
    - 제네릭 메소드
    ```java
    public <T> T genericMethod(T o) {
        ...
    }

    [접근제어자] <제네릭타입> [반환타입] [메소드명] ([제네릭타입] [파라미터]) {
        ...
    }
    ```
    - 클래스에서 지정한 제네릭 유형과 별도로 메소드에서 독립적으로 제네릭 유형을 선언할 수 있음(정적 메소드로 선언할 때 필요) : 제네릭이 사용되는 메소드를 정적 메소드로 두고 싶은 경우 제네릭 클래스와 별도로 독립적인 제네릭이 사용되어야 함
    ```java
    class ClassName <E> {
        /*
        클래스와 같은 E타입이더라도
        static 메소드는 객체가 생성되기 이전 시점에
        메모리에 먼저 올라가기 때문에
        E 유형을 클래스로부터 얻어올 방법이 없다.
        */
        static E genericMethod(E o) { // error
            return o
        }
    }

    class Main {
        public static void main(String[] args) {

            // ClassName 객체가 생성되기 전에 접근할 수 있으나 유형을 지정할 방법이 없어 에러 발생  
            ClassName.genericMethod(3);
        }
    }
    ```

2. 제한된 제네릭과 와일드 카드
    ```java
    <K extends T>   // T와 T의 자손 타입만 가능 (K는 들어오는 타입으로 지정됨)
    <K super T>     // T와 T의 부모(조상) 타입만 가능 (K는 들어오는 타입으로 지정됨)

    <? extends T>   // T와 T의 자손 타입만 가능
    <? super T>     // T와 T의 부모(조상) 타입만 가능
    <?>             // 모든 타입 가능(와일드카드)
    ```
    - extends T : 상한 경계
    - ? super T : 하한 경계
    - <?> : 와일드 카드. 타입이 지정되지 않음.
    ```java
    /*
    Number와 이를 상송하는 Integer, Short, Double, Long 등의
    타입이 지정될 수 있으며, 객체 혹은 메소드를 호출할 경우 K는
    지정된 타입으로 변환됨
    */
    <K extends Number>

    /*
    Number와 이를 상속하는 Integer, Short, Double, Long 등의
    타입이 지정될 수 있으며, 객체 혹은 메소드를 호출할 경우
    지정되는 타입이 없어 타입 참조를 할 수 없음
    */
    <? extends T> // T와 T의 자손 타입만 가능
    ```