package com.test.question;

import java.util.Scanner;

public class Q050 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int row = scan.nextInt();
		
		for (int i = 0; i < row; i++) {
			//공백의 개수 row - i
			//별의 개수 i + 1
			
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
 