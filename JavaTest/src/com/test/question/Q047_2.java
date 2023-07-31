package com.test.question;

import java.util.Scanner;

public class Q047_2 {
//돈을 안넣거나, 돈을 모자라게 넣었을 경우 처리
	public static void main(String[] args) {
		/*
		 * 전체 반복
		 * 1. 자판기 출력
		 * 2. 금액 받기
		 * 3. 음료 번호 받기
		 * 4. [금액이 500원미만
		 * 5. 700미만 투입인데 콜라 / 600 미만 투입인데 사이다
		 * 6. 음료번호 1, 2, 3 이외]
		 * 7. --> 처음으로 돌아감
		 * 8. 결과 출력
		 */
		
		vendingMachine();
		
	}



private static void vendingMachine() {
	Scanner scan = new Scanner(System.in);
	
	
	for (;;) {

		printMachine();
		
		
		System.out.print("금액 투입(원): ");
		int input = scan.nextInt();
		System.out.print("음료 선택(번호): ");
		int num = scan.nextInt();
		
		//투입금액, 선택 번호 유효성 검사
		int valid = validation(input, num);
		
		if (valid == -1) {
			System.out.println("잘못된 선택입니다. 처음으로 돌아갑니다.\n");
			continue;
		} else if (valid == 0) {
			System.out.println("금액이 부족합니다. 처음으로 돌아갑니다.\n");
			continue;
		}

		
		//반환값이 2개라 메소드 뺄수없음?
		String drink = "";
		int change = 0;
		if (num == 1) {
			drink = "콜라";
			change = input - 700;
		} else if (num == 2) {
			drink = "사이다";
			change = input - 600;
		} else if (num == 3) {
			drink = "비타500";
			change = input - 500;
		}
		
		
		//결과를 출력하는 부분
		System.out.printf("+%s를 제공합니다.\n", drink);
		System.out.printf("+잔돈 %d원을 제공합니다.\n", change);
		
		
		scan.nextLine();
		
		System.out.print("계속 하시려면 엔터를 입력하세요.");
		scan.nextLine();
		
		
		
		//main(args)
	}
}



	private static int validation(int input, int num) {
	
		if (input < 500) {
			return 0;
		}
		
		if (num != 1 && num != 2 && num != 3) {
			return -1;
		}
		
		if (num == 1 && input < 700) {
			return 0;
		} else if (num == 2 && input < 600) {
			return 0;
		}
		return 1;
		
}



	private static void printMachine() {
		System.out.println("====================");
		System.out.println("\t자판기");
		System.out.println("====================");
		System.out.println("1. 콜라 : 700원");
		System.out.println("2. 사이다 : 600원");
		System.out.println("3. 비타500 : 500원");
		System.out.println("--------------------");
		}
}

//코드리뷰
//투입금액, 번호를 잘못 입력했을 때 처리 방법
//나 -> 전체 과정을 진행하는 메소드를 만들어서 메소드 안에서 무한루프를 돌면서 유효하지 않으면 다음 루프로 이동
// 다른 팀원분 -> main()에서 재귀 호출

