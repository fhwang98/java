package com.test.question;

import java.util.Scanner;

public class Q040 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		
		System.out.print("종료 숫자: ");
		int last = scan.nextInt();
		
		sum(start, last);
		
 	}

	private static void sum(int start, int last) {
		//필요한 변수 목록
		//숫자의 인덱스 i
		//반복할 숫자 count
		//누적 변수 sum
		//더해줄 숫자 num
		
		//짝수 위치는 빼고 홀수위치는 더하는 문제
		
		int count = last - start + 1;
		int num = start;
		int sum = 0;
		String result = "";
		
		for (int i = 0; i < count; i++) {
 
			
			//코드 복잡함 ㅜㅜ 더 간결한 방법이 있을텐데,,
			
			if (i < count - 1) {

				if (i % 2 == 0) {
					sum += num;
					result += num + " - ";
				} else {
					sum -= num;
					result += num + " + ";
				}
			
			} else {
				if (i % 2 == 0) {
					sum += num;
					result += num + " = " + sum;
				} else {
					sum -= num;
					result += num + " = " + sum;
				}
			}
			num++;
		}
		
		System.out.println(result);
		
		
	}
		
}
