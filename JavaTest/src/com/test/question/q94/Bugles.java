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
		return expiration;
	}

	public void setSize(int weight) {
		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
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
		
	}
}