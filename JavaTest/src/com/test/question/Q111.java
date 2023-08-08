package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더: ");
		String path = scan.nextLine();
		System.out.print("확장자: ");
		String ext = scan.nextLine();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			String[] temp = f.getName().split("\\.");
			
			String fext = temp[temp.length - 1];
			
			if (fext.equals(ext)) {
				System.out.println(f.getName());
			}
		}
	}

}
