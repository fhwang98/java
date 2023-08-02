package com.test.java.obj.inheritance;

public class Ex53_interface {

	public static void main(String[] args) {

		MxKeys keyboard = new MxKeys();
		keyboard.powerOn();
		keyboard.keyDown('a');
		keyboard.powerOff();
		
	}

}

//**** Keyboad는 객체를 생성할 수 없다 > 실체화 할 수 없다.
interface Keyboard {
	
	//키보드로서 갖춰야 할 행동들 정의(선언부(O), 구현부(X)) > 호출 사용법
	//무조건 public -> public 생략 가능
	
	void keyDown(char c); //public void keyDown(char c);
	void powerOn();
	void powerOff();
	int checkBattery();
	//static void aaa(); //객체에 대한 것... > static 안됨!
}

class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		//구현? > 자기 맘대로~
		System.out.println(c + "눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public int checkBattery() {
		return 80;
	}
	
}