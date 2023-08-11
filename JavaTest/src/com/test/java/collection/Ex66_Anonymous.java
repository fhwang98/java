package com.test.java.collection;

public class Ex66_Anonymous {

	public static void main(String[] args) {
		
		/*
			익명 객체, Anonymous Object
			- 익명 클래스, Anonymous Class
			- 이름없는 클래스
			
		*/
		
		//요구사항] 인터페이스를 구현한 클래스 선언 > 객체 생성
		
		//본인 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		//2. 부모 타입(인터페이스)으로 참조변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		//3. Cannot instantiate the type AAA
		//AAA b3 = new AAA(); //인터페이스는 구현부가 없어서 인스턴스 생성 불가능
		//b3.aaa();
		
		//The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		AAA b3 = new AAA() { //인터페이스를 상속받은 클래스가 추상메소드를 구현하지 않았을 때 뜨는 오류메시지와 유사함
			
			//이름없는 클래스
			//자동으로 앞에있는 클래스의 자식 클래스가 됨
			
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
			
		};
		// {} : 익명 클래스
		// new AAA() : 익명 클래스의 부모 클래스
		// new AAA() {} : 익명 클래스 객체 생성
		// 익명 클래스 > 본인 클래스의 변수 만들수 없다(이름이 없음)
		// 부모타입인 인터페이스 변수로 만들 수 있다
		
		b3.aaa();
		System.out.println();
		
		//b2 vs b3
		//b2
		//- AAA 인터페이스 선언
		//- BBB 클래스 구현
		
		//b3
		//- AAA 인터페이스 선언
		//- 실명 클래스 구현(X) > 익명 클래스 구현(O)
		
		//익명 클래스 구현 > 클래스 재사용성 때문
		//익명 클래스 > 재사용 의사 없음
		//실명 클래스 > 재사용 의사 있음
		
		//클래스 사용 목적 > 객체 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//익명 클래스 > 붕어빵틀 > 붕어빵을 딱 1개만 만들기 위한 틀
		AAA t4 = new AAA() {

			@Override
			public void aaa() {
				
			}
			
		};
		
		/*
		 * 재사용 불가능!!
		 * 새로 정의된 익명 클래스와 위에서 정의된 익명 클래스는
		 * 서로 다른 클래스임
		 * AAA t5 = new AAA() {
		 * 
		 * @Override public void aaa() {
		 * 
		 * }
		 * 
		 * };
		 */
		
		
		
	}//main
	
}//class

class Test {
	public int a;
	public int b;
	public void ccc() {
		
	}
}


//The type BBB must implement the inherited abstract method AAA.aaa()
class BBB implements AAA {

	@Override
	public void aaa() {
		System.out.println("aaa");
	}
	
}

interface AAA {
	void aaa();
}