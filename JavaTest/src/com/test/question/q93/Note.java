package com.test.question.q93;

class Note {
	private String size = "A5";
	private String color = "흰색";
	private int page = 10;
	private String owner;
	private int price;

	// setter, getter 구현

	public void setSize(String size) {
		if (size.equals("A3")
			||size.equals("A4")
			||size.equals("A5")
			||size.equals("B3")
			||size.equals("B4")
			||size.equals("B5")) {
			this.size = size;
		} else {
			System.out.println("잘못된 입력입니다.");;
		}
	}

	public void setColor(String color) {
		if (color.equals("검정색")
			||color.equals("흰색")
			||color.equals("노란색")
			||color.equals("파란색")) {
			
			this.color = color;
		} else {
			System.out.println("잘못된 입력입니다.");;
		}
			
	}

	public void setPage(int page) {
		if (page >= 10 && page <= 200) {
			this.page = page;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	//필수값 ?? 
	public void setOwner(String owner) {
		if (owner.length() >= 2 && owner.length() <= 5
				&& isKorean(owner)) {
			this.owner = owner;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	private boolean isKorean(String owner) {
		for (int i = 0; i < owner.length(); i++) {
			if (owner.charAt(i) < '가'
					&& owner.charAt(i) > '힣') {
				return false;
			}
		}
		return true;
	}


	public String info() {
		
		String result = "■■■■■■ 노트 정보 ■■■■■■\n";

		result += String.format("소유자 : %s\n", this.owner);
		result += String.format("특성 : %s 노트\n", getState());
		result += String.format("가격 : %,d원\n", totalPrice());
		result += "■■■■■■■■■■■■■■■■■■■■■■\n";
		
		return result;
	}


	private String getState() {
		
		String result = this.color + " ";
		
		if (this.page <= 50) {
			result += "얇은";
		} else if (this.page > 50 && this.page <= 100) {
			result += "보통";
		} else if (this.page > 100) {
			result += "두꺼운";
		}
		
		return result;
	}

	private int totalPrice() {
		
		int price = 500;
		
		if (this.size.equals("A3")) {
			price += 400;
		} else if (this.size.equals("A4")) {
			price += 200;
		} else if (this.size.equals("B3")) {
			price += 500;
		} else if (this.size.equals("B4")) {
			price += 300;
		} else if (this.size.equals("B5")) {
			price += 100;
		}
		
		if (this.color.equals("검정색")) {
			price += 100;
		} else if (this.color.equals("노란색") || this.color.equals("파란색")) {
			price += 200;
		}
		
		if (this.page > 10) {
			price += (this.page - 10) * 10;
		}
		
		return price;
	}
}
