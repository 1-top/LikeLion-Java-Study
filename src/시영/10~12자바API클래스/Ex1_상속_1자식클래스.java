package 시영;
class Parent {
    private int a = 10;
    public int b = 20;
}

class Child extends Parent {
    public int c = 30;
    void display() {
      System.out.println(b);
      System.out.println(c);
    }

}
public class Ex1_상속_1자식클래스 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
