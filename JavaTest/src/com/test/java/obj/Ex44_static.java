package com.test.java.obj;

public class Ex44_static {

	//1. 클래스 로딩, Class Loading
	//- 프로그램을 실행하기 전에 클래스의 정의를 미리 읽는 작업
	//- 클래스의 정의를 메모리에 얹는 작업
	//- 클래스 로딩 과정에서 모든 static 키워드 인식 > 메모리 실체화
	
	//2. main() 실행
	public static void main(String[] args) {

		/*
			static 키워드
			- 클래스 or 클래스 멤버에 붙이는 키워드 (지역변수에는 붙일 수 없음)
		*/
		
		//상황] 학생 3명 > 300명
		//- "역삼 중학교" > 개명 > "대치 중학교"
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		s1.setSchool("역삼 중학교"); // The static method setSchool(String) from the type Student should be accessed in a static way
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(15);
		s2.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("이순신");
		s3.setAge(16);
		s3.setSchool("역삼 중학교");
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
	}
	
}


class Student {
	
	//객체 변수
	private String name;
	private int age;
	//private String school; //**
	
	//정적 변수, 클래스 변수, 공용 변수
	private static String school;
	//static private String school; 로 써두댐
	//main() 실행 전 클래스로딩시에 static 변수를 static 영역에 메모리 실체화
	//static ==유사 class -> 클래스 변수라고 부르기도
	//student 객체 생성시에 static 변수 빼고 생성됨
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//변수에 static이 없을떄
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school; //The static field Student.school should be accessed in a static way
//	}
	
	//변수에 static 있을때
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String info() {
		return String.format("%s(%d) %s", this.name, this.age, this.school);
	}
	
}