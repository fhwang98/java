package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {

	public static void main(String[] args) {
		//주문 > 종류, 개수, 구매한 사람 회원번호
		//회원번호 중복, 누락 안됨!
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름: ");
			String name = scan.nextLine();
			scan.close();
			
			BufferedReader readerMember = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_회원.dat"));
			String line = null;
			
			while ((line = readerMember.readLine()) != null) {
				
				//홍길동을 찾는다.
				if (line.split(",")[1].equals(name)) {
					break;
				}
			}
			//홍길동의 정보 저장
			String info = line;
			readerMember.close();
			
			
			//주문 reader를 연다
			BufferedReader readerOrder = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\검색_주문.dat"));
			line = null;
			while ((line = readerOrder.readLine()) != null) {
				//홍길동의 회원번호를 갖고있는 주문을 찾는다
				if (line.split(",")[3].equals(info.split(",")[0])) {
					System.out.println("==== 구매내역 ====");
					System.out.printf("%5s %5s %5s %5s %-20s\n", "[번호]", "[이름]", "[상품명]", "[개수]", "[배송지]"); 
					System.out.printf("%5s %5s %5s %5s  %-20s\n"
											, info.split(",")[0]
											, info.split(",")[1]
											, line.split(",")[1]
											, line.split(",")[2]
											, info.split(",")[2]);
				}
			}
			
			readerOrder.close();
			
			
			
		} catch (Exception e) {
			System.out.println("at Q124.main");
			e.printStackTrace();
		}
		
	}
}
