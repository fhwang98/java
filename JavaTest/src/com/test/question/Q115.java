package com.test.question;

import java.io.File;

public class Q115 {
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\파일 제거");
		
		File[] list = dir.listFiles();
		
		int count = 0;
		
		for (File f : list) {
			if (f.length() == 0) {
				f.delete();
				count++;
			}
		}
		System.out.printf("총 %d개의 파일을 삭제했습니다.\n", count);
	}

}
