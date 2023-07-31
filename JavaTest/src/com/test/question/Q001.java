package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		 	요구사항] 태어난 년도를 입력받아 나이를 출력하시오
		 	조건] 우리나라 나이로 출력하시오.
		 	입력]	태어난 년도: 1998
		 	출력]	나이: 26세
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//1. 연도 입력
		System.out.print("태어난 년도: ");
		
		//2. 입력한 숫자를 year에 저장
		int year = scan.nextInt();
		
		//3. 우리나라 나이 = 현재 연도 - 태어난 연도 + 1
		int age = 2023 - year + 1;
		
		//4. 출력
		System.out.printf("나이: %d세\n", age);
		
	}
}

//수정햇움