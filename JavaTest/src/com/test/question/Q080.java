package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		String input = scan.nextLine();
		
		//charAt or substring
		
		
		System.out.print("역순 결과: ");
		for (int i = input.length() - 1 ; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		
	}
}
