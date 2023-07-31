package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

	public static void main(String[] args) {
		/*
		 * 요구사항
			남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
			
			입력..
			남자 이름: 하하하 
			
			여자 이름: 호호호 
			
			만난날(년): 2023 
			
			만난날(월): 7 
			
			만난날(일): 21 
			
			출력..
			'하하하'과(와) '호호호'의 기념일
			100일: 2023-10-29
			200일: 2024-02-06
			300일: 2024-05-16
			500일: 2024-12-02
			1000일: 2026-04-16
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("남자 이름: ");
		String nameMan = scan.nextLine();
		
		System.out.print("여자 이름: ");
		String nameWoman = scan.nextLine();
		
		System.out.print("만난날(년): ");
		int startYear = scan.nextInt();
		System.out.print("만난날(월): ");
		int startMonth = scan.nextInt();
		System.out.print("만난날(일): ");
		int startDay  = scan.nextInt();

		//캘린더 생성, 입력받은 값으로 초기화
		Calendar startDating = Calendar.getInstance();
		startDating.set(startYear, startMonth - 1, startDay);
		
		System.out.printf("'%s'과(와) '%s'의 기념일", nameMan, nameWoman);

		//첫날에서 100일 뒤
		startDating.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", startDating);
				
		//100일 기념일에서 100일 뒤
		startDating.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n", startDating);
		
		//200일 기념일에서 100일 뒤
		startDating.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n", startDating);
		
		//300일 기념일에서 200일 뒤
		startDating.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n", startDating);
		
		//500일 기념일에서 500일 뒤
		startDating.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n", startDating);
		
	}

}
