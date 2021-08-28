package 시영;

public class Ex4_조건문 {

	public static void main(String[] args) {
		char ch = 'j';
		char ch1 = 'J';
		char ch2 = 'J';
		char ch3 = 'i';
		
		//if문
		if(ch>='a' && ch<='z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		}
		
		//if/else문
		if(ch1>='a' && ch1<='z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		}
		else {
			System.out.println("해당 문자는 영문 소문자가 아닙니다.");
		}
		
		//if/else if/else문
		if (ch2 >= 'a' && ch2 <= 'z') {
			System.out.println("해당 문자는 영문 소문자입니다.");
		} else if (ch2 >= 'A' && ch2 <= 'Z') {
			System.out.println("해당 문자는 영문 대문자입니다.");
		} else {
			System.out.println("해당 문자는 영문자가 아닙니다.");
		}
		
		//switch문
		switch (ch3) {

	    case 'a':

	        System.out.println("해당 문자는 'A'입니다.");

	        break;

	    case 'e':

	        System.out.println("해당 문자는 'E'입니다.");

	        break;

	    case 'i':

	        System.out.println("해당 문자는 'I'입니다.");

	        break;

	    case 'o':

	        System.out.println("해당 문자는 'O'입니다.");

	        break;

	    case 'u':

	        System.out.println("해당 문자는 'U'입니다.");

	        break;

	    default:

	        System.out.println("해당 문자는 모음이 아닙니다.");

	        break;

	}
	}

}
