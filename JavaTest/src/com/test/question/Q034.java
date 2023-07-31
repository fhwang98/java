package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {

	public static void main(String[] args) {
		//Calendar 사용
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년: ");
		int year = scan.nextInt();
		
		System.out.print("월: ");
		int month = scan.nextInt();
		
		System.out.print("일: ");
		int day = scan.nextInt();
		
		Calendar input = Calendar.getInstance();
		input.set(year, month - 1, day);
		
		//입력받은 날짜가 평일인지 확인
		int dayOfWeek = input.get(Calendar.DAY_OF_WEEK);
		
		//입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		//입력받은 날짜가 토/일요일이면 아무것도 안한다.
		//
		if (dayOfWeek % 7 > 1) {
			/*
			 * 입력하신 날짜는 '평일'입니다.
				해당 주의 토요일로 이동합니다.
				이동한 날짜는 '2022-03-19' 입니다.
			 */
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			input.set(Calendar.DAY_OF_WEEK, 7);
			System.out.printf("이동한 날짜는 '%tF'입니다.\n", input);
			
		} else {
			/*
			 * 입력하신 날짜는 '휴일(토/일)'입니다.
				결과가 없습니다.
			 */
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		}
		
	}

}
