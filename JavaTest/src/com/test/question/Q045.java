package com.test.question;

import java.util.Scanner;

public class Q045 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.print("최대 숫자: ");
		int input = scan.nextInt();
		 
		 threeSixNine(input);
		
	}

	private static void threeSixNine(int input) {
		
		String result = "";
		
		for (int i = 1; i <= input; i++) {
			//지금 숫자에 3, 6, 9가 있는지 개수 체크 
			int count = 0;
			for (int j = i; j > 0; j /= 10) {
				if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9)
					count++;
			}
			
			if (count == 0)
				result += i;
			else if (count == 1) 
				result += "짝";
			else if (count == 2) 
				result += "짝짝";
			else if (count == 3) 
				result += "짝짝짝";
			if (i < input)
				result += " ";
		}
		System.out.println(result);
		
	}
}

//3자리 넘어가면 바로 종료
//처음에 입력받은 것을 문자열로 저장
//toCahrArray() 문자열을 문자 배열로 바꿔줌
//문자 배열 하나씩 3, 6, 9 인지 확인

