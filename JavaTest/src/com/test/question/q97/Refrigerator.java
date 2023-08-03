package com.test.question.q97;

class Refrigerator {
	private Item[] items = new Item[100];
	private int index = 0;
	private int count = 0;

	// 물건 집어넣는 메소드
	public void add(Item item) {
		if (this.index < this.items.length) {
			this.items[this.index] = item;
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n", this.items[this.index].getName());
			this.count++;
			this.index++;
		} else {
			System.out.println("냉장고가 가득 찼습니다.");
		}
	}

	// 물건 꺼내는 메소드
	public Item get(String name) {
		
		int itemIndex = -1;
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i].getName().equals(name)) {
				itemIndex = i;
				break;
			}
		}
		Item o = this.items[itemIndex];
		
		for (int i = 0; i < this.items.length - 1; i++) {
			this.items[i] = this.items[i + 1];
		}
		this.items[this.items.length - 1] = null;
		//코드리뷰
		// for를 length까지 돌려도 마지막에 자동으로 null이 들어감!
		
		
		this.count--;
		this.index--;
		
		return o;
	}


	public int count() {
		
		return this.count;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		
		int i = 0;
		while (items[i] != null) {
			System.out.printf("%s(%s)\n", this.items[i].getName(), this.items[i].getExpiration());
			i++;
		}
	}
	
	
}
