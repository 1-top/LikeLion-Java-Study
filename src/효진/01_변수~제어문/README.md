## 타입
### 1. 변수
1. 기본형 변수 :  실제 연산에 사용되는 변수
- 정수형 : byte, short, int, long
    * 정수형 데이터의 타입을 결정할 때에는 반드시 자신이 사용하고자 하는 데이터의 최대 크기를 고려
    * 해당 타입이 표현할 수 있는 범위를 벗어난 데이터를 저장하면, 오버플로우(overflow)가 발생
- 실수형 : float, double
- 문자형 : char
- 논리형 : boolean


2. 참조형(reference type) 변수 : 8개의 기본형 변수를 사용하여 사용자가 직접 만들어 사용하는 변수


3. 변수의 선언
- 변수의 선언만 하는 방법
    * 문법 : `타입 변수이름;`

    ```java
    int num;                 // 변수의 선언
    System.out.println(num); // 오류 발생
    num = 20;                // 변수의 초기화
    System.out.println(num); // 20
    ```
- 변수의 선언과 동시에 초기화하는 방법
    * 문법  
      (1) `타입 변수이름[, 변수이름];`  
      (2) `타입 변수이름 = 초깃값[, 변수이름 = 초깃값]`

    ```java
    int num1, num2;                  // 같은 타입의 변수를 동시에 선언함.
    double num3 = 3.14;              // 선언과 동시에 초기화함.
    double num4 = 1.23, num5 = 4.56; // 같은 타입의 변수를 동시에 선언하면서 초기화함.
    ```

    * 이미 선언된 변수는 여러 변수를 동시에 초기화할 수 없음

    ```java
    double num1, num2;        // 같은 타입의 변수를 동시에 선언함.
    num1 = 1.23, num2 = 4.56; // 이미 선언된 여러 변수를 동시에 초기화할 수는 없음.
    ```

### 2. 상수
1. 개념 : 상수(constant)란 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미  
   (하지만 상수가 변수와 다른 점은 프로그램이 실행되는 동안 메모리에 저장된 데이터를 변경할 수 없다는 점)
    * 상수는 선언과 동시에 반드시 초기화

2. 리터럴 : 그 자체로 값을 의미하는 것
    * 리터럴 타입 접미사(literal type suffix) : 리터럴 뒤에 추가되어 해당 리터럴의 타입을 명시해주는 접미사


### 3. 타입변환
1. 묵시적 타입 변환(자동 타입 변환, implicit conversion)
    * 대입 연산이나 산술 연산에서 컴파일러가 자동으로 수행해주는 타입 변환

    ```java
    ① double num1 = 10;
    ② // int num2 = 3.14;
    ③ double num3 = 7.0f + 3.14;
    
    System.out.println(num1);
    System.out.println(num3);
    ```
   ① double형 변수에 int형 데이터를 대입  
   ② int형 변수가 표현할 수 있는 범위보다 더 큰 double형 데이터를 대입하므로, 데이터의 손실이 발생 (오류발생)  
   ③ float형 데이터와 double형 데이터의 산술 연산
    * 자바의 타입변환 방향  
      : byte형 → short형/char형 → int형 → long형 → float형 → double형


2. 명시적 타입 변환(강제 타입 변환, explicit conversion)
    * 사용자가 타입 캐스트 연산자(())를 사용하여 강제적으로 수행하는 타입 변환
    * 문법 : `(변환할타입) 변환할데이터`

    ```java
    int num1 = 1, num2 = 4;
    
    ① double result1 = num1 / num2;
    ② double result2 = (double) num1 / num2;
    
    System.out.println(result1);
    System.out.println(result2);
    ```

## 연산자
1. 산술 연산자(arithmetic operator) : 사칙연산을 다루는 연산자
    * 두 개의 피연산자를 가지는 이항 연산자
    * 피연산자들의 결합 방향은 왼쪽에서 오른쪽


2. 대입 연산자(assignment operator) : 변수에 값을 대입할 때 사용하는 이항 연산자
    * 피연산자들의 결합 방향은 오른쪽에서 왼쪽
    * 대입 연산자와 다른 연산자를 결합하여 만든 다양한 복합 대입 연산자를 제공


3. 증감 연산자(increment and decrement operators) :  피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 연산자
    * 피연산자가 단 하나뿐인 단항 연산자
    * 연산자가 피연산자의 어느 쪽에 위치하는가에 따라 연산의 순서 및 결과가 달라짐
    ```java
    int num1 = 7, num2 = 7;
    int result1, result2;
    
    result1 = --num1 + 4;
    result2 = num2-- + 4;
    
    System.out.println("전위 감소 연산자에 의한 결과 : "+ result1 + ", 변수의 값 : " + num1);
    System.out.println("후위 감소 연산자에 의한 결과 : "+ result2 + ", 변수의 값 : " + num2);
    ```
   실행결과
    * 전위 감소 연산자에 의한 결과 : 10, 변수의 값 : 6
    * 후위 감소 연산자에 의한 결과 : 11, 변수의 값 : 6


4. 비교 연산자(comparison operator) : 피연산자 사이의 상대적인 크기를 판단하는 연산자


