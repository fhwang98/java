package com.test.question;

import java.util.Scanner;

public class Q065 {

	public static void main(String[] args) {
		//난수 중 최대최소 범위에 포함되는 숫자
		
		/*
			조건..
			난수를 20개 발생 후 배열에 넣는다.
			난수는 1 ~ 20 사이
			배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
			입력..
			최대 범위: 15 
			
			최소 범위: 5 
			
			출력..
			원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
			결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		 */
		
		
		
		//길이 20의 난수 배열 생성
		int[] random = getRandom();
		
		//범위 최대최솟값 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 범위: ");
		int max = scan.nextInt();
		
		System.out.print("최소 범위: ");
		int min = scan.nextInt();
		
		//최대 최소 범위 이상하면?
		if (min > max || min < 1 || max > 20) {
			System.out.println("입력이 잘못되었습니다. 프로그램을 종료합니다.");
			return;
		}
		
		//random 배열 출력
		printRandom(random);
		
		//random 배열의 각 요소가 최대최소 범위에 들어가는지 확인
		//xxx최대최소 범위에 포함이 되면 새로운 배열에 추가 >>> 하려면 카운트로 개수를 세서 길이를 알아야...> 비효율적 탈락!
		//그냥 바로 출력
		printResult(random, max, min);
		
		
	}

	private static int[] getRandom() {
		int[] random = new int[20];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*20) + 1 ;
		}
		return random;
	}

	private static void printRandom(int[] random) {
		System.out.print("원본: ");
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + ", ");
		}
		System.out.println();
	}

	private static void printResult(int[] random, int max, int min) {
		System.out.print("결과: ");
		for (int i = 0; i < random.length; i++) {
			if (random[i] >= min && random[i] <= max) {
				System.out.print(random[i] + ", ");
			}
		}
		System.out.println();
	}
}
