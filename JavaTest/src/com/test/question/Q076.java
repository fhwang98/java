package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q076 {

	public static void main(String[] args) {
		//문자열 2차원 배열
		//성적을 막대그래프로 출력
		//10점 단위 한칸
		//국어 점수 80점 > 문자열 배열에 8칸 입력
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String[][] score = new String[10][3];
		
		int[] scores = new int[3];
		
		System.out.print("국어 점수: ");
		scores[0] = scan.nextInt();
		
		System.out.print("영어 점수: ");
		scores[1] = scan.nextInt();
		
		System.out.print("수학 점수: ");
		scores[2] = scan.nextInt();
		
		for (int j = 0; j < 3; j++) {
			
			for (int i = 0; i < score.length; i++) {
				if (i < 10 - (scores[j] / 10)) {
					score[i][j] = "";
					
				} else {
					score[i][j] = "■";
				}
			}
		}
		


		
		//출력부
		for (int i = 0; i < 10; i++) {
			for (int j =0; j< 3; j++) {
				System.out.printf("%s\t", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println("국어	영어	수학");
	}
}
