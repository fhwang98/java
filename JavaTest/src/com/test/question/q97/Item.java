package com.test.question.q97;

import java.util.Calendar;

class Item {
	private String name;
	private Calendar expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		
		int year = Integer.parseInt(expiration.substring(0, 4));
		int month = Integer.parseInt(expiration.substring(5, 7));
		int date = Integer.parseInt(expiration.substring(8, 10));
		
		Calendar exp = Calendar.getInstance();
		
		exp.set(year, month - 1, date);
		
		this.expiration = exp;
	}

}