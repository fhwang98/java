package com.test.question;

import java.util.Scanner;

public class Q049 {
	
	public static void main(String[] args) {
		/*
			*****
			 ****
			  ***
			   **
			    *
			별 앞에 공백 찍어야함
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		int row = scan.nextInt();
		
		for (int i = 0; i < row; i++) {
			//공백의 개수 = i개
			//별의 개수 = row - i개
			
			for (int j = 0; j < i; j++) { // i개만큼만 공백 찍기
				System.out.print(" ");
			}
			
			for (int j = 0; j < row - i; j++) { //row - i개 만큼만 공백 찍기
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
