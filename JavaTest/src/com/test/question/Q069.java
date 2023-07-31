package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

	public static void main(String[] args) {
		//난수 배열 만듦
		//결과배열 1항 : 1 + 2항
		// 2항 : 3 + 4항
		//배열 길이가 홀수다 > 마지막은 그냥 마지막항
		/*
			
			1, 5, 3, 6, 2, 7, 8, 2, 2, 9

			result[0] = random[0] + random[1]
			result[1] = random[2] + random[3]
			result[2] = random[4] + random[5]
			result[3] = random[6] + random[7]
			result[4] = random[8] + random[9]
			
			i > 규칙
			result[I] = random[I * 2] + random[I * 2 + 1]
			홀수 & 마지막일때 규칙
			result[i] = random[i*2]
		*/
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이: ");
		int length = scan.nextInt();
		
		//1 ~ 9 까지의 난수를 요소로 갖는 배열 생성
		int[] random = getRandom(length);
		
		
		//새로운 배열 생성
		// 배열 길이 10 > 5 짝수면 길이 length / 2
		// 5개 > 3 홀수면 length / 2 + 1
		if (length % 2 == 0) {
			length = length / 2;
		} else {
			length = length / 2 + 1;
		}
		
		//코드리뷰 
		//배열의 길이 삼항연산자로
		//int[] shortNums = new int[(length % 2 == 0) ? length / 2 : length / 2 + 1];
		
		int[] result = getResult(length, random);
		
		
		System.out.println("원본: " + Arrays.toString(random));
		System.out.println("결과: " + Arrays.toString(result));
		
	}

	private static int[] getResult(int length, int[] random) {
		int[] result = new int[length];
		
		for (int i = 0; i <result.length; i++) {
			if (result.length % 2 == 1 && i == result.length - 1) {
				result[i] = random[i * 2];
			} else {
				result[i] = random[i * 2] + random[i * 2 + 1];
			}
			
		}
		return result;
	}

	private static int[] getRandom(int length) {
		int[] random = new int[length];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random() * 9) + 1;
		}
		return random;
	}
}
