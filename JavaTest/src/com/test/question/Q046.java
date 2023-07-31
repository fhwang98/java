package com.test.question;

import java.util.Scanner;

public class Q046 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		String result = "";
		
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			input = scan.nextInt();
			if (input == 1)
				result += "일";
			else if (input == 2)
				result += "이";
			else if (input == 3)
				result += "삼";
			else if (input == 4)
				result += "사";
			else if (input == 5)
				result += "오";
			else if (input == 6)
				result += "육";
			else if (input == 7)
				result += "칠";
			else if (input == 8)
				result += "팔";
			else if (input == 9)
				result += "구";
			else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		System.out.println(result);
	}
}
