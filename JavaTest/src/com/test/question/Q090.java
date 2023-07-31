package com.test.question;

import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {
		//모든 숫자를 한자리씩 추출해서 그걸 전부 더함
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				sum += input.charAt(i) - '0';
			}
		}
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n", sum);
	}
}
