package com.test.java;

public class Ex10_Input {
	
	public static void main(String[] args) throws Exception {
		/*
			콘솔 출력 > 모니터
			1. System.out.print()
			2. System.out.println()
			3. System.out.printf()
			
			콘솔 입력 > 키보드
			1. System.in.read() //불편함
			2. BufferReader 클래스
			3. Scanner 클래스
		*/
		
		//요구사항] 사용자에게 문자 1개를 입력받아 > 화면에 출력하시오.
		
		//1. 안내 메시지 출력
		//2. 키 입력
		//3. 키를 화면에 출력
		
		//1.
		System.out.println("문자 입력: ");
		
		//2.
		// - 입력 대기 상태 > 블럭 걸렸다.
		// - 사용자의 키입력을 기다리고 있는 중..
		// - 콘솔 > 키 입력 완료 > 엔터 입력
		
		//read() 메소드 1회 > 문자 1개 입력
		int code = System.in.read(); //문자 코드
		
		//3.
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		code = System.in.read();
		System.out.println("출력: " + code);
		System.out.printf("출력: %c\n", code);
		
		//read()로 입력한 문자 -> 입력 버퍼로 이동 -> 프로그램 출력 -> 출력한 버퍼 사라짐
		//a 만 입력하고 엔터 누르면 뒤에
		//carriage rerutn, new line 함께 들어감
		//97, 13, 10
		//13 -> \r
		//10 -> \n
		//3개만 입력돼서 나머지 입력 기다림
		
		
		System.out.println("프로그램 종료");
	}
}
