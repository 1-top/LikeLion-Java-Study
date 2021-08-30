package Second;

import java.util.Arrays;

public class Ex1_배열 {

	public static void main(String[] args) {
		//1차원 배열
		int[] grade1 = new int[3];
		int[] grade2 = new int[3]; 

		grade1[0] = 85;
		grade1[1] = 65;
		grade1[2] = 90;

		grade2[0] = 85;

		for (int i = 0; i < grade1.length; i++) {
		    System.out.print(grade1[i] + " "); 
		}
		
		System.out.println();

		for (int i = 0; i < grade2.length; i++) {
		    System.out.print(grade2[i] + " "); 
		}
		
		//1차원 배열의 초기화
		
		int[] grade = new int[]{85, 65, 90}; 
		
		System.out.println();
		
		for (int i = 0; i < grade.length; i++) {
		    System.out.print(grade[i] + " "); 
		}
		
		//다차원 배열
		int[][] arr = new int[2][3];

		int k = 10;
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = k; 
		        k += 10;
		    }
		}

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
		
		//2차원 배열 선언과 동시에 초기화
		int[][] arr1 = {
			    {10, 20, 30},
			    {40, 50, 60}
			};
		for (int i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr1[i].length; j++) {
		        System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}

		for (int i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr1[i].length; j++) {
		        System.out.print(arr1[i][j] + " ");
		    }
		    System.out.println();
		}
		
		//가변 배열
		int[][] arr2 = {
				{10, 20},
				{10, 20, 30, 40},
				{10}
		};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		//배열의 복사
		int[] arra = new int[]{1, 2, 3, 4, 5};
		int newLen = 10;
		
		// 1. System 클래스의 arraycopy() 메소드
		int[] arrb = new int[newLen];
		System.arraycopy(arra, 0, arrb, 0, arra.length);
		
		for (int i = 0; i < arrb.length; i++) {
			System.out.print(arrb[i] + " ");
		}
		System.out.println();
		
		// 2. Arrays 클래스의 copyOf() 메소드
		int[] arrc = Arrays.copyOf(arra, 10);
		
		for (int i = 0; i < arrc.length; i++) {
			System.out.print(arrc[i] + " ");
		}
		System.out.println();
		
		// 3. Object 클래스의 clone() 메소드
		int[] arrd = (int[])arra.clone();
		
		for (int i = 0; i < arrd.length; i++) {
			System.out.print(arrd[i] + " ");
		}
		System.out.println();
		
		// 4. for 문과 인덱스를 이용한 복사
		int[] arrf = new int[newLen];
		
		for (int i = 0; i < arra.length; i++) {
			arrf[i] = arra[i];
		}
		
		for (int i = 0; i < arrf.length; i++) {
			System.out.print(arrf[i] + " ");
		}
		
		//Enhanced for문
		int[] array = new int[]{1, 2, 3, 4, 5};

		System.out.println();
		for (int e : array) {
		    System.out.print(e + " ");
		}
	}
}
