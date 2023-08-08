package com.test.question;

import java.io.File;

public class Q119 {

	public static void main(String[] args) {
		
		//파일을 폴더별로 분류/이동하시오.
		
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\직원");
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			//이름 분리
			String[] temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			//폴더 생성
			File nameDir = new File(dir.getAbsolutePath() + "\\" + name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year);
			yearDir.mkdir();
			
			//파일 이동
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + "\\" + f.getName());
			f.renameTo(dest);
		}
		
		
	}

}
