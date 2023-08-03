package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {

	public static void main(String[] args) {

		//클래스
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		//5. 제네릭 클래스
		
		//요구사항] 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		//추가사항] String을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();
		
		//추가사항] boolean을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참": "거짓");
		System.out.println();
		
		//추가사항] double을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] byte을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] Calendar을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] Student을 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] 무한대 ... 
		
		//위의 문제점 > 해결 방안
		//1. Object 클래스 > 오래된 방식 ~ 현재 방식
		//2. 제네릭 클래스 > 최신 방식 ~ 현재 방식
		
		//Object 변수 == 만능 주머니(모든 자료형을 담을 수 있는 변수)
		
		Object o1 = new Object();
		Object o2 = new Hong(); //업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";
		//---------------------------
		
		//****** 절대 > 값형과 참조형 간에 형변환 불가능!!!
		//근데? 된다
		//박싱(Boxing) > 오토박싱
		Object o6 = 10; // = new Integer(10);
		Object o7 = true;
		
//		Integer num = new Integer(10);
//		System.out.println(num);
//		System.out.println(num + 100);
//		System.out.println();
		
		System.out.println(o6);
		// System.out.println(o6 * 2); 안됨 o6 > 참조형 > 안에 주소값
		
		//언박싱(Unboxing)
		System.out.println((Integer)o6 * 2);  
		System.out.println((int)o6 * 2); //다운캐스팅 Object > int
		System.out.println();
		
		// o3. > Scanner 메소드 안보임
		//((Scanner)o3).nextLine();
		//뭐가 들었는지 모름 뭔지 내가 찾아야됨..
		
		//((Scanner)o4).nextLine(); //잘못 꺼내면 작성할 떈 문제 없지만 런타임 에러
		
		
		
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2.toString());
		//System.out.println(n2.getData() * 2); // n2 > object변수 > 주소값이라 연산 안됨
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2.toString());
		//System.out.println(s2.getData().length());
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2.toString());
		//System.out.println(b2.getData() ? "참" : "거짓"); // cannot convert from Object to boolean
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		//제네릭 클래스
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("흠냐링");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		
		
	}//main

}//class


class WrapperInt {

	private int data; // 1. 클래스의 중심

	// 2. data 중심 > 행동
	public WrapperInt(int data) {
		this.data = data; // this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}

class WrapperString {

	private String data; // 1. 클래스의 중심

	// 2. data 중심 > 행동
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperBoolean {

	private boolean data; // 1. 클래스의 중심

	// 2. data 중심 > 행동
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}

}

class WrapperObject {
	
	private Object data; //*********** 모든 데이터를 넣을 수 있음
	
	//생성자
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WrpperObject [data=" + data + "]";
	}
	
}


class Wrapper<T> {
	
	private T data;
	
	//생성자
	public Wrapper(T data) { //생성자에는 <> 안씀
		this.setData(data);;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
}