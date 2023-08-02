package com.test.question.q96;

class Box {
	private Macaron[] list = new Macaron[10];

	//마카롱을 만드는 메소드
	public void cook() {
		
		String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"}; 
		
		for (int i =0; i< this.list.length; i++) {
			this.list[i] = new Macaron();
			//크기, 색상, 두께 난수로 집어넣음
			this.list[i].setColor(color[(int)(Math.random() * color.length)]);
			this.list[i].setSize((int)(Math.random()*11) + 5);
			this.list[i].setThickness((int)(Math.random()*20) + 1);
		}
		System.out.println("마카롱을 10개 만들었습니다.");
		System.out.println();
	}

	public void check() {
		
		int countNotOK = 0;
		
		System.out.println("[박스 체크 결과]");
		
		for (int i = 0; i < list.length; i++) {
			if (isInvalid(i)) {
				countNotOK++;
			}
		}
		System.out.printf("QC 합격 개수 : %d개\n", list.length - countNotOK);
		System.out.printf("QC 불합격 개수 : %d개\n", countNotOK);
		System.out.println();
	}
	
	public void list() {
		System.out.println("[마카롱 목록]");
		for (int i = 0; i < this.list.length; i++) {
			String checked = "합격";
			if (isInvalid(i)) {
				checked = "불합격";
			}
			System.out.printf("%2d번 마카롱 : %2dcm(%-6s, %2dmm) : %-3s\n"
					, i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness(), checked);
		}
	}
	
	private boolean isInvalid(int i) {
		return this.list[i].getColor().equals("black")
				|| (this.list[i].getSize() < 8 || this.list[i].getSize() > 14)
				|| (this.list[i].getThickness() < 3 || this.list[i].getThickness() > 18);
	}
	
}
