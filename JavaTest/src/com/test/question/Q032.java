package com.test.question;

import java.util.Scanner;

public class Q032 {

	public static void main(String[] args) {
		//Calendar 사용 x
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[들어온 시간]");
		System.out.print("시: ");
		int hourIn = scan.nextInt();
		System.out.print("분: ");
		int minuteIn = scan.nextInt();
		
		System.out.println("[나간 시간]");
		System.out.print("시: ");
		int hourOut = scan.nextInt();
		System.out.print("분: ");
		int minuteOut = scan.nextInt();
		
		int minuteParking = (hourOut - hourIn)*60 + (minuteOut - minuteIn);
		int price;
		
		if (minuteParking > 30) {
			price = ((minuteParking - 30) / 10) * 2000;
		} else {
			price = 0;
		}
		
		System.out.printf("주차 요금은 %,d원입니다.\n", price);
		
	}

}
