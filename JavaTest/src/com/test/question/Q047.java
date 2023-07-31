package com.test.question;

import java.util.Scanner;

public class Q047 {
//돈을 안넣거나, 돈을 모자라게 넣었을 경우 처리
	public static void main(String[] args) {
		//TODO 코드개선 필요
		/*
		 * 전체 반복
		 * 1. 자판기 출력
		 * 2. 금액 받기
		 * 3. 금액이 500원보다 작으면 다시 입력 -> 금액받기로 돌아감
		 * 4. 음료 번호 받기
		 * 5. 123 이외의 번호 -> 입력이 잘못되었습니다. -> 번호받기로 돌아감
		 * 6. 700미만 투입인데 콜라 / 600 미만 투입인데 사이다 -> 금액이 부족합니다. -> 금액받기로 돌아감 
		 * 7. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int num = 0;

		
		for (;;) {

			printMachine();
			
			//입력받은 숫자 유효성 검사하는 부분
			
			System.out.print("금액 투입(원): ");
			input = scan.nextInt();
			if (input < 500) {
				System.out.println("금액이 부족합니다. 처음으로 돌아갑니다.\n");
				continue;
			}
			
			System.out.print("음료 선택(번호): ");
			num = scan.nextInt();
			if (num != 1 && num != 2 && num != 3) {
				System.out.println("잘못된 선택입니다. 처음으로 돌아갑니다.\n");
				continue;
			}
			
			if (num == 1 && input < 700) {
				System.out.println("금액이 부족합니다. 처음으로 돌아갑니다.\n");
				continue;
			} else if (num == 2 && input < 600) {
				System.out.println("금액이 부족합니다. 처음으로 돌아갑니다.\n");
				continue;
			}
			
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
		}
		
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
