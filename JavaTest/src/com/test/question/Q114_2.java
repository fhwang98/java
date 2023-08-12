package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Q114_2 {

	public static void main(String[] args) {

		//이미지파일이 있다. 확장자별로 파일이 몇개 있는지 세시오
		
		//목록
		File dir = new File("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
		//키 > 확장자
		//값 > 카운트
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for (File f : list) {
			
			//System.out.println(f.getName());
			//확장자 추출
			String ext = getExtension(f.getName());
			
			if (!count.containsKey(ext)) {//지금 확장자가 맵에 존재하는지 ?
				count.put(ext, 1); //새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext) + 1); //count = count + 1 누적
			}
		}
		
		System.out.println(count);
	}

	private static String getExtension(String name) {
		
		//test.png > png
		//test.test.png
		
		//System.out.println(name);
		String[] temp = name.split("\\.");//. 정규표현식
		//System.out.println(temp.length);
		String ext = temp[temp.length - 1].toLowerCase();
		
		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		return ext;
		
		//return name.split("\\.")[temp.length - 1].toLowerCase();
	}

}
