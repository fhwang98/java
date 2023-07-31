package com.test.question;

import java.util.Scanner;

public class Q056 {

	public static void main(String[] args) {
		//두 숫자의 약수와 공약수
		//공약수 : 두 수의 약수의 교집합
		//이중 반복문
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = scan.nextInt();
		
		//첫번째 숫자의 약수들을 구한다
		//두번째 숫자의 약수들을 구한다
		printDivisor(num1);
		printDivisor(num2);
		printCommon(num1, num2);
		
	}

	
	private static void printCommon(int num1, int num2) {
		
		String result = "";
		
		
		for (int i = 1; i <=((num1 < num2) ? num1 : num2); i++) { 
		//for (int i = 1; i <= Math.min(num1, num2) ; i++) { 
			if (num1 % i == 0 && num2 % i == 0) {
				result += i + ", ";
			}
		}
		
		System.out.printf("%d와 %d의 공약수: %s\n", num1, num2, result);
		
	}

	private static void printDivisor(int num) {
		System.out.print(num + "의 약수: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + ", ");
		}
		System.out.println();
	}
}
