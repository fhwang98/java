package com.test.question;

public class Q075 {

	public static void main(String[] args) {

		//4x4까지는 1씩 증가
		//마지막 칸은 숫자의 합계
		
		int[][] nums = new int[5][5];
		

		int n = 1;
		
		for (int i = 0; i < nums.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				if (i < nums.length - 1 && j < nums[i].length - 1) {
					nums[i][j] = n;
					rowSum += n;
					n++;
				}
			}
			nums[i][4] = rowSum;
		}
	

		for (int k = 0 ; k < 5; k++) {
			int colSum = 0;
			for (int i = 0; i < 5; i++)
				colSum += nums[i][k];
			nums[4][k] = colSum;
		}
		
		
		//출력부
		for (int i = 0; i < 5; i++) {
			for (int j =0; j< 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}

	}
}
