package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		//학생수 > 배열의 길이
		//이름 > 문자열 배열
		//입력순이 아닌 가나다 순으로 출력 (정렬)
		
		Scanner scan = new Scanner(System.in);
		
		//학생 수 입력
		System.out.print("학생 수: ");
		int count = scan.nextInt();
		scan.nextLine();
		
		//학생 이름 입력
		String[] students = getStudents(scan, count);
		
		//스캐너가 안닫혔습니다 오류 .. 
		scan.close();
		
		//문자열 배열 정렬
		Arrays.sort(students);
		
		//결과 출력
		printResult(count, students);
		
	}

	private static String[] getStudents(Scanner scan, int count) {
		String[] students = new String[count];
		
		for (int i = 0; i < count; i++) {
			System.out.print("학생명: ");
			students[i] = scan.nextLine();
		}
		return students;
	}

	private static void printResult(int count, String[] students) {
		System.out.printf("입력한 학생은 총 %d명입니다.\n", count);
		
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d. %s\n", i + 1, students[i]);
		}
	}
}



//compareTo() 
