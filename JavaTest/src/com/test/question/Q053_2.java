package com.test.question;

public class Q053_2 {

	public static void main(String[] args) {
		
		//k 반복수 > 덩어리를 두번 반복
		for (int k = 2; k <= 6; k += 4) {
			for (int i = 1; i < 10; i++) {
				for (int j = k ; j < k + 4; j++) {
					System.out.printf("%d x %d = %d", j, i, j * i);
					if (j < k + 3)
						System.out.print("\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}		
}
