package com.test.question;

import java.util.Calendar;

public class Q020 {

	public static void main(String[] args) {
		
		Calendar day100 = Calendar.getInstance();
		
		day100.add(Calendar.DATE, 100);
		
		Calendar year1 = Calendar.getInstance();

		year1.add(Calendar.YEAR, 1);
			
		
		
		System.out.printf("백일: %tF\n", day100);
		System.out.printf("첫돌: %tF\n", year1);
	}

}
