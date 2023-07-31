package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
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
		
	}

	private static boolean validCheck(String input) {

		int opCount = 0;
		int numCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+'
					||input.charAt(i) == '-'
					||input.charAt(i) == '*'
					||input.charAt(i) == '/'
					||input.charAt(i) == '%') {
				opCount++;
			}
		}
		
		return false;
	}
}
