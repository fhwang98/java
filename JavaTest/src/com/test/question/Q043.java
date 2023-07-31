package com.test.question;

import java.util.Scanner;

public class Q043 {

	public static void main(String[] args) {
		
		//컴퓨터가 1~10 사이의 숫자 1개를 생각 > 난수 생성
		//최대 시도 횟수 10회
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n");
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		
		//10회 안에 성공했을 경우
		//10 회 안에 성공하지 못했을 경우
		
		for (int i = 0; i < 10; i++) {
			System.out.print("숫자: ");
			input = scan.nextInt();
			if (input == random) {
				System.out.println("맞았습니다.\n");
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i + 1);
				break;
			} else {
				System.out.println("틀렸습니다.\n");
				if (i == 9) {
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
					System.out.println("모든 기회를 실패했습니다.");
				}
			}
		}
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
	}
}
