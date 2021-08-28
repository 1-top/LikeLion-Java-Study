package 시영;

public class Ex5_반복문 {

	public static void main(String[] args) {
		//while문
		int i = 0;
		int i1 = 1, j = 1;
		int i2;

		while (i < 5) {
		    System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
		    i++; 
		}
		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
		//do/while 문
		while (i1 < 1) {
		    System.out.println("while 문이 " + i1 + "번째 반복 실행중입니다.");
		    i1++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		}
		System.out.println("while 문이 종료된 후 변수 i1의 값은 " + i1 + "입니다.");

		do {
		    System.out.println("do / while 문이 " + i1 + "번째 반복 실행중입니다.");
		    j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
		} while (j < 1);
		System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
		
		//for문
		for (i2 = 0; i2 < 5; i2++) {
		    System.out.println("for 문이 " + (i2 + 1) + "번째 반복 실행중입니다.");
		}
		System.out.println("for 문이 종료된 후 변수 i2의 값은 " + i2 + "입니다.");
	}
}
