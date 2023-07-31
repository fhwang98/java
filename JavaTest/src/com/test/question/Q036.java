package com.test.question;

import java.util.Scanner;

public class Q036 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시작 숫자: ");
		int start = scan.nextInt();
		System.out.print("종료 숫자: ");
		int last = scan.nextInt();
		System.out.print("증감치: ");
		int plusminus = scan.nextInt();
		
		for (int i = start; i <= last; i += plusminus) {
			System.out.println(i);
		}
	}
}
