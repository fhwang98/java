package com.test.question.q97;

import java.util.Arrays;

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
			System.out.println("full");
		}
	}

	// 물건 꺼내는 메소드
	public Item get(String name) {
		
		int itemIndex = getIndex(name, this.items);
		//여기 오류남;;;;;;;;;;;;;;;
				
		Item o = this.items[itemIndex];
		
		
		int i = 1;
		while (items[i] != null) {
			
			this.items[i - 1] = this.items[i];
			//여기 자꾸 오류남;;;;;;;;;;;;;;;
			i++;
		}
		
		
		
		this.items[this.items.length - 1] = null;

		this.count--;
		this.index--;
		
		return o;
	}

	private int getIndex(String name, Item[] items) {

		int i = 0;
		while (items[i] != null) {
			if (items[i].equals(name)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public int count() {
		
		return this.count;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		
		int i = 0;
		while (items[i] != null) {
			System.out.printf("%s(%tF)\n", this.items[i].getName(), this.items[i].getExpiration());
			i++;
		}
	}
	
	
}