5. 논리 연산자(logical operator) : 주어진 논리식을 판단하여, 참(true)과 거짓(false)을 결정하는 연산자
    * AND 연산과 OR 연산은 두 개의 피연산자를 가지는 이항 연산자,  피연산자들의 결합 방향은 왼쪽에서 오른쪽
    * NOT 연산자는 피연산자가 단 하나뿐인 단항 연산자, 피연산자의 결합 방향은 오른쪽에서 왼쪽
    * AND(`&&`), OR(`||`), NOT(`!`)


6. 비트 연산자(bitwise operator) : 비트(bit) 단위로 논리 연산을 할 때 사용하는 연산자 (2진수 연산자)


7. 삼항 연산자(ternary operator) : 피연산자가 세 개인 연산자
    * 문법 : `조건식 ? 반환값1 : 반환값2`

    ```java
    int num1 = 5, num2 = 7;
    int result;
    
    result = (num1 - num2 > 0) ? num1 : num2;
    System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");
    ```

   실행결과 : 두 정수 중 더 큰 수는 7입니다.


8. instanceof 연산자 : 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환
    * 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해 주는 역할
    * 문법 : `인스턴스이름 instanceof 클래스/인터페이스이름

## 제어문
### 1. 조건문
1. if 문
    * 문법 :

    ```java
    if (조건식) {
        조건식의 결과가 참일 때 실행하고자 하는 명령문;
    }
    ```


2. if / else 문
    * 문법 :

    ```java
    if (조건식) {
        조건식의 결과가 참일 때 실행하고자 하는 명령문;
    } else {
        조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
    }
    ```


3. if / else if / else 문
    * 문법 :

    ```java
    if (조건식1) {
        조건식1의 결과가 참일 때 실행하고자 하는 명령문;
    } else if (조건식2) {
        조건식2의 결과가 참일 때 실행하고자 하는 명령문;
    } else {
        조건식1의 결과도 거짓이고, 조건식2의 결과도 거짓일 때 실행하고자 하는 명령문;
    }
    ```


4. switch 문
    * switch 문은 if / else 문보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편
    * int형으로 승격할 수 있는(integer promotion) 값만이 사용될 수 있음.  
      (조건값으로  byte형, short형, char형, int형의 변수나 리터럴을 사용할 수 있으며,  
      기본 타입에 해당하는 데이터를 객체로 포장해 주는 래퍼 클래스(Wrapper class) 중에서 위에 해당하는 Byte, Short, Character, Integer 클래스의 객체도 사용할 수 있음)

    * 문법 :

    ```java
    switch (조건 값) {
        case 값1:
            조건 값이 값1일 때 실행하고자 하는 명령문;
            break;
        case 값2:
            조건 값이 값2일 때 실행하고자 하는 명령문;
            break;
        ...
        default:
            조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
            break;
    }
    ```

### 2. 반복문
1. while 문
    * 문법 :

    ```java
    while (조건식) {
        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
    }
    ```


2. do / while 문
    * 문법:

    ```java
    do {
        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
    } while (조건식);
    ```


3. for 문
    * 문법 :

    ```java
    for (초기식; 조건식; 증감식) {
        조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
    }
    ```

4. Enhanced for 문

### 3. 기타제어문
1. 루프의 제어 : continue 문과 break 문은 루프의 흐름을 사용자가 직접 제어할 수 있도록 함
2. continue 문
    * 루프 내에서 사용하여 해당 루프의 나머지 부분을 건너뛰고, 바로 다음 조건식의 판단으로 넘어가게 해줌
    * 반복문 내에서 특정 조건에 대한 예외 처리를 하고자 할 때 사용

    ```java
    // 1부터 100까지의 정수 중에서 5의 배수와 7의 배수를 모두 출력
    for (int i = 1; i <= 100; i++) {
        if (i % 5 == 0 || i % 7 == 0) {
            System.out.println(i);
        } else {
            continue;
        }
    }
    ```

3. break 문
    * 루프 내에서 사용하여 해당 반복문을 완전히 종료시킨 뒤, 반복문 바로 다음에 위치한 명령문을 실행
    * 조건식의 판단 결과와 상관없이 반복문을 완전히 빠져나가고 싶을 때 사용

    ```java
    //1부터 100까지의 합을 무한 루프를 통해 구하는 예제
    int num = 1, sum = 0;
    
    while (true) { // 무한 루프
        sum += num;
        if (num == 100) {
            break;
        }
        num++;
    }
    System.out.println(sum);
    ```

4. 이름을 가지는 반복문(break with label)
    * 여러 반복문이 중첩된 상황에서 한 번에 모든 반복문을 빠져나가거나, 특정 반복문까지만 빠져나가고 싶을 때 반복문의 이름을 설정
    * 가장 바깥쪽 반복문이나 빠져나가고 싶은 특정 반복문에 이름을 설정한 후, break 키워드 다음에 해당 이름을 명시

    ```java
    //2단부터 4단까지 출력
    allLoop :
    for (int i = 2; i < 10; i++) {
        for (int j = 2; j < 10; j++) {
            if (i == 5) {
                break allLoop;
            }
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
    ```