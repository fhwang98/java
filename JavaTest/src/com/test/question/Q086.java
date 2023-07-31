package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		//%d 사용x
		//문자열을 3자리마다 substring() 잘라내서 사이사이 , 넣기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		String input = scan.nextLine();
		
		//거꾸로 뒤집기
		String rev = reverse(input);
		
		//3자리마다 , 집어넣기
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			result += rev.substring(i, i + 1);
			if (i % 3 == 2 && i < input.length() - 1) {
				result += ",";
			}
		}
		//다시 뒤집어서 출력
		System.out.println(reverse(result));
		
	}

	private static String reverse(String input) {
		String rev = "";
		
		for (int i = input.length() - 1; i >= 0; i--) {
			rev += input.substring(i, i + 1);
		}
		return rev;
	}
}
