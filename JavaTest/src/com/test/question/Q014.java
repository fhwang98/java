package com.test.question;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		
		/*
			입력]	역의 개수: 
					환승역의 횟수: 
					시간대(1.평상시, 2.출근시, 3.퇴근시): 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("역의 개수: ");
		int station = scan.nextInt();
		
		System.out.print("환승역의 횟수: ");
		int change = scan.nextInt();
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		int time = scan.nextInt();
		
		int result = getTime(station, change, time);
		
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);
		
	}
	public static int getTime(int station, int change, int time) {
		// 총 소요 시간
		// 역의 개수 * 2분 + 환승횟수 * (3 or 4 or 5)
		int result = time == 1 ?  station * 2 + change * 3 
							: time == 2 ? station * 2 + change * 4 
							: time == 3 ? station * 2 + change * 5
							: 0 ;
		return result;
	}
}
