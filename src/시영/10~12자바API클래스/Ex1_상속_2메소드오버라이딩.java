package 시영;
class Parent1 {
    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }
}

class Child1 extends Parent1 {
    // 오버라이딩된 display() 메소드
    void display() {
        System.out.println("자식 클래스의 display() 메소드입니다.");
    }
    void display(String str) {
        System.out.println(str);
    } // 오버로딩된 display() 메소드
}

public class Ex1_상속_2메소드오버라이딩 {
    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.display();
        ch.display("오버로딩된 display() 메소드입니다.");
    }
}
