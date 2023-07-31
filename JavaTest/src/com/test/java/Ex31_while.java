package com.test.java;

import java.util.Scanner;

public class Ex31_while {

	public static void main(String[] args) {

		/*
			반복문
			1. for문
			
			2. while문
			3. do while문
			
			4. for문

			
			if (조건식) {
				문장;
			}
			
			2. while문 선조건 후실행
			while (조건식) {
				문장;
			}
			
			3. do while문 선실행 후조건
			do
			{
				문장;
			}
			while (조건식);
			
			
			
		*/
		
//		m1();
//		m2();
//		m3();
		m4();
		
		
	}

	private static void m4() {

		//콘솔 > UI > 프로젝트 적용
		//자판기
		//1. 메뉴 출력
		//2. 선택
		//3. 결과
		//1~3 반복
		
		Scanner scan = new Scanner(System.in);
		
		int sel = 0; // 사용자 선택 메뉴 번호
		boolean loop = true; //반복 조건 > 루프 변수
		
		while (loop) {
			menu();
			sel = scan.nextInt();
			scan.skip("\r\n");
			
			if (sel == 1) {
				//콜라 처리
				m1(scan);
				
			} else if (sel == 2) {
				//사이다 처리
				m2(scan);
			} else if (sel == 3) {
				//커피 처리
				m3(scan);
			} else {
				//종료
				loop = false;
			}
			
			
			
		}//while
		
		System.out.println("프로그램 종료");
	}

	private static void m3(Scanner scan) {
		System.out.println("커피 ~~~");
		pause(scan);
	}

	private static void m2(Scanner scan) {
		System.out.println("사이다 ~~~");
		pause(scan);
	}

	private static void m1(Scanner scan) {
		System.out.println("콜라 ~~~");
		

//			//프로그램을 잠시 중단(콘솔 버전) > 블럭
//			System.out.println("계속하려면 엔터를 입력하세요.");
//			scan.nextLine();
		
		//refactor
		//블럭 잡고 우클릭 > refactor > Extract Method
		//Shift + Alt + M
		//메소드 자동으로 만들어줌 ㄷ ㄷ
		pause(scan);
	}

	private static void menu() {
		System.out.println("==========");
		System.out.println("   자판기");
		System.out.println("==========");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("4. 종료");
		System.out.println("----------");
		System.out.print("선택(번호): ");
	}

	private static void pause(Scanner scan) {
		//프로그램을 잠시 중단(콘솔 버전) > 블럭
		System.out.println("계속하려면 엔터를 입력하세요.");
		scan.nextLine();
	}

	private static void m3() {

		//1 ~ 10까지 누적하시오.
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		sum = 0;
		int num = 1;
		
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println();
		
		
	}

	private static void m2() {
		
		int num = 11;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num = 11;
		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
		
		
		
	}

	private static void m1() {

		//요구사항] 1 ~ 10까지 출력하시오.
		
		for (int i = 1; i <= 10; i++) { //초기식; 조건식; 증감식
			System.out.println(i);
		}
		System.out.println();
		
		int num = 1; //초기식
		while (num <= 10) { //조건식
			System.out.println(num);
			num++; //증감식
		}
		System.out.println();
	}

}
