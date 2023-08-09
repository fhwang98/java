package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {

	public static void main(String[] args) {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\단일검색.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String name = scan.nextLine();
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				if (line.split(",")[1].equals(name)) {
					
					System.out.printf("[%s]\n", line.split(",")[1].trim());
					System.out.printf("번호: %s\n", line.split(",")[0].trim());
					System.out.printf("주소: %s\n", line.split(",")[2].trim());
					System.out.printf("전화: %s\n", line.split(",")[3].trim());
					
					break;
				}
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q123.main");
			e.printStackTrace();
		}
	}
}
