package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {

	public static void main(String[] args) {

		//대중적인 오버라이드
		
		Time t1 = new Time(2, 30);
		
		//기존 결과 : com.test.java.obj.inheritance.Time @ 4d50efb8
		//재정의 후 결과 : 2:30
		System.out.println(t1); //t1.toString()이랑 같음
		
		//String java.lang.Object.toString()
		//재정의 후 String com.test.java.obj.inheritance.Time.toString()
		System.out.println(t1.toString());	//2:30 > 전세계 개발자가 다 아는 이름
		System.out.println(t1.info());		//2:30 > 나밖에 모르는 이름
		//앞으로는 info() 메소드를 만드는 대신 toString 오버라이드할것!
		
		
		
		Date now = new Date();
		
		//Wed Aug 02 11:49:03 KST 2023
		System.out.println(now);
		
		//String java.util.Date.toString() > Date 클래스가 toString을 재정의한 것
		System.out.println(now.toString());
		
	}

}

class Time {
	
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
		
	//덤프
	public String info() {
		return this.hour + ":" + this.minute;
	}
	
	@Override //어노테이션(Annotation) 프로그램 기능이 있는 주석? 코드 관리 차원에서 달아줌 잇어도되고없어도되고...
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	
}














