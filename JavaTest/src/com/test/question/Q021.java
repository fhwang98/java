package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("태어난 년도: ");
		int birthYear = scan.nextInt();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, birthYear);
		
		long birthdayTick = birthday.getTimeInMillis();
		
		System.out.printf("나이: %d세\n"
							, (System.currentTimeMillis() - birthdayTick)
							/ 1000 / 60 / 60 / 24 / 365 + 1);
		
		//Calendar.YEAR로 바로 구할 수 있음
	}

}
