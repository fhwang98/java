package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		/*
			요구사항]	영문 소글자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
			조건]	대문자와 소문자의 문자 코드값의 관계
			입력]	문자 입력: a
			출력] 소문자 'a'의 대문자는 'A'입니다.
			
			소문자 이외의 문자가 들어왔을 ,, ?
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 입력: ");
		
		String input = scan.nextLine();
		
		int code = input.charAt(0);
		
		//입력받은 문자가 소문자일 경우에만 대문자로 변경
				
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", code
				, (code >= 'a' && code <= 'z') ? code - ('a' - 'A') : code);
		
		//코드리뷰
		//삼항연산자 사용하지 않고 결과에 바로 code - 32
		//문제에서 소문자 이외의 문자 들어오는 조건 요구하지 않았기 때문에 삼항연산자 불필요
		
		
	}
}
