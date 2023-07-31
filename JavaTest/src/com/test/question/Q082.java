package com.test.question;

import java.util.Scanner;

public class Q082 {

	public static void main(String[] args) {
		//10으로 나눈 나머지로 풀이했던 문제
		//이번에는 charAt() or substring() 풀이
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		String input = scan.nextLine();
		
		
		int num = 0;
		int sum = 0;
		
		System.out.print("결과: ");
		
		for (int i = 0; i < input.length(); i++) {
			String devided = input.substring(i, i + 1);
			num = Integer.parseInt(devided);
			sum += num;
			System.out.print(num);
			if (i < input.length() - 1)
				System.out.print(" + ");
		}
		
		System.out.println(" = " + sum);
		
		
//		
//		int num= 0, sum = 0;
//		
//		String result = "결과: ";
//		
//		for (int i = 0; i < input.length(); i++) {
//			String divided = input.substring(i, i + 1);
//			num = Integer.parseInt(divided);
//			sum += num;
//			result += num;
//			if (i < input.length() - 1)
//				result += " + ";
//		}
//		
		
		
		
		
	}
}
