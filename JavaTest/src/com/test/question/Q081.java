package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		//아이디와 도메인을 분리해서 추출
		//@의 위치를 알아내서 substring()
		//or
		//@을 구분자로 split()
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일: ");
		String email = scan.nextLine();
		
		String[] divided = email.split("@");
		
		if (email.indexOf("@") != email.lastIndexOf("@")
				|| email.indexOf("@") == -1) {
			System.out.println("잘못된 이메일 주소입니다.");
			return;
		}
		if (divided[1].indexOf(".") == -1) {
			System.out.println("잘못된 이메일 주소입니다.");
			return;		
		}
		
		System.out.printf("아이디: %s\n", divided[0]);
		System.out.printf("도메인: %s\n", divided[1]);
		
	}
}
