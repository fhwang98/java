package com.test.question.q100;

public class Eraser {

	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		if (size == null) {
			this.size = null;
		} else if (size.equals("Large") || size.equals("Medium") || size.equals("Small") ) {
			this.size = size;
		}
	}
	
	
	public Eraser() {
		this(null);
	}
	
	public Eraser(String size) {
		this.setSize(size);
	}

	public String info() {
		return String.format("%s사이즈 지우개", this.size);
	}
}
