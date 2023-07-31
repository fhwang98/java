package com.test.question;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");
		String input = scan.nextLine();
		int code = input.charAt(0);
		
		if (code >= 'a' && code <= 'z') {
			System.out.printf("'%c'의 대문자는 '%c'입니다.\n", code, code - ('a' - 'A'));
		} else if (code >= 'A' && code <= 'Z') {
			System.out.printf("'%c'의 소문자는 '%c'입니다.\n", code, code + ('a' - 'A'));
		} else {
			System.out.println("영문자만 입력하시오.");
		}
	}

}

//코드리뷰
//toUpperCase(), toLowerCase() 메소드 사용해서 대소문자 반환하는 방식으로 풀 수 있음
