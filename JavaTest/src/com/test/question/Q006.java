package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		/*
			요구사항]	사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
			조건]	세금: 수입의 3.3%
			입력]	한달 수입 금액(원): 1000000
			출력]	세후 금액(원): 967,000원
				세금(원) : 33,000원
		 */
		
		double taxRate = 0.033;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한달 수입 금액(원): ");
		long income = scan.nextLong();
		
		
		double afterTax = income * (1 - taxRate);
		
		
		double tax = income * taxRate;
		
		
		System.out.printf("세후 금액(원): %,.0f원\n", afterTax);
		System.out.printf("세금(원) : %,.0f원\n", tax);
		
		//코드리뷰
		//변수를 만들지 않고 결과에 바로 계산
		//변수가 많아지면 변수명 정하는데에 어려움 있음
		

	}
}
