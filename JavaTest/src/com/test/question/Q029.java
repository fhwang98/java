package com.test.question;

import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int first = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int second = scan.nextInt();
		
		//스캐너 버퍼 비우기
		scan.nextLine();
		
		System.out.printf("연산자: ");
		String operator = scan.nextLine();


		if (operator.equals("+")) {
			System.out.printf("%d %s %d = %d", first, operator, second, (long)first + second);
		} else if (operator.equals("-")) {
			System.out.printf("%d %s %d = %d", first, operator, second, (long)first - second);
			
		} else if (operator.equals("*")) {
			System.out.printf("%d %s %d = %d", first, operator, second, (long)first * second);
			
		} else if (operator.equals("/")) {
			System.out.printf("%d %s %d = %.1f", first, operator, second, (double)first / second);
			
		} else if (operator.equals("%")) {
			System.out.printf("%d %s %d = %d", first, operator, second, first + second);
			
		} else {
			System.out.println("연산이 불가능합니다.");
		}
	}

}

//코드리뷰
//다 비슷하게 풀이
//결과 long 형변환 한 이유> 연산의 결과가 int 최대최솟값 넘어가는 경우를 대비해서
//연산자 출력할때 %s로 출력한 이유?> 문장을 복사해서 붙여넣을 때 연산자 부분을 일일이 수정해주지 않아도 됨
