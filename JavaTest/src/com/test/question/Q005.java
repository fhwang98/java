package com.test.question;

import java.util.Scanner;

public class Q005 {
	
	public static void main(String[] args) {
		/*
			요구사항]	자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
			조건]	- 기어비 1:1 → 페달 1회전 == 자전거 바퀴 1회전
				- 모든 출력 숫자는 천단위 표기하시오.
			입력]	사용자가 페달을 밟은 횟수: 1000 
			출력]	사용자가 총 1,000회 페달을 밟아 자전거가 총 2,074.708m를 달렸습니다.
		 */
		
		//지름 26인치
		double inDiameter = 26;
		//인치 단위 지름을 미터 단위로 변경
		double mDiameter = inDiameter * 0.0254;
		//원주율
		double pi = 3.14159265358979323846;
		//원의 둘레 = 지름 * 원주율
		double circumference = mDiameter * pi;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		int count = scan.nextInt();
		
		//페달 1회 = 바퀴 1회 회전 이므로
		//자전거가 이동한 거리는 페달이 돌아간 횟수 * 원의 둘레
		double distance = count * circumference;
	
		//코드리뷰
		//count를 형변환 하지 않은 이유
		//-> 원의 둘레(circumference) 변수가 double이기때문에
		// 	 형변환을 하지 않아도 결과는 double형
		
		
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", count, distance);
		
		
		
	}
}
