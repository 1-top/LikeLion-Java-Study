package Second;
class Field {
    static int classVar = 10; // 클래스 변수 선언
    int instanceVar = 20;     // 인스턴스 변수 선언
}

public class Ex3_클래스멤버_1필드의구분 {

	public static void main(String[] args) {
		 int var = 30;                   // 지역 변수 선언
	     System.out.println(var + "\n"); 

	     Field myField1 = new Field();   // 인스턴스 생성
	     Field myField2 = new Field();   
	     
	     System.out.println(Field.classVar);
	     System.out.println(myField1.classVar);
	     System.out.println(myField2.classVar + "\n");

	     myField1.classVar = 100;            

	     System.out.println(Field.classVar);
	     System.out.println(myField1.classVar);
	     System.out.println(myField2.classVar + "\n");
	     
         System.out.println(myField1.instanceVar); 
	     System.out.println(myField2.instanceVar + "\n");

	     myField1.instanceVar = 200;              

	     System.out.println(myField1.instanceVar); 
	     System.out.println(myField2.instanceVar);
	}

}
