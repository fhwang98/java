package com.test.java;

import java.util.Scanner;

public class Ex12_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Wrapper Class 기존의 기능을 감싸서 개량, 확장
		
//		System.out.print("문자열: ");
//		String line = scan.nextLine(); //reader.readLine()과 동일한 기능
//		System.out.println(line);
//		
//		System.out.print("숫자: ");
//		int num = scan.nextInt(); // Integer.parseInt("100") 
//		System.out.println(num);
		
		//숫자 2개 입력 > 연산
		System.out.print("첫번째 숫자: ");
		
		//String input = reader.readLine();
		//int num = Integer.parseInt(input);
		
		double num1 = scan.nextDouble();
		
		System.out.print("두번째 숫자: ");
		
		double num2 = scan.nextDouble();
		
		System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1 + num2);
		
		
	}
}
