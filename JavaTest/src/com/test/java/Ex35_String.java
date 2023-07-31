package com.test.java;

public class Ex35_String {

	public static void main(String[] args) {

		/*
			문자열
			- 물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다.
			--박쥐같음
			
			1. 메모리의 공간은 한번 할당 되면 더 이상 늘리거나 줄일 수 없다.
			2. "문자열은 불변(Immutable)이다." > 한번 만들어진 문자열은 절대 수정할 수 없다.
			3. 문자열은 참조형이다.
		
			//면접 - 문자열은 불변이다라는게 무슨 뜻인가요?
		*/
//		m1();
//		m2();
		m3();
		
	}

	private static void m3() {

		//String vs StringBuilder
		//- 문자열 클래스
		
		String s1 = "홍길동"; //문자열 리터럴 사용 > 특혜
		String s2 = new String("홍길동");
		
		//StringBuilder s3 = "홍길동"; 안됨
		StringBuilder s3 = new StringBuilder("홍길동");
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println();
		
		//StringBuilder > 수정 작업에 강하다.
		
		long begin = System.nanoTime();
		
		//작업 > String
		
		String txt1 = "홍길동";
		
		for (int i = 0; i < 100000; i++) {
			txt1 = txt1 + "."; //수정 작업
		}
		
		long end = System.nanoTime();
		
		System.out.println(txt1.length());
		System.out.println(end - begin + "ns");
		
		
		begin = System.nanoTime();
		
		//작업 > StringBuilder
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i = 0; i < 100000; i++) {
			txt2.append("."); //수정 작업
		}
		
		end = System.nanoTime();
		
		System.out.println(txt2.length());
		System.out.println(end - begin + "ns");
		
	
		//2,474,708,900ns > 2.4s
		//	  1,023,900ns > 0.001s

		
		
	}

	private static void m2() {

		//문자열은 불변이다. > 되도록 하지 말아야 하는 행동!!
		//1. 문자열의 잦은 수정
		//2. 커다란 문자열의 수정
		
		String txt1 = "홍길동";
		
		for (int i =0; i<100; i++) {
			
			txt1 = txt1 + "님"; //수정
			//새로 만들고 버리는 작업을 100번함.. 비용 낭비가 심하다!!
		}
		
		System.out.println(txt1);

		//대박 큰 문자열
		txt1 = 
"홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		
		txt1 = txt1 + "!";
		//대박큰문자열을 또만들면 메모리 낭비큼
		
		
		//물론 상황에 따라 다르다.... 
	}

	private static void m1() {

		//모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		
		int n1 = 10;		//4byte
		int n2 = 2000000000;//4byte
		
		//하나의 메소드 안에서 선언된 상수는 같이 사용된다.
		String s1 = "홍길동";
		String s2 = "안녕하세요. 홍길동입니다.";
		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		System.out.println(s1 == s3); //true > 절대 사용 금지!
		System.out.println(s1 == s4); //false
		System.out.println();
		
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //ture
		
		//문자열 상수 재사용 이유 ! 
		//데이터의 크기가 클 때 똑같은걸 또 만들면 메모리 낭비가 큼
		
		s1 = s1 + "님"; //홍길동 > 홍길동님
		System.out.println(s1);
		System.out.println(s3);
		
		
		
		
	}

}
