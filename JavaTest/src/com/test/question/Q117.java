package com.test.question;

import java.io.File;

public class Q117 {

	public static int fcount = 0;
	public static int dcount = 0;
	
	public static void main(String[] args) {
		
		//내용있는 폴더 삭제하기
		
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
		
		System.out.println(fcount);
		System.out.println(dcount);
	}

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			if (f.isFile()) {
				//action
				f.delete();
				fcount++;
			}
		}
		
		for (File d : list) {
			if (d.isDirectory()) {
				//action
				delete(d);
				
			}
		}
		
		dir.delete();
		dcount++;
	}

}
