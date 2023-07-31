package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		//이중 반복문
		//바깥쪽 반복문 : 1 ~ 100
		//안쪽 반복문 : 소수 확인
		
		//요구사항] 2부터 100 사이의 소수를 구하시오.
		
		// 2부터 나누어보기 (1로는 무조건 나누어 떨어짐)
		// 자기자신으로는 무조건 나누어 떨어지니까 자기자신 - 1까지 확인해봐야됨
		
		boolean isPrime = true;
		
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				} else if (j == i - 1) 
					isPrime = true;
			}
			if (isPrime)
				System.out.print(i + ", ");					
		}
		System.out.println();
		
		
		
		
	}
}
