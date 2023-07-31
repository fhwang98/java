package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}

	private static void position(String staff) {
		
		System.out.printf("사원: %s\n", staff);
		System.out.println();
	}

	private static void position(String staff, String assistantManager) {
		
		System.out.printf("사원: %s\n대리: %s\n", staff, assistantManager);
		System.out.println();
	}

	private static void position(String staff, String assistantManager, String manager) {
		
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n", staff, assistantManager, manager);
		System.out.println();
	}

	private static void position(String staff, String assistantManager, String manager, String generalManager) {
		
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s\n", staff, assistantManager, manager, generalManager);
		System.out.println();
	}
}
