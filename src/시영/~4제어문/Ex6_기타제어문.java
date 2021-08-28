package 시영;

public class Ex6_기타제어문 {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		
		//continue 문
		for (int i = 1; i <= 100; i++) {
		    if (i % 5 == 0 || i % 7 == 0) {
		        System.out.println(i);
		    } else {
		        continue;
		    }
		}
		
		//break 문
		while (true) {
		    sum += num;
		    if (num == 100) {
		        break;
		    }
		    num++;
		}
		System.out.println(sum);
		
		//이름을 가지는 반복문
		allLoop :
			for (int i = 2; i < 10; i++) {
			    for (int j = 2; j < 10; j++) {
			        if (i == 5) {
			            break allLoop;
			        }
			        System.out.println(i + " * " + j + " = " + (i * j));
			    }
			}
	}
}
