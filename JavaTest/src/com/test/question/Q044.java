package com.test.question;

import java.util.Scanner;

public class Q044 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		String result = "";
		
		for (int i = 0; sum < 100; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				sum += num;
				result += " + "  + num;
			} else {
				sum -= num;
				result += " - "  + num;
			}
		}
		System.out.println(result + " = " + sum);
	}
}
