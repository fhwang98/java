package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {
		//1 ~ 45 -> 6개 > 중복되지 않는 숫자
		//이미 나온 숫자를 다시 나오지 않게 하는 부분을 고민해보기
		
		//일단 길이 6의 정수 배열 선언
		
		
		//1 ~ 45까지의 난수
		//(int)(Math.random() * 45) + 1
		
		
		//for (int k = 0; k < 10; k++) {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			
			int random = (int)(Math.random()*45) + 1;
			
			if (isDuplicate(lotto, random)) {
				i--; // i값 그대로 반복문 다시 들어감 새로운 random변수와 비교
			} else {
				lotto[i] = random;
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		//}

	}

	private static boolean isDuplicate(int[] lotto, int random) {
		
		for (int i = 0; i < lotto.length; i++) {
		
			if (lotto[i] == random) {
				return true;
			}
		}
		return false;
	}
}

//은하님 방법
//boolean 배열에 중복여부 true false로 기억
//useSet 클래스
