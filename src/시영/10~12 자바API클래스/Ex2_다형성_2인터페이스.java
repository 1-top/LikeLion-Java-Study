package 시영;
interface Animal1 { public abstract void cry(); }

class Cat1 implements Animal1 {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}
class Dog1 implements Animal1 {
    public void cry() {
        System.out.println("멍멍!");
    }
}

public class Ex2_다형성_2인터페이스 {
    public static void main(String[] args) {

        Cat1 c = new Cat1();
        Dog1 d = new Dog1();
        c.cry();
        d.cry();

    }
}
