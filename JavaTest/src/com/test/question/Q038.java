package com.test.question;

import java.util.Scanner;

public class Q038 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 횟수: ");
		int count = scan.nextInt();
		
		int input = 0;
		int sumOdd = 0;
		int countOdd = 0;
		int sumEven = 0;
		int countEven = 0;
		
		for (int i = 0; i < count; i++) {
			System.out.print("숫자: ");
			input = scan.nextInt();
			if (input % 2 == 0) {
				sumEven += input;
				countEven++;
			}
			else {
				sumOdd += input;
				countOdd++;
			}
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", countEven, sumEven);
		System.out.printf("홀수 %d개의 합: %d\n", countOdd, sumOdd);
	}
}
