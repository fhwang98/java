package com.test.question;

import java.util.Scanner;

public class Q012 {
	public static void main(String[] args) {
		
		//요구사항]	숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int n = scan.nextInt()	;
		String result;
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
	}
	
	public static String getNumber(int n ) {
		return (n % 2 == 0) ? "짝수" : "홀수";
	}
}
