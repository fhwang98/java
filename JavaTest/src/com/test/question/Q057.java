package com.test.question;

public class Q057 {
	
	public static void main(String[] args) {
		//이중 반복문 가능
		// 반복문 1개로도 풀이 가능

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			sum = 0;
			for (int j = 1; j <= i * 10; j++) {
				sum += j;
			}
		
			System.out.printf("1 ~ %3d: %4d\n", i * 10, sum);
		}
		
		
	}
}
