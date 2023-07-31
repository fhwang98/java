package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("맑은 날: ");
		int sunny = scan.nextInt();
		
		System.out.print("흐린 날: ");
		int foggy = scan.nextInt();
		
		int result = getApple(sunny, foggy);
		
		System.out.printf("사과가 총 %d개 열렸습니다.\n", result);
	}
	
	public static int getApple(int sunny, int foggy) {
		//나무의 총 길이는 맑은날*5 + 흐린날*2
		//나무의 총 길이가 110 미만이면 열매는 0개
		//열매의 개수는 (길이 - 100)/ 10 
		int length = sunny * 5 + foggy * 2;
		int result = length >= 100 ? (length - 100)/ 10 : 0;
		return result;
	}
}