package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {

	public static void main(String[] args) {

		
		/*
			접근 지정자(제어자), Access Modifier
			- 클래스 멤버에 붙여서 사용한다. > 멤버 변수, 멤버 메소드 > 오늘 수업내용
			- 클래스 자체에 붙여서 사용한다.
			- 지역 변수에는 사용이 불가능하다.
			- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지를 통제하는 역할
			  > 보안 수준 제어
			
			1. public
			2. private
			------------
			3. protected > 상속
			4. default > 패키지
		
			
			public
			-
			//TODO 왜,... 비어있지..?
			
			private
			-
			
		*/
		
		Box box = new Box();
		
		//public int size
		box.color = "갈색"; //box. -> color가 보임
		
		//private int size //box. -> size 안보임 안에 size 있는지업는지도 몰루
		//box.size = 100;
		
		box.aaa(); //public 
		//box.bbb(); //private
		System.out.println();
		System.out.println();
		
		
		//book 객체
		Book book = new Book();
		
		//public 변수
//		book.title = "자바의 정석";
//		book.author = "홍길동";
//		book.publisher = "도우출판";
//		book.price = 30000; // 잘못 입력 > 에러가 나지는 않음 .. 
//		book.page = 1000;
		
//		int tmp = 30000; // 책 가격
//		
//		if (tmp >= 0 && tmp <= 100000) {
//			book.price = tmp;
//		} else {
//			
//		}
		
//		System.out.println(book.price);
		
		//private 변수
//		book.aaa("자바의 정석"); //book.title = "자바의 정석"; (X)
//		book.bbb(30000); //쓰기 > Setter
//		
//		System.out.println("책 가격: " + book.ccc()); //읽기 > Getter
		
		book.setTitle("자바의 정석");
		
		System.out.println(book.getTitle());
		System.out.println();
		System.out.println();
		
		
		//Mouse 객체
		Mouse m1 = new Mouse();
		
		m1.setModel("M910");
		System.out.println(m1.getModel());

		//쓰기 전용
		m1.setPrice(50000);
		//System.out.println(m1.getPrice);//getPrice없음
		
		//읽기 전용
		System.out.println(m1.getColor());
		
		//Getter/Setter 역할
		//1. private 멤버 > 인터페이스 역할
		//2. 읽기 전용 멤버, 쓰기 전용 멤버
		// 등등 여러 목적 ..
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//		
//		m1.setDate(date);
//		
//		System.out.printf("마우스 제조년월일: %tF\n", m1.getDate());
		
		//(객체) 사용자 편의성 향상
		m1.setDate(2020, 7, 31);
		System.out.println(m1.getDate());
		
		
		//m1.getState > private String state; 있을거라고 상상함.. 근데 없을수도잇음 (계산된 프로퍼티)
		System.out.println(m1.getState());
		
		
		//m1의 현재 모든 상태 확인?
		//System.out.println(m1.getModel());
		//System.out.println(m1.getPrice()); > 안됨 없음
		//System.out.println(m1.getColor());
		//System.out.println(m1.getDate());
		
		//개발자가 객체의 상태를 확인하고 싶을 때 사용하는 메소드 > dump
		System.out.println(m1.info());
		
	}//main

	
		

}//class
