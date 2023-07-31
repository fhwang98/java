package com.test.java;

public class Ex19_Method {

	/*
		main 메소드
		- 특수 메소드
		- 이름이 예약어 > main
		- 프로그램이 시작되면 자바가 자동으로 호출하는 메소드
		- 프로그램의 시작점(Entry Point)
		- 프로그램의 종착점(End Point)
	 */
	public static void main(String[] args) {
		/*
			메소드, Method
			- 함수(function), 프로시저(procedure), 서브루틴(sub routine)
			- 코드의 집합
			- 행동의 단위
			- 같은 목적을 가진 코드의 집합
			- 코드 재사용의 단위
			
			변수 사용 절차
			1. 변수 선언
			2. 변수 사용
			
			메소드 사용
			1. 메소드 선언
			2. 메소드 사용(호출) > 실행
		 */
		
		//요구사항] "안녕하세요." 출력 x 5회
		//수정사항] "반갑습니다." 수정
		
		//비용? 줄당 비용 10이라면 * 5 = 50 > 비효율!
		System.out.println("반갑습니다."); //작성
		System.out.println("반갑습니다."); 
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다."); // 안녕하세요 > 반갑습니다 일일이 수정
		System.out.println();
		
		
		//메소드 사용 목적
		//1. 코드의 분리 > 목적에 맞는 코드를 각각 따로 관리
		//2. 코드의 재사용
		
		//메소드 호출(실행)
		hello(); //메소드로 가서 안녕하세요 > 반갑습니다 한번만 수정
		hello(); //코드 재사용 가능 > 유지보수 용이
		hello();
		hello();
		hello();
		System.out.println();
		
		
		//요구사항] 숫자를 한글로 1~10까지 출력
		printNumber();
		
		
					
	}//main

	//메소드 선언
	//1. class 내부
	//2. 메소드 간의 순서 무관
	
	/*
		메소드 선언 구문
		public static void hello() {
			
		}
		
		- public static void hello() : 선언부(header) (메소드의 특징, 성질)
		- {} : 구현부(body) (내용물)
		
		- public : 접근 지정자(제한자) Access Modifier
		- static : 정적 키워드 
		- void : 반환 자료형
		- hello : 메소드명 > 개발자 명명
		- () : 인자 리스트
				
	 */
	
	//특정한 목적을 가지는 코드의 집합
	public static void hello() {
		
		//해당 메소드가 하려는 업무 구현
		System.out.println("안녕하세요.");
		
	}
	
	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		System.out.println();
	}
	
	
	
}
