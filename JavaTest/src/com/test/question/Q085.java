package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		//TODO 주민번호 풀기
		
		// '-' 입력해도 안해도 맞는 거로
		
		/*
			주민등록번호 유효성 > 주민등록 생성하는 방법
			
			2  3  4  5  6  7  8  9  2  3  4  5  6
			x
			7  0  0  1  0  1  -  1  0  1  0  1  0  4
			연도		월	 일		성별	└--------┘	|  └ 오류검증
			   01~12   01~31?	1,2	  지역번호   출생신고순서
			   					1900년대
			   					3,4
			   					2000년대
			   					9,0
			   					1800년대
			   					5,6
			   					귀화
			   					7,8
			--------------------------------------------
			14		5	   7	 9		3	 5	= 40
			40 % 11 =7
			11 - 7 = 4 ->마지막수
			11 - 0 = 11 > 1
			11 - 1 = 10 > 0
			   
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();
		
		jumin = jumin.replace("-", "");
		
		if (validCheck(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
	}//main

	private static boolean validCheck(String jumin) {


		// 전부 숫자인지
		
		if (!isNum(jumin)) {
			return false;
		}
		if (jumin.length() != 13) {
			return false;
		}
		
		// 월 > 01 ~ 12
		if (!isMonth(jumin.substring(2, 4))) {
			return false;
		}
		// 일 > 01 ~ 31 > 월, 윤년에 따라 ..
		if (!isDate(jumin.substring(0, 2), jumin.substring(2, 4), jumin.substring(4, 6))) {
			return false;
		}
		
		//마지막자리 빼고는 검증이 끝났으니까 숫자들을 int배열에 넣어줌
		
		int[] nums = new int[jumin.length()];
		
		for (int i = 0; i < jumin.length(); i++) {
			nums[i] = jumin.charAt(i) - '0';
		}
		
		// 마지막 숫자 검증
		int sum = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			sum += nums[i] * (i % 8 + 2); 
		}
		while (sum >= 10) {
			sum %= 11;		
		}
		if (nums[jumin.length() - 1] == 11 - sum) {
			return true;
		} else {
			return false;
		}
	}


	//q42 참고
	private static boolean isDate(String yy, String mm, String dd) {
		
		int year = Integer.parseInt(yy);
		int month = Integer.parseInt(mm);
		int date = Integer.parseInt(dd);
		
		if (date == 0) {
			return false;
		}
		
		if ((month == 1 || month == 3 || month == 5 || month == 7 
			|| month == 8 || month == 10 || month == 12)) {
			
			if (date > 31) {
				return false;
			}
		} else if (month == 4 || month == 5 || month == 6 || month == 7) {
			if (date > 30) {
				return false;
			}
		} else {
			if (isLeapYear(year)) {
				if (date > 29) {
					return false;
				}
			} else {
				if (date > 28) {
					return false;
				}
				
			}
		}
		return true;
	}

	private static boolean isLeapYear(int year) {
		return (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)) ? true : false;
	}

	private static boolean isMonth(String month) {

		if (Integer.parseInt(month) < 0 || Integer.parseInt(month) > 12) {
			return false;
		}
		return true;
	}

	private static boolean isNum(String jumin) {

		for (int i = 0; i <jumin.length(); i++) {
			if (jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}//class
