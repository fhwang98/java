package com.test.question;

import java.util.Arrays;

public class Q078 {

	public static void main(String[] args) {
		//달팽이 문제
		//ㄱ ㄴ ㄱ ㄴ 패턴 반복
		// ㄱ 방 번호 증가
		// ㄴ 방 번호 감소
		
		// 0,0  0,1  0,2  0,3  0,4
		// 1,4  2,4  3,4  4,4
		
		
		// 4,3  4,2  4,1  4,0
		// 3,0  2,0  1,0
		
		
		// 1,1  1,2  1,3
		// 2,3  3,3
		
		
		// 3,2  3,1
		//2,1
		
		
		// 2,2
		
		
		
		int[][] nums = new int[5][5];
		
		int n = 1;
		

		
		// 우 > 하 > 좌 > 상
		// 1차원 배열의 인덱스가 증가하거나 감소하는 경우 : 좌, 우 
		// 2차원 배열의 인덱스가 증가하거나 감소하는 경우 : 상, 하
		
		for (int k = 0; k < nums.length / 2 + 1; k++) { // 상하좌우반복횟수 5x5 -> 3번 7x7 -> 4번 9x9 -> 5번
														//길이/2 + 1번
			
			//우
			for (int j = k; j < nums.length - k; j++) {
				nums[k][j] = n++;
			}
			//하
			for (int i = 1; i < nums.length - k; i++) {
				nums[i][4] = n++;
			}
			//좌
			for (int j = 3; j > 0 ; j--) {
				nums[4][j] = n++;
			}
			//상
			for (int i = 4; i > 0; i--) {
				nums[i][0] = n++;
			}
			
//			//우
//			for (int j = 0; j < 5; j++) {
//				nums[0][j] = n++;
//			}
//			//하
//			for (int i = 1; i < 5; i++) {
//				nums[i][4] = n++;
//			}
//			//좌
//			for (int j = 3; j > 0 ; j--) {
//				nums[4][j] = n++;
//			}
//			//상
//			for (int i = 4; i > 0; i--) {
//				nums[i][0] = n++;
//			}
			
			
			//하드코딩한 숫자들의 규칙을 찾자 ....... .
			
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


//경우를 상하좌우로 나누어서 반복
//증가하고 감소하는 패턴은 어떤 수에 -1을 곱해서더해줌 
