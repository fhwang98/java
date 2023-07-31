package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {
		/*
			요구사항
			근무 년수를 입력받아 아래와 같이 출력하시오.
			
			조건..
			1 ~ 4년차: 초급 개발자
			5 ~ 9년차: 중급 개발자
			10년차 이상: 고급 개발자
			유효성 검사를 하시오.(1 미만 입력 예외 처리)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("근무 년수: ");
		int input = scan.nextInt();
		
		if (input >= 10) {
/*
 * 11년차 고급 개발자입니다.
당신은 2년전까지 중급 개발자였습니다.
 */
			System.out.printf("%d년차 고급 개발자입니다.\n", input);
			System.out.printf("당신은 %d년전까지 중급 개발자였습니다.\n", input - 9);
		} else if (input >= 5) {
			/*
			 * 5년차 중급 개발자입니다.
당신은 1년전까지 초급 개발자였습니다.
앞으로 5년 더 근무를 하면 고급 개발자가 됩니다.
			 */
			System.out.printf("%d년차 중급 개발자입니다.\n", input);
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n", input - 4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10 - input);
		} else if (input > 0) {
			/*
			 * 2년차 초급 개발자입니다.
앞으로 3년 더 근무를 하면 중급 개발자가 됩니다. 
			 */
			System.out.printf("%d년차 초급 개발자입니다.\n", input);
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5 - input);
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}	
	}
}

//코드리뷰

// 근속연수의 유효성을 먼저 체크
// if(year >= 1){}
// else {}
// 유효성 체크하는 if절로 조건들을 감싸주었음

// printf 를 한줄로 출력
