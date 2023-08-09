package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q126 {

	public static void main(String[] args) {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(""));
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q126.main");
			e.printStackTrace();
		}
	}
}

//파일 맨 위에 8일 > 잘못들어감 삭제하고 하기!!
//확장자별 개수 세기와 비슷
//hashmap으로 풀이

//class로 풀이
/*
	ArrayList<Employees> list;
	
	class Employee {
	private String name;
	private String in;
	private String out;
	
	}
*/