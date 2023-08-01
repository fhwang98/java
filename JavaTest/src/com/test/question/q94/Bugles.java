package com.test.question.q94;

import java.util.Calendar;

class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;


	public int getPrice() {
		if (this.weight == 300) {
			return 850;
		} else if (this.weight == 500) {
			return 1200;
		} else if (this.weight == 850) {
			return 1950;
		} else {
			return 0;
		}
	}

	public int getExpiration() {
		
		long nowTick = System.currentTimeMillis();
		long creationTick = this.creationTime.getTimeInMillis();
		
		long gap = nowTick - creationTick;
		int afterCreation = (int)(gap / 1000 / 60 / 60 / 24);
		
		if (this.weight == 300) {
			return 7 - afterCreation;
		} else if (this.weight == 500) {
			return 10 - afterCreation;
		} else {
			return 15 - afterCreation;
		}
	}

	public void setSize(int weight) {
		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
			if (weight == 300) {
				
			}
			
			
			
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void setCreationTime(String date) {

		Calendar c = Calendar.getInstance();
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		
		c.set(year, month - 1, day);
		this.creationTime = c;		
		
	}
	
	public void eat() {
		if (getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
		System.out.println();
	}
}