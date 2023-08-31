package com.test.summary;

public class S0004_Method {

	public static void main(String[] args) {
		
		//인자값X, 반환값X
		m1();
		
		//인자값O, 반환값X
		m2(10);
		
		//인자값X, 반환값O
		int result = m3();
		
		//인자값O, 반환값O
		result = m4(10);
		
		
	}
	
	public static void m1() {
		
	}
	
	public static void m2(int n) {
		
	}
	
	public static int m3() {
		return 100;
	}
	
	public static int  m4(int n) {
		return n;
	}
}
