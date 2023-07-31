package com.test.question;

import java.util.Scanner;

public class Q061 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
				
		//입력받는 부분
		getNums(nums);
		
		// 출력하는 부분 인덱스가 5부터 0까지
		printNums(nums);
		
		
		
		
	}

	private static void printNums(int[] nums) {
		for (int i = nums.length - 1; i >= 0; i--) {
			
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
			
		}
	}

	private static void getNums(int[] nums) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("숫자: ");
			nums[i] = scan.nextInt();
		}
	}
}
