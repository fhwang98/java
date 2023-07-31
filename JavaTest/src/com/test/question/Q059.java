package com.test.question;

public class Q059 {
	public static void main(String[] args) {
		//수열
		//1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
		// +1  +2  +3  +4   +5   +6
		

		//1 초항
		//(1) 				+ 1 = 2
		//(1 + 1)		    + 2 = 4
		//(1 + 1 + 2) 		+ 3 = 7
		//(1 + 1 + 2 + 3) 	+ 4 = 8
	
		//필요한것
		//수열의 초항
		//계차수열의 초항과 등차
		
		// a1 : 1
		// a2 : 2	b1 : 1
		// a3 : 4	b2 : 2
		// a4 : 7	b3 : 3
		
		int totalSum = 0;
		String result = "";
		
		for (int i = 1; i < 100; ) { //마지막 수가 100보다 작음
			
			for (int j = 1; i < 100; j++) { // 
				
				//순서 중요 !!!!!!!
				result += i + " + "; // 현재 i를 먼저 찍어줌
				totalSum += i; 
				i += j; //i 에 계차수열 넣어줌
				
			}
			
		}
		
		System.out.println(result + "= " + totalSum);
	}
}
