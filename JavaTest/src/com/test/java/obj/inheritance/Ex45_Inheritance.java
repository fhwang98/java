package com.test.java.obj.inheritance;

public class Ex45_Inheritance {

	public static void main(String[] args) {

		/*
			상속, Inheritance
			- 부모가 가지는 재산을 자식에게 물려주는 행동
			- 부모 클래스가 가지는 재산(변수, 메소드)을 자식 클래스에게 물려주는 행동
			- 자식 클래스가 코드를 구현하지 않아도 부모 클래스로부터 구현된 코드를 물려받는 행동
			
			왜 ??
			- 비용 절감
			- 코드 재사용 (*****************************)
			
			상속 관계에 있는 클래스 호칭
			- 부모 클래스 <- 자식 클래스
			- 슈퍼 클래스 <- 서브 클래스
			- 기본 클래스 <- 확장 클래스
			- 기본 클래스 <- 파생 클래스
			
			
		*/
		
		Parent p = new Parent();
		
		p.a = 10;
		p.b = 20;
		
		Child c = new Child();
		
		c.a = 10; //부모 클래스가 물려준 멤버
		c.b = 20;
		
		c.c = 30;
		c.d = 40;
		c.ccc();
		
	}//main

}//class

//부모 클래스
class Parent {
	
	public int a;
	public int b;
	
	public void aaa() {
		System.out.println("aaa");
	}
}

//자식 클래스
class Child extends Parent {
	/*
		부모 클래스에 있는 것들 100% 다 상속
		복붙된거나 마찬가지
		 
		public int a;
		public int b;
		
		public void aaa() {
		System.out.println("aaa");
		}
	*/
	
	//자기만의 멤버두 가짐
	public int c;
	public int d;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}

//회원
//1. 일반 회원
// - 이름
// - 아이디
// - 암호
// - 이메일

//2. 관리자 회원
// - 이름
// - 아이디
// - 암호
// - 등급

//부모 클래스
class Member { // 객체를 만드려는 의도로 만든건 아님 .. -> 오ㅑ 만들엇는지 ? 헷갈릴수잇따
	public String name;
	public String id;
	public String pw;
}

//일반 회원
class User extends Member {
	public String email;
}

//관리자 회원
class Administrator extends Member {
	public int lv;
}
//자식은 부모를 하나밖에 가질 수 없지만 부모는 여러 자식 클래스를 가질 수 있음


class AAA {
	public int a = 10;
}
class BBB extends AAA {
	public int b = 20;
}
class CCC extends BBB {
	public int c = 30;
}
class DDD extends CCC {
	public int d = 40;
}




