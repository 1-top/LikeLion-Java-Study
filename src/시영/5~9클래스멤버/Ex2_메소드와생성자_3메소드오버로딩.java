package Second;
class Test {

    static void display(int num1) {
    	System.out.println(num1); 
    	}
    static void display(int num1, int num2) {
    	System.out.println(num1 * num2); 
    	}
    static void display(int num1, double num2) {
    	System.out.println(num1 + num2); 
    	}

}

public class Ex2_메소드와생성자_3메소드오버로딩 {
	public static void main(String[] args) {
		Test myfunc = new Test();

        myfunc.display(10);
        myfunc.display(10, 20);
        myfunc.display(10, 3.14);
        myfunc.display(10, 'a');
	}

}
