package com.test.question;

import java.util.Scanner;

public class Q031 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int even = 0;
		
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		if (num % 2 == 0) 
			even++;
			
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		if (num % 2 == 0) 
			even++;
		
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		if (num % 2 == 0) 
			even++;
		
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		if (num % 2 == 0) 
			even++;
		
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		if (num % 2 == 0) 
			even++;
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even, 5 - even);
		if (even < 3)
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", 5 - even * 2);
		else
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", even * 2 - 5);
		
		
	}

}
