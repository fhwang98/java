package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q122 {

	public static void main(String[] args) {
		//CSV, comma separated value
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
			}
			
			
			reader.close();
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
	}
}
