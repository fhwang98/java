package com.test.question;

public class Q055 {

	public static void main(String[] args) {
		//1에서 100 사이의 완전수를 구하시오
		//이중 반복문
		//완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
		//약수 : 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수
		
		// 해당 숫자의 약수들을 일단 전부 구해야함
		// 구한 약수(1포함, 자기자신 미포함)들의 총합이 자기자신과 같은지 확인
		// 같다면 완전수 -> 출력
		// 다르면 다음 숫자를 확인함
		
		//필요한 변수
		//약수 
		//약수들의 총합
		
		int sum;
			
		for (int i = 1; i <= 100; i++) {
			sum = 0; // i가 바뀔 때마다 sum을 초기화해줘야함
			for (int j = 1; j < i; j++) {  // 나누는 수 > 1포함, 자기자신 미포함
				//만약 i 가 j로 나누어 떨어짐
				// j는 i의 약수 -> 총합에 더함
				// i 가 j로 나누어 떨어지지 않음
				// 약수가 아니니까 다음 j로 넘어감
				if (i % j == 0) {
					sum += j;
				} else {
					continue;
				}
			}//for
			//여기서 총합이 나올테니 총합이 자기자신과 같은지 확인
			//자기자신과 같으면 출력문 출력
			//안같으면 다음 숫자로 넘어감
			if (i == sum) {
				//출력해주는 메소드
				printPerfect(i);
			}
		}//for
	}//main

	private static void printPerfect(int i) {
		//출력 형식
		//6 = [1, 2, 3,]
		//28 = [1, 2, 4, 7, 14,]
		
		//1. "숫자 = [ " 까지 출력
		//2. 약수들 순서대로 반복해서 출력
		//3. "]" 출력
		System.out.print(i + " = [");
		
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				System.out.print(j + ", ");
			}
			else {
				continue;
			}
		}
		System.out.println("]");
	}
}
