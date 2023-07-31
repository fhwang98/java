package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

	public static void main(String[] args) {
		//Calendar로 풀이
		/*
			요구사항
			여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 
			고객이 각각의 매장에 몇시에 전화를 해야 
			모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
			
			조건..
			전화를 걸면 짜장면은 10분 뒤에 도착합니다.
			전화를 걸면 치킨은 18분 뒤 도착합니다.
			전화를 걸면 피자는 25분 뒤 도착합니다.
			음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)

			입력..
			음식을 받기 원하는 시각
			시: 12 
			분: 7 
			
			출력..
			짜장면: 11시 57분
			치킨: 11시 49분
			피자: 11시 42분
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		int hour = scan.nextInt();
		System.out.print("분: ");
		int minute = scan.nextInt();
		
		Calendar getFood = Calendar.getInstance();
		
		//배달 받을 시간
		getFood.set(Calendar.HOUR_OF_DAY, hour);
		getFood.set(Calendar.MINUTE, minute);
		
		//System.out.printf("%tT\n", getFood);
		//짜장면 시킬 시간!
		getFood.add(Calendar.MINUTE, -10);
		//System.out.printf("%tT\n", getFood); -> 짜장면 시켜야 하는 시간
		//지금 갖고있는 시간출력
		System.out.printf("짜장면: %d시 %d분\n"
							, getFood.get(Calendar.HOUR)
							, getFood.get(Calendar.MINUTE));
		
		//배달받을 시간으로 초기화
		getFood.set(Calendar.HOUR_OF_DAY, hour);
		getFood.set(Calendar.MINUTE, minute);
		
		//치킨 시킬 시간!
		getFood.add(Calendar.MINUTE, -18);
		//System.out.printf("%tT\n", getFood); -> 짜장면 시켜야 하는 시간
		//지금 갖고있는 시간출력
		System.out.printf("치킨: %d시 %d분\n"
							, getFood.get(Calendar.HOUR)
							, getFood.get(Calendar.MINUTE));
		
		//배달받을 시간으로 초기화
		getFood.set(Calendar.HOUR_OF_DAY, hour);
		getFood.set(Calendar.MINUTE, minute);
		
		//피자 시킬 시간!
		getFood.add(Calendar.MINUTE, -25);
		//System.out.printf("%tT\n", getFood); -> 짜장면 시켜야 하는 시간
		//지금 갖고있는 시간출력
		System.out.printf("피자: %d시 %d분\n"
				, getFood.get(Calendar.HOUR)
				, getFood.get(Calendar.MINUTE));
		
		
		
	}

}
