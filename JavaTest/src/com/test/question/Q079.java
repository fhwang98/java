package com.test.question;

public class Q079 {

	public static void main(String[] args) {
		//마방진 만들기
		//동서남북대각선 어디서 봐도 숫자를 더한 결과가 같음
		/*
			
			2	7	6
			
			9	5	1
			
			4	3	8
			
			
			1. 아무데나 1을 잡는다
			2. 방향을 정한다 (2시, 5시, 7시, 11시 방향) > 우리 예제는 2시방향
			3. 두시방향으로 이동한다 (없으면 상하좌우대각선에 똑같은 배열이 있다고 가정한다)
			2. 2를 넣는다
			3. 2시방향 한칸 이동, 3입력
			4. 2시방향 이동 > 숫자가 있음 > 왼쪽으로 이동 > 4 입력
			5. 4> 5> 6> 숫자가 있음 > 왼쪽
			
			
			
			
			
		*/
		//TODO 마방진 풀기
		
		
		
		int[][] nums = new int[3][3];
		
		int n = 1;
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력부
		for (int i = 0; i < 5; i++) {
			for (int j =0; j< 5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
