package com.test.question;

public class Q053 {

	public static void main(String[] args) {
		/*
		 * 1. 2중 for문 x 2번
		 * 2. 3중 for문 x 1번
		 */
		
		/*
			2		3		4		5
			
		-> 여기까지 하나
		int = 2 부터 5까지	
			
			6		7		8		9
		
		-> 여기까지 하나
		
		
		*/
		
		//필요한 변수 목록
		// 단수 (지금 몇단) : j
		// 곱해주는 수 (1 ~ 9) : i
		
		//가장 밖에 있는 반복문은 행수
		//일단 윗단만 생각
		for (int i = 1; i < 10; i++) { // i는 숫자에 곱해주는수
			for (int j = 2; j <= 5; j++) { // j는 지금 몇단인지
				System.out.printf("%d x %d = %d", j, i, j * i);
				if (j < 5)
					System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//아랫단
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.printf("%d x %d = %d", j, i, j * i);
				if (j < 9)
					System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
