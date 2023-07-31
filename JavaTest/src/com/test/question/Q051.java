package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행: ");
		int row = scan.nextInt();
		
		//공백의 개수 row - (i + 1)
		//별의 개수 1 + 2*i
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < row - (i + 1); j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//코드리뷰
//50번 별찍기에
//피라미드를 완성하는 만큼의 별을 찍는 코드를 추가 (현재 행 - 1)개씩