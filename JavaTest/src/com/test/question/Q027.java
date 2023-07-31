package com.test.question;

import java.util.Scanner;

public class Q027 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자: ");
		String input = scan.nextLine();
		
//		if (input.equals("f") || input.equals("F")) {
//			System.out.println("Father");
//		} else if (input.equals("m") || input.equals("M")) {
//			System.out.println("Mother");
//			
//		} else if (input.equals("s") || input.equals("S")) {
//			System.out.println("Sister");
//			
//		} else if (input.equals("b") || input.equals("B")) {
//			System.out.println("Brother");
//			
//		} else {
//			System.out.println("입력한 문자가 올바르지 않습니다.");
//		}
		
		//코드리뷰 수정
		family(input);
		
	}

	private static void family(String input) {

		String result = "";
		if (input.equals("f") || input.equals("F")) {
			result = "Father";
		} else if (input.equals("m") || input.equals("M")) {
			result = "Mother";
			
		} else if (input.equals("s") || input.equals("S")) {
			result = "Sister";
			
		} else if (input.equals("b") || input.equals("B")) {
			result = "Brother";
			
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
//			return;
//			result = "입력한 문자가 올바르지 않습니다.";
		}
		
		System.out.println(result);
		
	}

}

//코드리뷰

//main() 메소드에다 코드 작성
//-> 유효성 check, 출력하는 메소드를 따로 빼서 작성

//if절마다 출력하는 문자 작성
//-> 결과(Father, Mother ..)를 변수로 빼서 마지막에 출력문을 한번만 작성
//그렇게 하면 else가 끝나고 출력이 두번 되지 않나 궁금했는데
//맨처음에 result를 빈문자열로 초기화해서
//else절로 빠지는 경우에는 자동으로 마지막 출력이 빈문자열이라 괜찮음

//대소문자 확인해주는 Method 사용 toUpperCase()/toLowerCase()

