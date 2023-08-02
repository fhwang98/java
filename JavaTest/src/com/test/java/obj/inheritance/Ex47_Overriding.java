package com.test.java.obj.inheritance;

public class Ex47_Overriding {

	public static void main(String[] args) {

		/*
			메소드 오버로딩, Method Overloading
			- 메소드 이름 동일 * N 개 생성 > 인자 리스트 변화
			
			둘이 전혀 다름
			
			메소드 오버라이딩, Method Overriding
			- 클래스 상속 시에 발생
			- 메소드 재정의 > 상속받은 메소드를 수정하는(덮어쓰는) 기술
			
		*/
		
		OverrideParent hong = new OverrideParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		OverrideChild jhong = new OverrideChild();
		
		jhong.name = "홍철수";
		jhong.hello();
		//jhong.hi(); //개발자가 메소드를 여러개 기억해야한다는 단점이 있음
	}

}

//상황] 동네 사람
class OverrideParent {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
}
class OverrideChild extends OverrideParent {
	
	//시간이 흘러.... > 홍철수 중2
	//아빠가 하는 인사 방식 불만 >> 자기 자신의 방식으로 인사를 하고 싶다!!
	//부모 클래스가 물려준 hello()를 사용하기 싫다!!
	//*** 클래스 상속은 부모가 물려준 멤버를 자식이 거부할 방법이 없다!!! 100% 상속
	
//	public void hi() {
//		System.out.printf("하이~ 난 %s야~\n", this.name);
//	}
	//상속관계에 있는 클래스들이 동일한 목적을 가지고 사용하는 메소드들의 이름이 달라지면 안됨
	
	
	//동일한 hello()를 2개 가지고 있다. > 에러 발생(X)
	// > 무조건 자식이 우선한다. > 자식의 hello()가 호출
	
	//메소드 재정의(오버라이드)
	@Override
	public void hello() {
		System.out.printf("하이~ 난 %s야~\n", this.name);
	}
	
	
}