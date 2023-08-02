package com.test.question.q97;


class Item {
	private String name;
//	private Calendar expiration;
	private String expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		int year = Integer.parseInt(expiration.substring(0, 4));
		int month = Integer.parseInt(expiration.substring(5, 7));
		int date = Integer.parseInt(expiration.substring(8, 10));
		
		this.expiration = String.format("%d-%02d-%02d", year, month, date);
	}

}