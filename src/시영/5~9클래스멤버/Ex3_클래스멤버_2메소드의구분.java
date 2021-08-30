package Second;
class Method {

    int a = 10, b = 20;                            // 인스턴스 변수
    int add() {                                    // 인스턴스 메소드
    	return a + b; 
    }                    
    static int add(int x, int y) {                 // 클래스 메소드
    	return x + y; 
    } 

}

public class Ex3_클래스멤버_2메소드의구분 {
	public static void main(String[] args) {
		System.out.println(Method.add(20, 30)); // 클래스 메소드의 호출
		
        Method myMethod = new Method();         // 인스턴스 생성
        System.out.println(myMethod.add());     // 인스턴스 메소드의 호출
	}

}
