package com.test.question.q92;

public class Main {

	public static void main(String[] args) {

		//객체 테스트용 코드
		Book b1 = new Book();

		//메소드 만들기
		b1.setTitle("자바의 정석"); 
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());
	}

}


/*
getter/setter 정의 문제
제목 : setter 최대 50자이내,(한글, 영어, 숫자, 공백 ) -> 유효성 검사
가격 : 유효성 검사
저자 : 유효성 검사 x
페이지수 : 유효성 검사
출판사 : 쓰기 전용
발행년도 : 읽기 전용 (모든책은 2019년도에 발향이라고 가정)
String info(): 모든 상태를 보여주는 메소드

클래스 문제는 패키지에 만들기
*/