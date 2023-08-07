package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 경로: ");
		String path = scan.nextLine();
		
		File file = new File(path);
		//파일명(확장자 포함)
		//확장자
		//파일 크기(length)출력
		String name = path.substring(path.lastIndexOf("\\") + 1);
		System.out.printf("파일명 : %s\n", name);
		System.out.printf("종류 : %s 파일\n", name.substring(name.lastIndexOf(".") + 1));
		//파일 크기 단위 변환
		String size = getSize(file.length());
		System.out.printf("파일 크기 : %s\n", size);
		
		
	}

	private static String getSize(long length) {
		
		String size = (length <= 1024) ? String.format("%,dB", length)
					: (length <= 1024 * 1024) ? String.format("%,.1fKB", length/1024.0)
					: (length <= 1024 * 1024 * 1024) ? String.format("%,.1fMB", length/1024/1024.0)
					: (length <= 1024 * 1024 * 1024 * 1024) ? String.format("%,.1fGB", length/1024/1024/1024.0)
					: (length <= 1024 * 1024 * 1024 * 1024 * 1024) ? String.format("%,.1fTB", length/1024/1024/1024/1024.0) : "";
		
		return size;
	}

}
