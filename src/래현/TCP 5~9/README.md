# 7. 메소드와 생성자

## 30) 생성자

- 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 기능
- 객체를 초기화하는 방법이 여러 개 존재할 경우에는 하나의 클래스가 여러 개의 생성자를 가질 수 있음. 즉, 생성자도 메서드 중 하나이므로 메서드 오버로딩이 가능하다~
- 자바에서는 `new` 키워드를 사용하여 객체를 생성할 때 자동으로 생성자가 호출됨.

### 디폴트 생성자(기본 생성자)

- 생성자가 없는 클래스는 클래스 파일을 컴파일 할 때 자바 컴파일러에서 자동으로 생성자를 만들어줌.

```java
public class Person{
	String name;
	float height;

	public Person(){
	}

}
```

- 주의할 점은, 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 자동으로 추가되지 않음. 따라서 오류를 회피하려면 이런 경우 매개변수가 있는 생성자로 호출하거나 디폴트 생성자를 직접 구현해주어야 함.

---

## 31) this와 this()

- this는 생성된 인스턴스 스스로를 가리키는 예약어.

```java
class Car {

    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {

        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;

    }

    ...

}
```

## this() 메서드

### 생성자에서 다른 생성자를 호출하는 this

```java
class Car {

    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
		}

    Car() {
        this("소나타", 2012, "검정색", 160); // 다른 생성자를 호출함.
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }

}

 

public class Method05 {
    public static void main(String[] args) {
        Car tcpCar = new Car(); 
				System.out.println(tcpCar.getModel());
    }
}
```

- this() 메서드는 생성자 내부에서만 사용가능. 같은 클래스의 다른 생성자를 호출할 때 사용.
- this() 메서드에 인수를 전달하면, 생성자 중 메서드 시그니처가 일치하는 다른 생성자를 찾아 호출.
- this로 다른 생성자를 호출할 떄는 this를 사용하여 생성자를 호출하는 코드 이전에 다른 코드를 넣을 수 없음을 주의해야 함. 생성자는 클래스가 생성될 때 호출되므로 클래스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있음. 즉, 디폴트 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하므로, 이때는 this를 활용한 문장이 가장 먼저 와야 함.

### 자신의 주소를 반환하는 this

- this를 사용하여 생성된 클래 자신의 주소 값을 반환할 수 있음. 인스턴스 주소 값을 반환할 때는 this를 사용하고 반환형은 클래스 자료형을 사용.

```java
Person returnItSelf(){
		return this;  // this 반환
}
```

- 클래스 자료형과 상관없이 클래스 내에서 this를 사용하면 자신의 주소 값을 반환할 수 있다.

---

## 32) 오버로딩

## 오버로딩

: 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것

: 오버로딩의 사전적 의미는 과적. 하나의 메소드 이름으로 여러 기능을 담는다 하여 붙여진 이름이라 생각하면 됨.

## 오버로딩의 조건

: 메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다. 주의할 점은 '리턴 값만' 다른 것은 오버로딩을 할 수 없다는 것이다.

: 접근 제어자도 자유롭게 지정해 줄 수 있다. 각 메소드의 접근 제어자를 public, default, protected, private으로 다르게 지정해줘도 상관없다는 것이다. 접근 제어자만 다르게한다고 오버로딩이 가능하지 않다는 것도 알아두자.

→ 결국 오버로딩은 매개변수의 차이로만 구현할 수 있다. 매개변수가 다르다면 리턴 값은 다르게 지정할 수 있다.

## 오버로딩을 사용하는 이유

1. 같은 기능을 하는 메소드를 하나의 이름으로 사용할 수 있다.
2. 메소드의 이름을 절약할 수 있다.

예시코드

```java
class OverloadingTest {

	public static void main(String[] args) {
		OverloadingMethods om = new OverloadingMethods();
		om.print();
		System.out.println(om.print(3));
		om.print("Hello!");
		System.out.println(om.print(4, 5));
	}
}

class OverloadingMethods {
	public void print() {
		System.out.println("오버로딩1");
	}

	String print(Integer a) {
		System.out.println("오버로딩2");
		return a.toString();
	}

	void print(String a) {
		System.out.println("오버로딩3");
		System.out.println(a);
	}

	String print(Integer a, Integer b) {
		System.out.println("오버로딩4");
		return a.toString() + b.toString();
	}

}

/////////////////////////////////////////////////////////
// 결과
오버로딩1
오버로딩2
3
오버로딩3
Hello!
오버로딩4
45
```

- (+ TCPSCHOOL)

