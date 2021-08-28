package 시영;

public class Ex3_연산자 {

	public static void main(String[] args) {
		//산술 연산자
		int num1 = 8, num2 = 4;
		
		System.out.println("+연산자에 의한 결과: "+(num1 + num2));
		System.out.println("-연산자에 의한 결과: "+(num1 - num2));
		System.out.println("*연산자에 의한 결과: "+(num1 * num2));
		System.out.println("/연산자에 의한 결과: "+(num1 / num2));
		System.out.println("%연산자에 의한 결과: "+(num1 % num2));
		
		//대입 연산자
		int num3 = 7, num4 = 7, num5 = 7;
		num3 = num3 -3;
		num4 -= 3;
		num5 =- 3;
		
		System.out.println("- 연산자에 의한 결과: "+ num3);
		System.out.println("-= 연산자에 의한 결과: "+ num4);
		System.out.println("=- 연산자에 의한 결과: "+ num5);
		
		//증감 연산자
		int a =7, b = 7;
		int result1,result2;
		
		result1 = --a+4;
		result2 = b-- +4;
		
		System.out.println("전위 감소 연산자에 의한 결과: "+ result1 + ",변수의 값: "+ a);
		System.out.println("후위 감소 연산자에 의한 결과: "+ result2 + ",변수의 값: "+ b);
		
		// 비교 연산자
		char ch1 = 'a', ch2 = 'A';
		
		System.out.println("==연산자에 의한 결과:" + (ch1 == ch2));
		System.out.println(">연산자에 의한 결과: "+ (ch1>ch2));
		
		//논리 연산자
		char char1 ='b', char2='B';
		boolean res1,res2;
		
		res1 = (char1>'a')&&(char1<'z');
		res2 = (char2<'A')||(char2<'Z');
		
		System.out.println("&&연산자에 의한 결과: "+res1);
		System.out.println("||연산자에 의한 결과: "+ res2);
		System.out.println("!연산자에 의한 결과: "+!res2);
		
		//삼항 연산자
		int numb1 = 5, numb2 = 7;
		int result;
		
		result = (numb1-numb2 >0)? numb1:numb2;
		System.out.println("두 정수 중 더 큰 수는 "+result +"입니다.");
		
		
	}

}
