package com.test.java.obj;

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
		
		
		
		//book 객체
		Book book = new Book();
		book.titile = "자바의 정석";
		book.author = "홍길동";
		book.publisher = "도우출판";
		book.price = 30000;
		book.page = 1000;
		
		
		
		
	}//main

		

}//class
