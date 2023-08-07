package com.test.question;

public class Q074 {

	public static void main(String[] args) {

		//다이아별찍기
		//윗 피라미드 + 아래 피라미드로 생각해서 풀이 
		int[][] nums = new int[5][5];
		

		int n = 1;
		
		/*
			숫자가 들어간 위치
			
			0,2						j위치 3			시작 위치 2	반복 횟수 : 1	
			1,1 1,2 1,3				j위치 1 2 3		시작 위치 1	반복 횟수 : 3	
			2,0 2,1 2,2 2,3 2,4		j위치 0 1 2 3 4	시작 위치 0	반복 횟수 : 5
				
			3,1 3,2 3,3				j위치 1 2 3		시작 위치 1	반복 횟수 : 3	
			4,2						j위치 3			시작 위치 2	반복 횟수 : 1	
		
		 */
		for (int i = 0; i < nums.length / 2 + 1; i++) { //윗쪽 피라미드
			for (int j = nums.length / 2 - i; j <= nums.length / 2 + i; j++) {  
				nums[i][j] = n;
				n++;
			}
		}
		
		//i : 2 시작위치 2 - 2 = 0 끝위치 4 = 5 - 1 = 길이 - (i - 1)
		//i : 3	시작위치 3 - 2 = 1 끝위치 3 = 5 - 2
		//i : 4	시작위치 4 - 2 = 2 끝위치 2 = 5 - 3
		
		for (int i =  nums.length / 2 + 1; i < nums.length; i++) { //아래쪽 피라미드
			for (int j = i - 2; j < 7 - i; j++) {  
				nums[i][j] = n;
				n++;
			}
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
