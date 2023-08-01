package com.test.question.q93;


class Note {
	private String size = "A5";
	private String color = "흰색";
	private int page = 10;
	private String owner;
	private int price = 500;
	
	private String thickness;

	// setter, getter 구현

	public void setSize(String size) {
		if (size.equals("A3")
			||size.equals("A4")
			||size.equals("A5")
			||size.equals("B3")
			||size.equals("B4")
			||size.equals("B5")) {
			this.size = size;
			
			
			if (size.equals("A3" )) {
				this.price += 400;
			} else if (size.equals("A4" )) {
				this.price += 200;
			} else if (size.equals("B3" )) {
				this.price += 500;
			} else if (size.equals("B4" )) {
				this.price += 300;
			} else if (size.equals("B5" )) {
				this.price += 100;
			}			
			
		}
	}

	public void setColor(String color) {
		if (color.equals("검정색")
			||color.equals("흰색")
			||color.equals("노란색")
			||color.equals("파란색")) {
			
			this.color = color;
			
			if (color.equals("검정색")) {
				this.price += 100;
			} else if (color.equals("노란색") || color.equals("파란색"
					+ "")) {
				this.price += 200;
			}
			
			
		}
	}

	public void setPage(int page) {
//		if (page >= 10 && page <= 200) {
//			this.page = page;
//		}
		
		if (page < 10 || page >200) {
			return;
		} else {
			this.page = page;
		}
		
		//10~50 얇다
		if (page>= 10 && page <= 50) {
			this.thickness = "얇은";
		} else if (page > 50 && page <= 100) {
			this.thickness = "보통";
		} else{
			this.thickness += "두꺼운";
		}
		
		this.price += (this.page - 10)* 10;
	
	}

	//필수값 ?? 
	public void setOwner(String owner) {
		//유효성 검사
		//- 검사할 기준 1개 > 무관
		//- 검사할 기준 N개 > 잘못된 것을 찾기!!
		
		//수업 필기
		//한글 2 ~ 5자 이내
		//글자수
//		if (owner.length() >= 2 && owner.length() <= 5) {
//			boolean result = false;
//			for (int i = 0; i < owner.length(); i++) {
//				char c = owner.charAt(i);
//				if (c >= '가' && c <= '힣') {
//					result = true;
//				} else {
//					result = false;
//					break;
//				}
//			}
//			if (result) {
//				this.owner = owner;
//			}
//		}
		
		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}
		for (int i = 0; i < owner.length(); i++) {
			char c = owner.charAt(i);
			if (c < '가' || c > '힣') {
				return;
			}
		}
		this.owner = owner;

		
		
		
		//내풀이
//		if (owner.length() >= 2 && owner.length() <= 5
//				&& isKorean(owner)) {
//			this.owner = owner;
//		}
	}
	
//	private boolean isKorean(String owner) {
//		for (int i = 0; i < owner.length(); i++) {
//			if (owner.charAt(i) < '가'
//					&& owner.charAt(i) > '힣') {
//				return false;
//			}
//		}
//		return true;
//	}


	public String info() {
		
		//문자열(null)
		//if (owner != null) > 연산자 사용
		
		//문자열("")
		//if (owner.equals("")) > 메소드 사용
		
		
		String result = "■■■■■■ 노트 정보 ■■■■■■\n";

		if (this.owner != null) {
			
			result += String.format("소유자 : %s\n", this.owner);
//			result += String.format("특성 : %s 노트\n", getState());
			result += String.format("특성 : %s %s %s노트\n", this.color, this.thickness , this.size);
//			result += String.format("가격 : %,d원\n", totalPrice());
			result += String.format("가격 : %,d원\n", this.price);
		} else {
			result += "주인 없는 노트\n";
		}
		result += "■■■■■■■■■■■■■■■■■■■■■■\n";
		
		return result;
	}
}


//	private String getState() {
//		
//		String result = this.color;
//		
//		if (this.page <= 50) {
//			result += "얇은 ";
//		} else if (this.page > 50 && this.page <= 100) {
//			result += "보통 ";
//		} else if (this.page > 100) {
//			result += "두꺼운 ";
//		}
//		result += this.size;
//		return result;
//	}

//	private int totalPrice() {
//		
//		int price = 500;
//		
//		if (this.size.equals("A3")) {
//			price += 400;
//		} else if (this.size.equals("A4")) {
//			price += 200;
//		} else if (this.size.equals("B3")) {
//			price += 500;
//		} else if (this.size.equals("B4")) {
//			price += 300;
//		} else if (this.size.equals("B5")) {
//			price += 100;
//		}
//		
//		if (this.color.equals("검정색")) {
//			price += 100;
//		} else if (this.color.equals("노란색") || this.color.equals("파란색")) {
//			price += 200;
//		}
//		
//		if (this.page > 10) {
//			price += (this.page - 10) * 10;
//		}
//		
//		this.price = price;
//		return price;
//	}
//}
