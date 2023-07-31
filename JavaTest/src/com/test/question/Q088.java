package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		//금지어를 마스킹 처리 -> 글자수 맞추기
		//금지어를 발견한 횟수
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("입력: ");
//		String input = scan.nextLine();
		String input = "잘 생각해봐 바보 멍청이";
	
		int count = 0;
		
		count += getCount(input, "바보") + getCount(input, "멍청이");
		input = input.replace("바보", "**");
		input = input.replace("멍청이", "***");
		System.out.println(input);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n",count);
		
	}

	private static int getCount(String input, String forbidden) {
		
		int count = 0;
		int index = -1;
	
		while (true) {
			index = input.indexOf(forbidden, index);
			if (index == -1) {
				break;
			} else {
				count++;
			}
			index += forbidden.length();
		}
		
		return count;
	}
}
