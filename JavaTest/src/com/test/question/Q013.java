package com.test.question;

import java.util.Scanner;

public class Q013 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.println(test(kor, eng, math) + "입니다.");
	}

	public static String test(int kor, int eng, int math) {
		int average = (kor + eng + math) / 3;
		//한과목 이상 40점 미만 불합 
		//평균 60점 미만 불합 
		String result = (kor < 40 || eng < 40 || math < 40) ? "불합격" 
								 : average < 60 ? "불합격" : "합격" ;
		return result;
	}
}
