package com.test.question;

import java.util.Scanner;

public class Q089 {

	public static void main(String[] args) {
		//몇번재 자리냐를 확인해서 어떤 자릿수인지를 알아야 함
		//일 십 백 천
		//만 십만 백만 천만
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		String input = scan.nextLine();
		if (Integer.parseInt(input) < 0
				|| Integer.parseInt(input) > 999999999) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		input = reverse(input);
		String result = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (i % 4 == 1) {
				result += "십";
			} else if (i % 4 == 2) {
				result += "백";
			} else if (i % 4 == 3) {
				result += "천";
			} else if (i > 3) {
				result += "만";
			}
			result += toKor(input.charAt(i));
		}
		
		System.out.printf("일금 %s원\n", reverse(result));
	}

	private static char toKor(char c) {
		if (c == '1') {
			return '일';
		} else if (c == '2') {
			return '이';
		} else if (c == '3') {
			return '삼';
		} else if (c == '4') {
			return '사';
		} else if (c == '5') {
			return '오';
		} else if (c == '6') {
			return '육';
		} else if (c == '7') {
			return '칠';
		} else if (c == '8') {
			return '팔';
		} else {
			return '구';
		} 
	}

	private static String reverse(String input) {
		String rev = ""; 
		for (int i = 0; i < input.length(); i++) {
			rev += input.substring(input.length() - i - 1, input.length() - i);
		}
		return rev;
	}

}
