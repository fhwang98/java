package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		//TODO 연산식 풀기
		
		//연산식을 입력받아 진짜 연산을 함
		//띄어쓰기 무시
		//연산자가 올바르지 않거나 피연산자가 부족한 경우 경고
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		if (!validCheck(input)) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		char op = getOp(input);
		int i = 0;
		int num1;
		while (input.charAt(i) != op) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
			}
			i++;
		}
		
	}


private static char getOp(String input) {
	
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+') {
				return '+';
			} else if (input.charAt(i) == '-') {
				return '-';
			} else if (input.charAt(i) == '*') {
				return '*';
			} else if (input.charAt(i) == '/') {
				return '/';
			} else if (input.charAt(i) == '%') {
				return '%';
			}
		}
		return 0;
	}


	private static boolean validCheck(String input) {

		int opCount = 0;
		int numCount = 0;
		boolean startNum = true;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9'
					&& startNum) {
				numCount++;
				startNum = false;
			} else if (input.charAt(i) == '+' || input.charAt(i) == '-' 
					|| input.charAt(i) == '*' || input.charAt(i) == '/' 
					|| input.charAt(i) == '%' ) {
				opCount++;
				startNum = true;
			}
		}
		System.out.println(opCount);
		System.out.println(numCount);
		if (opCount == 1 && numCount == 2) {
			return true;
		} else {
			return false;
		}
	}
}
