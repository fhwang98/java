package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Q126 {

	public static void main(String[] args) {
		try {

			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\출결.dat"));
			
			String line = null;
			
			HashMap map = new HashMap();
			
			while ((line = reader.readLine()) != null) {
				//저장해야하는 정보 : 이름, 지각 누적 카운팅, 조퇴 누적 카운팅
				
				
			}
			
			
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