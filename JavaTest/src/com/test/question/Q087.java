package com.test.question;

import java.util.Scanner;

public class Q087 {

	public static void main(String[] args) {
		//파스칼표기법으로 쓰인 단어를 두 단어로 분리
		//두번째 문자부터 탐삭하다가 대문자를 만나면 분리
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		String input = scan.nextLine();
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (i != 0 && isUpperCase(input.charAt(i))) {
				result += " ";
			}
			result += input.substring(i, i + 1);
		}
		
		
		System.out.printf("결과: %s\n", result);
	}

	private static boolean isUpperCase(char c) {
		if ( c >= 'A' && c <= 'Z') {
			return true;
		}
		return false;
	}
}
