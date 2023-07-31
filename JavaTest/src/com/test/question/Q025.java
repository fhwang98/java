package com.test.question;

import java.util.Scanner;

public class Q025 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second = scan.nextInt();
		
		if (first > second) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다."
								, first, second, first - second);
		} else if (first < second) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다."
								, second, first, second - first);
		
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}
		
	}

}
