package com.test.question;

public class Q070 {

	public static void main(String[] args) {

		int[][] nums = new int[5][5];
		
		int n = 1;
		
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < nums[i].length; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for (int j = nums[i].length - 1; j >= 0; j--) {
					nums[i][j] = n;
					n++;
				}
			}
		}

		//출력문은 그대로 복붙
		for (int i = 0; i < 5; i++) {
			for (int j =0; j< 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
