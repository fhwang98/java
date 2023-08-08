package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {

	public static void main(String[] args) {

		//이름수정.dat > BufferedReader로 읽어서
		//유재석 > 메뚜기 변경
		//BufferedWriter > 이름수정_변환.dat 저장
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정_변환.dat"));
			
			
			String line = null;
			String result = "";
			
			while ((line = reader.readLine()) != null) {
				writer.write(line.replace("유재석", "메뚜기"));
				writer.newLine();
			}
			
			reader.close();
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
	}

}
