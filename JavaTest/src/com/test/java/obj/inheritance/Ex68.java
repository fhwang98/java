package com.test.java.obj.inheritance;

public class Ex68 {

	public static void main(String[] args) {

		//this vs super
		//- 객체 지정 연산자
		//- this: 자기 자신
		//- super: 부모
		
		CupParent p1 = new CupParent();
		p1.check();
		System.out.println();
		
		CupChild c1 = new CupChild();
		c1.check();
		System.out.println();
		
		
	}//main

}

class CupParent {
	
	private int a = 10;
	public int b = 20;
	
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
}

class CupChild extends CupParent {
	
	private int c = 30;
	public int d = 40;
	
	public void check() {
		//내 멤버
		System.out.println(this.c);
		System.out.println(this.d);
		
		//부모 멤버
		//System.out.println(this.a); 상속이 됐는데 왜 안보이죠?
		//System.out.println(this.b);
		super.check();
	}

//	public CupChild(int c, int d) {
//		super(); //부모의 생성자 > 직접 호출하지 않아도 자동으로 호출 삭제해도됨
//		this.c = c;
//		this.d = d;
//	}
//	
	
}


