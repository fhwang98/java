package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		/*
			요구사항] 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
			조건] 출력 숫자에 천단위 표기 하시오.
				 결과값은 소수 이하 1자리까지 표기 하시오.	
			입력]	첫번쨰 숫자: 5
				두번째 숫자: 3
			출력]	5 + 3 = 8
				5 - 3 = 2
				5 * 3 = 15
				5 / 3 = 1.7
				5 % 3 = 2
		 */
		
		Scanner scan = new Scanner(System.in);

		//1. 첫번째 숫자 입력 후 저장
		System.out.print("첫번째 숫자: ");
		int n1 = scan.nextInt();
		
		//2. 두번째 숫자 입력 후 저장
		System.out.print("두번째 숫자: ");
		int n2 = scan.nextInt();
		
		//3. 연산 결과 출력 연산
		System.out.printf("%,d + %,d = %,d\n", n1, n2, (long)n1 + n2);
		System.out.printf("%,d - %,d = %,d\n", n1, n2, (long)n1 - n2);
		System.out.printf("%,d * %,d = %,d\n", n1, n2, (long)n1 * n2);
		System.out.printf("%,d / %,d = %,.1f\n", n1, n2, (double)n1 / n2);
		System.out.printf("%,d %% %,d = %,d\n", n1, n2, n1 % n2);
		
	}
}
