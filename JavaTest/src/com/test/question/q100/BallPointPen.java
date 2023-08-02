package com.test.question.q100;

public class BallPointPen {

	private double thickness;
	private String color;
	
	
	
	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		if (thickness == 0.3 || thickness == 0.5 || thickness == 0.7 
				|| thickness == 1.0 || thickness == 1.5) {
			this.thickness = thickness;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals("red") || color.equals("blue") || color.equals("green") || color.equals("black") ) {
			this.color = color;
		}
	}

	public String info() {
		return String.format("%s색상 %.1fmm 볼펜", this.color, this.thickness);
	}
}
