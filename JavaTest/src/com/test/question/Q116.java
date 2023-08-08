package com.test.question;

import java.io.File;

public class Q116 {

	public static void main(String[] args) {
		
		File dirA = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\동일 파일\\MusicA");
		
		File[] list = dirA.listFiles();
		
		for (File fileA : list) {
			File fileB = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\동일 파일\\MusicB\\" + fileA.getName());
			if (fileB.exists()) { 
				System.out.println(fileB.getName());
			}
		}
		
	}
}
