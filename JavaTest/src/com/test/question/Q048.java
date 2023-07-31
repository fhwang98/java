package com.test.question;

import java.util.Scanner;

public class Q048 {
/*
	273645281 > substring() X
	연산자를 통해서 풀이
	
	2 + 6 + 4 + 2 + 8 = 22
	7 + 3 + 5 + 1 = 16

*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int input = scan.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		
		if (input < 0 || input > 2147483647)
			return;
		
		//한글자씩 보기 위해
		//10으로 나눈 나머지 -> 홀짝 판별
		//10으로 나눈 몫 반복 (나머지 버림)
		for (int i = input; i > 0; i /= 10) {
			if ((i % 10) % 2 == 0) {
				sumEven += i % 10;
			} else
				sumOdd += i % 10;
		}
		System.out.printf("짝수의 합: %d\n", sumEven);
		System.out.printf("홀수의 합: %d\n", sumOdd);
	}

}

//문자 배열로 풀이
//처음 받은 숫자를 문자열에 저장
//toCharArray() 문자열을 문자 배열로 바꿔서 문자 하나씩 확인