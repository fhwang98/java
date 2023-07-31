package com.test.question;

public class Q063 {
	
	public static void main(String[] args) {
		//Arrays.toString() 하는 일 구현해보는 문제
		
		//dump()라는 메소드 만들어 인트 배열을 인자로 넘겨줌
		//문자열로 만들어 리턴해줌
		
		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;

		//테스트
//		int[] list = { 46 , 4 , 89 , 4 , 354 , 35 , 7 , 99 };
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		
		String result = "[ ";
		
		for (int i = 0; i < list.length; i++) {
			result += list[i];
			if (i < list.length - 1) {
				result += ", ";
			}
		}
		
		return result + " ]";
	}
}
