package com.test.java;

public class Ex07_Variable {

	public static void main(String[] args) {
		
		//숫자형 데이터 > 저장할 변수가 필요한 경우
		//- 수치로서의 데이터 > 산술 연산의 대상(o) > 더하기 빼기
		//- 수치가 아닌 데이터 > 산술 연산의 대상(x) > String
		
		//1. 몸무게
		int weight;
		weight = 70;
		
		//2. 주민등록번호 앞자리(990718) > x
		int jumin;
		jumin = 990718;
		System.out.println("주민등록번호: " + jumin);
		
		jumin = 000717;
		System.out.println("주민등록번호: " + jumin);
		
		String jumin2;
		jumin2 = "000717";
		System.out.println("주민등록번호: " + jumin2);
		
		//생긴건 숫자 > 실제로 숫자 취급x
		//- 주민등록번호
		//- 학번
		//- 전화번호
		
		//자바 기수 표기법
		//- 숫자 데이터 표기 > 3개의 기수법 지원
		//1. 10진수 > 10   > 10
		//2. 8진수  > 010  >  8
		//3. 16진수 > 0x10 > 16
		
		//기수표현에 상관 없이 출력 > 10진수로 출력
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
	}
}
