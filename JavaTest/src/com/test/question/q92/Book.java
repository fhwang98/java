package com.test.question.q92;

class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() > 0
			&& title.length() <= 50
			&& isValidTitle(title)) {

			this.title = title;
		}
	}

	private boolean isValidTitle(String title) {
		
		for (int i = 0; i < title.length(); i++) {
			if ((title.charAt(i) < 'a' || title.charAt(i) > 'z')
				&& (title.charAt(i) < 'A' || title.charAt(i) > 'Z')
				&& (title.charAt(i) < '가' || title.charAt(i) > '힣')
				&& title.charAt(i) != ' ' ) {
				return false;
			}
		}
		return true;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0 && price <= 1000000) {
			this.price = price;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		}
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String info() {
		
		String temp = "";
		temp += String.format("제목: %s\n", this.title);
		temp += String.format("가격: %,d원\n", this.price);
		temp += String.format("저자: %s\n", this.author);
		temp += String.format("출판사: %s\n", this.publisher);
		temp += String.format("발행년도: %s년\n", this.pubYear);
		temp += String.format("ISBN: %s\n", this.isbn);
		temp += String.format("페이지: %,d장\n", this.page);
		
		return temp;
	}

}