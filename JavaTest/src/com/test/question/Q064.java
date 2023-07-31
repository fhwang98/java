package com.test.question;

public class Q064 {

	public static void main(String[] args) {
		//난수 특성상 중복값 있을 수 있음
		//하나만 찾으면 됨

		//1에서 20 사이 난수 생성...
		//TODO 난수 생성 방법 복습
		//System.out.println((int)(Math.random()*20 + 1));

		//길이 20, 범위 1~20 의 난수배열 선언
		int[] random = getRandom();
		
		//난수 배열 출력
		//출력 형식]
		//원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
		
		printRandom(random);
		
		//배열을 탐색하면서 최대최솟값 확인
		//최댓값을 먼저 구한다
//		getMax(random);
		
		//최솟값을 구한다
//		getMin(random);
		
		getMinMax(random);
		
		
	}

	private static void getMinMax(int[] random) {
		int max = random[0];
		int min = random[0];
		for (int i = 0; i < random.length; i++) {
			if (random[i] > max) {
				max = random[i];
			}
			if (random[i] < min) {
				min = random[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}

	private static void getMin(int[] random) {
		int min = random[0];
		for (int i = 0; i < random.length; i++) {
			if (random[i] < min) {
				min = random[i];
			}
		}
		System.out.println("최솟값: " + min);
	}

	private static void getMax(int[] random) {
		int max = random[0];
		for (int i = 0; i < random.length; i++) {
			if (random[i] > max) {
				max = random[i];
			}
		}
		System.out.println("최댓값: " + max);
	}

	private static void printRandom(int[] random) {
		System.out.print("원본: ");
		for (int i = 0; i <random.length; i++) {
			System.out.print(random[i] + ", ");
		}
		System.out.println();
	}

	private static int[] getRandom() {
		int[] random = new int[20];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*20 + 1);
		}
		return random;
	}
}

//코드리뷰
//난수 생성법 Random 클래스
//은하님 방식 코드 대박 짧음
