package com.test.question;

import java.util.Scanner;

public class Q042 {

	public static void main(String[] args) {
		
		/*
			Calendar 클래스 사용 금지
			1 > 365
			for (int i = 1; i <= 2022; i++) {
				sum += 365;
				
				if ( i == ?윤년) {
					sum++; // 366
				}
			}
			
			요구사항] 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
			출력] 2023년 7월 24일은 738,725일째 되는 날이고 월요일입니다.

		 */
		
		int year = 2023;
		int month = 7;
		int day = 25;
		
		
		int sum = totalDay(year, month, day);
		
		String dayOfWeek = getDay(sum);
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.\n", year, month, day, sum, dayOfWeek);
		
	}

	private static String getDay(int sum) {

		String dayOfWeek = "";
		
		if (sum % 7 == 1)
			dayOfWeek = "월요일";
		else if (sum % 7 == 2)
			dayOfWeek = "화요일";
		else if (sum % 7 == 3)
			dayOfWeek = "수요일";
		else if (sum % 7 == 4)
			dayOfWeek = "목요일";
		else if (sum % 7 == 5)
			dayOfWeek = "금요일";
		else if (sum % 7 == 6)
			dayOfWeek = "토요일";
		else if (sum % 7 == 0)
			dayOfWeek = "일요일";
		return dayOfWeek;
	}

	private static int totalDay(int year, int month, int day) {
		
		//TODO 1년1월1일~오늘 코드개선

		//1년 1월 1일 ~ 2022년 12월 31일까지 일수
		int sum = 0;
		
//		for (int i = 1; i <= year - 1; i++) {
//			sum += (i % 400 == 0 
//					||(i % 4 == 0 
//					&& i % 100 != 0)) ? 366 : 365;
//		}
		
		for (int i = 1; i <= year - 1; i++) {
//			sum += isLeapYear(i) ? 366 : 365;
		}

		
		int leapYear  = (year % 400 == 0 
									||(year % 4 == 0 
									&& year % 100 != 0)) ? 1 : 0;
		
		//2023년 1월 1일부터 2023년 6월 30일까지 일수
		for (int j = 1; j < month; j++) {
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				sum += 31;
			if (j == 2 && leapYear == 1)
				sum += 29;
			if (j == 2 && leapYear == 0)
				sum += 28;
			if (j == 4 || j == 6 || j == 9 || j == 11)
				sum += 30;
		}
		
		//24일 더하기
		sum += day;
		
		return sum;
	}

//	private static boolean isLeapYear(int i) {
//		(i % 400 == 0 ||(i % 4 == 0 && i % 100 != 0)) ? return true : return false;
//		if (i % )
//	}
}
