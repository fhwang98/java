package com.test.question;

import java.util.Scanner;

public class Q039 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int last = scan.nextInt();
		
		int sum = 0;
		String result = "";
		
		for (int i = start; i <= last; i++) {
			sum += i;
			result += i;
			if (i < last) {
				result += " + ";
			}
		}//for
		
		System.out.printf("%s = %d\n", result, sum);
		
	}//main
	
	
	
}
