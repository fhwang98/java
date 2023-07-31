package com.test.question;

import java.util.Scanner;

public class Q083 {

	public static void main(String[] args) {
		//루프를 돌며 입력 받기 (확장자까지 같이 입력)
		//각 확장자별로 파일이 총 몇개 있는지 확인 -> 누적변수 필요
		//확장자 제한
		
		Scanner scan = new Scanner(System.in);
		
		String[] filename = new String[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("파일명: ");
			filename[i] = scan.nextLine();
		}
		
		int index = -1;
		
		int[] count = new int[5];
		
		
		for (int i = 0; i < 10; i++) {
			if (filename[i].endsWith(".mp3")) {
				count[0]++;
			} else if (filename[i].endsWith(".jpg")) {
				count[1]++;
			} else if (filename[i].endsWith(".java")) {
				count[2]++;
			} else if (filename[i].endsWith(".hwp")) {
				count[3]++;
			} else if (filename[i].endsWith(".doc")) {
				count[4]++;
			}
		}
		
		System.out.printf("mp3 : %d개\n", count[0]);
		System.out.printf("jpg : %d개\n", count[1]);
		System.out.printf("java : %d개\n", count[2]);
		System.out.printf("hwp : %d개\n", count[3]);
		System.out.printf("doc : %d개\n", count[4]);
		
	}
}
