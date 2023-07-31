package com.test.question;

import java.util.Scanner;

public class Q003 {
	
	public static void main(String[] args) {
		/*
			요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
			조건]	사각형 넓이 = 너비 * 높이
				사각형 둘레 = 너비*2 + 높이*2
			입력]	너비(cm): 20
				높이(cm): 10
			출력]	사각형의 넓이는 200㎠입니다.
			 	사각형의 둘레는 60cm입니다.
			 	
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//1. 너비와 높이 입력
		System.out.print("너비(cm): ");
		int width = scan.nextInt();
		
		System.out.print("높이(cm): ");
		int length = scan.nextInt();
		
		//2. 넓이공식, 둘레 공식
		long squareArea = (long)width * length;
		long squarePerimeter = (long)width * 2 + length * 2;
		
		//3. 출력
		System.out.printf("사각형의 넓이는 %d㎠입니다.\n", squareArea);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n", squarePerimeter);
		
	}

}
