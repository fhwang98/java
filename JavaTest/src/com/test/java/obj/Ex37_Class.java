package com.test.java.obj;

public class Ex37_Class {

	public static void main(String[] args) {

		User u1 = new User();
		
		u1.name = "홍길동";
		u1.age = 20;
		u1.hello();
		
		User u2 = new User();
		
		u2.name = "아무개";
		u2.age = 22;
		u2.hello();
		System.out.println();
		
		//행동 클래스 > 객체를 여러개 생산하지 않는다.
		MyMath m1 = new MyMath();
		m1.add(10, 20);
		m1.substract(100, 50);
		
		MyMath m2 = new MyMath();
		m2.add(10, 20); 		
		m2.substract(100, 50);	//둘다 m1이랑 똑같음
		
	}

}//class

//클래스(객체) = 데이터 + 행동
//클래스(객체) = 멤버 변수 + 메소드

class User {
	
	//클래스 멤버
	//1. 변수
	//2. 메소드
	//가장 보편적인 클래스 -> 변수 + 메소드 모두
	
	//클래스 멤버 변수 > 프로퍼티, 특성
	public String name;
	public int age;
	
	//클래스 멤버 메소드 > 호출되는 객체에 따라 다른 결과 발생!!!
	//- *******클래스의 멤버 메소드는 되도록(필수) 멤버 변수를 활용해서 행동을 해야 한다.(중요!!!!!!!!!!!)
	
	public void hello() { //static 없음 .. 이유는 나중에 설명
		//System.out.println("안녕하세요.");
		//잘못 만든 메소드 u1.hello()나 u2.hello()나 행동의 차이가 없음 -> 낭비
		
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}
	
}

class MyMath {
	
	//멤버 변수(X)
	//멤버 메소드(O)
	//존재할 수 있는 형식이지만 매우드물다 ..
	
	//개성이 없는 메소드 > 객체간의 행동 구분 불가능
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void substract(int a, int b) {
		System.out.println(a - b);
	}
}