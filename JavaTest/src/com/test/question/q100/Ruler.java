package com.test.question.q100;

public class Ruler {

	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length == 30 || length == 50 || length == 100) {
			this.length = length;
		}
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		if (shape.equals("줄자") || shape.equals("운형자") || shape.equals("삼각자") ) {
			this.shape = shape;
		}
	}

	public String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}
	
}
