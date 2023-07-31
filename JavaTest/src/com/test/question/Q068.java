package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {

	public static void main(String[] args) {
		//요소를 삭제했으면 그 뒤에 있던 요소들을 왼쪽으로 이동
		//오른쪽까지 차있었는데 중간에 삭제 > 마지막에 0으로 채워줌
		
//		int[] array = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };
		int[] array = { 5, 6, 1, 3, 2, 8, 7, 4, 10, 9 };
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제 위치: ");
		int pos = scan.nextInt();
		
		
		for (int i = pos; i < array.length; i++) {
			if (i < array.length - 1) {
				array[i] = array[i + 1];
			} else {
				array[i] = 0;
			}
		}
		
		System.out.println(Arrays.toString(array));
		
	}
}
