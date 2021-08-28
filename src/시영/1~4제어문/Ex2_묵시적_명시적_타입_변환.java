package First;

public class Ex2_묵시적_명시적_타입_변환 {

	public static void main(String[] args) {
		//묵시적 타입 변환
		double num1 = 10;// int형 데이터가 double 형으로 자동 타입 변환
		double num2 = 7.0f + 3.14;// float형 데이터가 double형으로 자동 타입 변환
		
		System.out.println(num1);
        System.out.println(num2);
        
        //명시적 타입 변환
        int number1 = 1, number2 = 4;
        
        double result1 = number1/number2;//정확한 결과 얻지 못함
        double result2 = (double)number1/ number2;//피연산자 중 하나의 타입을 double로 강제 타입 변환해야 함
        
        System.out.println(result1);
        System.out.println(result2);
	}

}
