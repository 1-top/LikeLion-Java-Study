package Second;
class Car {
	private int currentSpeed;
	private int accelerationTime;
		
	public void accelerate(int speed, int second) {
		System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
	}
}

public class Ex2_메소드와생성자_1메소드개념 {
    //메소드의 개념
	public static void main(String[] args) {
		Car myCar = new Car();		
		myCar.accelerate(60, 3);
	}

}
