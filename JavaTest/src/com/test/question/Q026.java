package com.test.question;

import java.util.Scanner;

public class Q026 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = scan.nextInt();
		
		if (score >= 90 && score <= 100) {
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, "A");
		} else if (score >= 80 && score < 90) { // 예쁘지가 않은데....
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, "B");
		} else if (score >= 70 && score < 80) {
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, "C");
		} else if (score >= 60 && score < 70) {
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, "D");
		} else if (score >= 0 && score < 60) {
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, "F");
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}

		
		
	}

}
