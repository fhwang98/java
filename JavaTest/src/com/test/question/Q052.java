package com.test.question;

import java.util.Scanner;

public class Q052 {

	public static void main(String[] args) {
		/*
		 * 별찍기 응용 -> 문자코드값으로 찍으면 됨
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("행: ");
		int row = scan.nextInt();
		
		//공백 개수 row - (i + 1)
		//문자 개수 2*(i+1)
		for (int i = 0; i < row; i++) {
			//공백찍기
			for (int j = 0; j < row - (i + 1); j++) {
				System.out.print(" ");
			}
			//문자찍기
			//a b 순서로 찍고 >
			//b a 순서로 찍기 나눠서
			//a
			//ab
			//abc
			//abcd
			for (int c = 'a'; c <= 'a' + i; c++) {
				System.out.printf("%c", c);
				
			}
			//반대로
			for (int c = 'a' + i; c >= 'a'; c--) {
				System.out.printf("%c", c);
				
			}
			
			
			System.out.println();
		}
		
	}
}
