package com.test.question;

import java.io.File;

public class Q113 {

	public static void main(String[] args) {
		
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\음악 파일");
		
		File[] list = dir.listFiles();
		int num = 1;
		
		for (File f : list) {
			
			String[] temp = f.getName().split("\\.");
			String ext = temp[temp.length - 1].toLowerCase();
			
			if (ext.equals("mp3")) {
				
				File numbering = new File(dir.getAbsolutePath() + "\\" + String.format("[%03d]", num++) + f.getName());
				f.renameTo(numbering);
			
			}
			
		}//for
		
	}//main
}