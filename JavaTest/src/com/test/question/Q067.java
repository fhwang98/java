package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		//길이 10인 배열 생성
		//삽입 위치 : 배열의 인덱스
		//입력받은 인덱스에 값을 집어넣음 - > 그 뒤에 있던 숫자는 한칸씩 오른쪽으로 이동
		//마지막까지 차있는데 중간에 값을 삽입 > 마지막 요소는 버림
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = { 5, 6, 1, 3, 2, 8, 7, 4, 10, 9 };
//		int[] array = { 5, 6, 1, 3, 2, 0, 0, 0, 0, 0 };
		
		
		System.out.print("삽입 위치: ");
		int pos = scan.nextInt();
		
		System.out.print("값: ");
		int insert = scan.nextInt();
		
		System.out.println("원본: " + Arrays.toString(array));
		
		int temp;
		for (int i = pos; i < array.length; i++) {
			temp = array[i];
			array[i] = insert;
			insert = temp;
		}
		
		System.out.println("결과: " + Arrays.toString(array));
		
	}
}

//은하님 풀이 > 마지막에는 스왑 안하고 바로 버려줌  
/*
		    if (index == nums.length - 1) { // 배열의 마지막 자리일 경우 바로 넣고 종료.
            nums[index++] = value;
            break;
         }
 */