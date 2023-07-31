package com.test.question;

public class Q060 {

	public static void main(String[] args) {
		//피보나치 수열
		//1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
		// +0  +1	+2	+3	+5
		
		//재귀 ... ?

		// int 피보나치(인덱스) 메소드 -> 반환값이 100보다 작을 때까지 반복
		
		int sum = 0;
		String result= "";
		
		int i = 0;
		
		while (fibonacci(i) < 100) {
			
			sum += fibonacci(i);
			result += fibonacci(i) + " + ";
			i++;
				
		}
		System.out.println(result + "= " + sum);
	}

	private static int fibonacci(int index) {
		if (index == 0)
			return 1;
		else if (index == 1)
			return 1;
		return fibonacci(index - 2) + fibonacci(index - 1);
	}

}
