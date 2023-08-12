package com.test.question.q100;

public class Packer {
	
	/*
		static int pencilCount
		연필 포장 개수(개)
		static int eraserCount
		지우개 포장 개수(개)
		static int ballPoinPenCount
		볼펜 포장 개수(개)
		static int rulerCount
		자 포장 개수(개)
	
		행동 packing - > 카운트가 올라감
		
		countpacking -> 무엇을 몇개나 포장했는지 출력
		0 > 전부, 1 > 연필, 2 > 지우개, 3 > 볼펜, 4 > 자
	 */

	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public Packer() {
		this.pencilCount = 0;
		this.eraserCount = 0;
		this.ballPointPenCount = 0;
		this.rulerCount = 0;
	}
	
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수: %s입니다.\n", pencil.info());
		System.out.println("포장을 완료했습니다.");
		Packer.pencilCount++;
	}
	
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수: %s입니다.\n", eraser.info());
		System.out.println("포장을 완료했습니다.");
		Packer.eraserCount++;
	}
	
	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전  검수: %s입니다.\n", ballPointPen.info());
		System.out.println("포장을 완료했습니다.");
		Packer.ballPointPenCount++;
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수: %s입니다.\n", ruler.info());
		System.out.println("포장을 완료했습니다.");
		Packer.rulerCount++;
	}
	
	public void countPacking(int type) {
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		if (type == 0) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
			System.out.printf("볼펜 %d회\n", Packer.ballPointPenCount);
			System.out.printf("자 %d회\n", Packer.rulerCount);
		} else if (type == 1) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
		} else if (type == 2) {
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
		} else if (type == 3) {
			System.out.printf("볼펜 %d회\n", Packer.ballPointPenCount);
		} else if (type == 4) {
			System.out.printf("자 %d회\n", Packer.rulerCount);
		} 
		
	}
	
}