### 메소드 오버로딩(method overloading)

메소드 오버로딩(overloading)이란 같은 이름의 메소드를 중복하여 정의하는 것을 의미합니다.

자바에서는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없습니다.

하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있습니다.

즉, 메소드 오버로딩은 서로 다른 시그니처를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있습니다.

이러한 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 있습니다.

또한, 메소드를 호출할 때 전달해야 할 매개변수의 타입이나 개수에 대해 크게 신경을 쓰지 않고 호출할 수 있게 됩니다.

메소드 오버로딩은 객체 지향 프로그래밍의 특징 중 하나인 다형성(polymorphism)을 구현하는 방법 중 하나입니다.

---

## 33) 재귀 호출

- 메서드 내부에서 해당 메서드가 또 다시 호출되는 것
- 자기 자신을 계속 호출 == 무한 루프...  /  따라서 재귀 호출 중단 명령이 반드시 필요

재귀 호출이 아닌 예시

```java
int sum(int n) {
    int result = 0;

    for (int i = 1; i <= n; i++) {
        result += i;
    }

    return result;
}
```

재귀 호출의 예시

```java
int recursiveSum(int n) {
    if (n == 1) {                 // n이 1이면, 그냥 1을 반환함.
        return 1;
    }

    return n + recursiveSum(n-1); // n이 1이 아니면, 
																	// n을 1부터 (n-1)까지의 합과 더한 값을 반환함.
}
```

위의 예제에서 if 문이 존재하지 않으면, 이 프로그램은 실행 직후 스택 오버플로우(stack overflow)에 의해 종료될 것입니다.

따라서 if 문처럼 재귀 호출을 중단하기 위한 조건문을 반드시 포함해야 합니다.

---

## 35) 접근 제어자

자바에서는 다음과 같은 네 가지의 접근 제어자를 제공합니다.

1. private

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28d8e7e7-396e-4cfa-9096-d4fb2f09dd94/Untitled.png)

2. public

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4ed5c9e1-3075-45ed-a986-927bf90a84ed/Untitled.png)

3. default

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f8102c00-4b20-477e-8468-a931a2aafba7/Untitled.png)

4. protected

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/635873ac-9d7a-466e-b67a-087de8c0c1ba/Untitled.png)

클래스의 protected 멤버에 접근할 수 있는 영역은 다음과 같습니다.

1. 이 멤버를 선언한 클래스의 멤버

2. 이 멤버를 선언한 클래스가 속한 패키지의 멤버

3. 이 멤버를 선언한 클래스를 상속받은 자식 클래스(child class)의 멤버

---

## 36) 기타 제어자

- static 제어자

static 제어자를 가지는 멤버는 다음과 같은 특징을 가지게 됩니다.

1. 프로그램 시작시 최초에 단 한 번만 생성되고 초기화됩니다.

2. 인스턴스를 생성하지 않고도 바로 사용할 수 있게 됩니다.

3. 해당 클래스의 모든 인스턴스가 공유합니다.

- 자바에서는 제어자의 특성상 몇몇 제어자는 함께 사용할 수 없습니다.

1. 클래스에 final과 abstract는 함께 사용할 수 없습니다.

: final 제어자를 가지는 클래스는 다른 클래스가 상속받을 수 없게 되며, abstract 제어자를 가지는 클래스는 다른 클래스가 상속해서 오버라이딩해야만 사용할 수 있으므로, 이 두 제어자는 클래스에 함께 사용할 수 없습니다.

2. 메소드에 static과 abstract는 함께 사용할 수 없습니다.

: abstract 제어자를 가지는 메소드는 선언부만 있고 구현부가 없는 메소드인데, static 제어자를 가지는 메소드는 인스턴스를 생성하지 않고도 바로 사용할 수 있어야 하므로, 이 두 제어자는 메소드에 함께 사용할 수 없습니다.

3. 메소드에 private과 abstract는 함께 사용할 수 없습니다.

: abstract 제어자를 가지는 메소드는 다른 클래스가 상속하여 오버라이딩해야만 사용할 수 있는데, private 제어자를 가지는 메소드는 자식 클래스에서 접근할 수 없게 되므로, 이 두 제어자는 메소드에 함께 사용할 수 없습니다.

4. 메소드에 private과 final은 함께 사용할 필요가 없습니다.

: 메소드에 사용된 final 제어자와 private 제어자는 모두 해당 메소드가 오버라이딩을 통한 재정의를 할 수 없다는 의미를 가지므로, 둘 중에 하나만 사용해도 의미가 충분히 전달될 수 있습니다.