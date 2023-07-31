
// 주석,comment
// - 컴파일 작업 때 제외하는 영역

// 단일 라인 주석

/*
 * 다중 라인 주석
 * 1
 * 2
 * 3
 */

//단축키 사용
// - 단일 라인: ctrl + /
// - 다중 라인: ctrl + shift + / , 해제할때 ctrl + shift + \

// 패키지 선언
// 현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

//클래스, Class
// - 코드의 집합
// - public class Ex01 : 클래스 선언부(Header)
// - {} : 클래스의 몸통(Body), 구현부

//"Ex01이라는 클래스입니다."

public class Ex01 {

	// 메소드, Method
	// - 코드의 집합
	public static void main(String[] args) {
		
		// 명령어 > 문장 단위 구성
		
		// 문장입니다. -> 문장 종결자 : 마침표
		
		// 자바의 문장 종결자: ';'
		// System: 클래스
		// - '.' : 멤버 접근 연산자(Menber Access Operator) "부모.자식"
		// - out: 필드(field)
		// - println(): method 호출
		// - "안녕하세요.": 문자열 리터럴

		System.out.println("안녕하세요.");
		
		/*
		 * 특수문자(영문표현)
		 * - ~(틸드), !, @, #, $, %, ^(caret, xor), &, *, -, _, +, =
		 * - ;, :, ", ', ?, /, \
		 * - `(역따옴표, back quote, back tick)
		 * - |(pipe, vertical bar, or)
		 * - () : 소괄호 Parenthesis
		 * - {} : 중괄호 brace
		 * - [] : 대괄호 bracket
		 * - <> : 화살표 괄호
		 * 
		 * 폰트 > 프로그래밍 폰트 추천
		 * - 1, l, I, |, i
		 * - 0, o, O, D
		 * - ", ''
		 * 
		 * 이클립스 > 코드 자동완성 Ctrl + Space
		 * - 현재 상태에서 사용 가능한 문법만 보여준다.(**중요**)
		 * 
		 */
		
		//Ctrl + Alt + 방향키(위/아래) 똑같이 복붙
		//Alt + 방향키(위/아래) 현재 라인 이동
		System.out.println(); // tab을 누르면 녹색바 위치로 커서 이동!! 완전 개꿀팁 ㄷ
		
		//Shift + 방향키(상하좌우 home, end) 블럭잡기
		//Shift + Ctrl + 방향키 단어 단위로 블럭
		
		//Ctrl + D 해당 줄 삭제
		
		//Ctrl + Shift + L 단축키 안내
		
		//Ctrl + F6 > (Window > preference > keys 단축키 변경) > Ctrl + Tab 탭전환
		
	}
	
}
