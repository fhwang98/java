package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

	public static void main(String[] args) {
		/*
			요구사항
			아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
			
			입력..
			아빠 생일(년): 1970 
			아빠 생일(월): 5
			아빠 생일(일): 10 
			딸 생일(년): 1998 
			딸 생일(월): 7 
			딸 생일(일): 22 
			
			출력..
			아빠는 딸보다 총 10,300일을 더 살았습니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아빠 생일(년): ");
		int fatherYear = scan.nextInt();
		System.out.print("아빠 생일(월): ");
		int fatherMonth = scan.nextInt();
		System.out.print("아빠 생일(일): ");
		int fatherDay = scan.nextInt();
		
		Calendar father = Calendar.getInstance();
		
		father.set(fatherYear, fatherMonth, fatherDay);
		long fatherTick = father.getTimeInMillis();
		
		System.out.print("딸 생일(년): ");
		int daughterYear = scan.nextInt();
		System.out.print("딸 생일(월): ");
		int daughterMonth = scan.nextInt();
		System.out.print("딸 생일(일): ");
		int daughterDay = scan.nextInt();
		
		Calendar daughter = Calendar.getInstance();
		
		daughter.set(daughterYear, daughterMonth, daughterDay);
		long dautherTick = daughter.getTimeInMillis();
		
		long gap = dautherTick - fatherTick ;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", gap / 1000 / 60 / 60 / 24);
		
		
	}

}
