package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {

	public static void main(String[] args) {
		
		//폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\크기 정렬");
		
		ArrayList<File> list = new ArrayList<File>();
		
		getArrayList(dir, list);
		sortArrayList(list);
		
		
		System.out.println(list);
	}

	private static void sortArrayList(ArrayList<File> list) {
		//정렬
		for (int i = 0 ; i< list.size(); i++) {
		
			
		}
		
		
	}

	private static void getArrayList(File dir, ArrayList<File> list) {
		
		File[] fileList = dir.listFiles();
		for (File f : fileList) {
			if (f.isFile()) {
				list.add(f);
			}
		}
		for (File d : fileList) {
			if (d.isDirectory()) {
				getArrayList(d, list);
			}
		}
	}
	
}
