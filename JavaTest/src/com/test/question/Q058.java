package com.test.question;

public class Q058 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = 0;
			for (int j = 1 + i * 10; j <= 10 * (i + 1); j++) {
				sum += j;
			}
			System.out.printf("%2d ~ %3d: %4d\n", 1 + i * 10, (i + 1) * 10, sum);
		}
	}
}
