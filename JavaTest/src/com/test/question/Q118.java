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
		
		System.out.printf("%-30s\t%8s\t%-5s\n", "[파일명]", "[크기]", "[파일이 들어있는 폴더]");
		for (File f : list) {
			
			String size = getSize((double)f.length());

			System.out.printf("%-30s\t%8s\t%-5s\n", f.getName(), size, f.getParentFile().getName());
		}
	}
	
	private static String getSize(double length) {
		String result = "";
		
		for (int i = 0; i < 5; i++) {
			if (length <= 1024) {
				if (i == 0) {
					result = String.format("%,.0fB", length);
				} else if (i == 1) {
					result = String.format("%,.1fKB", length);
				} else if (i == 2) {
					result = String.format("%,.1fMB", length);
				} else if (i == 3) {
					result = String.format("%,.1fGB", length);
				} else {
					result = String.format("%,.1fGB", length);
				}
				break;
			}
			length /= 1024 ;
		}
		return result;
	}
	

	private static void sortArrayList(ArrayList<File> list) {
		//정렬
		
		File temp;
		for (int i = 0 ; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).length() < list.get(j + 1).length()) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
			
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
