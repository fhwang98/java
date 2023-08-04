package com.test.question;

import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		
		//연산식을 입력받아 진짜 연산을 함
		//띄어쓰기 무시
		//연산자가 올바르지 않거나 피연산자가 부족한 경우 경고
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String input = scan.nextLine();
		
		//체크해야할 것
		//공백 제거
		//숫자 말고 다른게 들어왔는지
		//숫자 연산자 숫자인지
		
		input = input.replace(" ", "");
		
		if (!validCheck(input)) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		String op = getOp(input);
		
		int[] nums = getNums(input, op);
		
		int result = 0;
		if (op.equals("+")) {
			result = nums[0] + nums[1];
		} else if (op.equals("-")) {
			result = nums[0] - nums[1];
		} else if (op.equals("*")) {
			result = nums[0] * nums[1];
		} else if (op.equals("/")) {
			result = nums[0] / nums[1];
		} else if (op.equals("%")) {
			result = nums[0] % nums[1];
		}
		System.out.printf("%d %s %d = %d", nums[0], op, nums[1], result);
		
	}



	private static int[] getNums(String input, String op) {
		int[] nums = new int[2];
		int num = 0;
		
		for (int i = 0; i < input.indexOf(op); i++) {
			num = num * 10 + Integer.parseInt(input.substring(i, i + 1));
		}
		nums[0] = num;
		num = 0;
		for (int i = input.indexOf(op) + 1 ; i < input.length(); i++) {
			num = num * 10 + Integer.parseInt(input.substring(i, i + 1));
		}
		nums[1] = num;
		
		
		return nums;
	}



	private static String getOp(String input) {

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '+') {
				return "+";
			} else if (input.charAt(i) == '-') {
				return "-";
			} else if (input.charAt(i) == '*') {
				return "*";
			} else if (input.charAt(i) == '/') {
				return "/";
			} else if (input.charAt(i) == '%') {
				return "%";
			}
		}
		return "";
	}

	private static boolean validCheck(String input) {

		int opCount = 0;
		int numCount = 0;
		boolean startNum = true;

		for (int i = 0; i < input.length(); i++) {
			if (!isNum(input.charAt(i)) && !isOp(input.charAt(i))) {
				return false;
			}
			if (isNum(input.charAt(i)) && startNum) {
				numCount++;
				startNum = false;
			}
			if (isOp(input.charAt(i))) {
				opCount++;
				startNum = true;
			}
		}
		if (opCount == 1 && numCount == 2) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isOp(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
			return true;
		}
		return false;
	}

	private static boolean isNum(char c) {
		if (c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}
}
