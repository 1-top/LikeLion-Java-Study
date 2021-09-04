package 시영;

abstract class Animal { abstract void cry(); }
class Cat extends Animal { void cry() { System.out.println("냐옹냐옹!"); } }
class Dog extends Animal { void cry() { System.out.println("멍멍!"); } }

public class Ex2_다형성_1추상클래스 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
