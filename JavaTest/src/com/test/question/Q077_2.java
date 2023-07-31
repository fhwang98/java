package com.test.question;

public class Q077_2 {

	public static void main(String[] args) {
		//대각선 규칙으로 숫자 채워넣기
		//0,0 = 1		//0,1 = 2 		//0,2 = 4 		//0,3 = 7 
							//1,0 = 3		//1,1 = 5		//1,2 = 8
												//2,0 = 6		//2,1 = 9
																	//3,0 = 10
		
		//△
		//▽ 나눠서 생각
		
		
		int[][] nums = new int[3][3];
		

		int n = 1;
		
	
		for (int i =0; i< nums.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				nums[j][i - j] = n;
				n++;
			}
		}
		
		for(int i = 0; i < nums.length - 1; i++) { //맞아.
			
			for (int j = nums.length - 1; j > i ;j--) {//맞아.
				nums[i - j + nums.length][j] =n;
				n++;
			}
			
			/*
				j = 4  - i// i = 4 - j
				a = 2i + 1 = 2(4-j) + 1 = 9 - 2j
				
			*/
			
		}

		
		
		//출력부
		for (int i = 0; i < nums.length; i++) {
			for (int j =0; j< nums[i].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
