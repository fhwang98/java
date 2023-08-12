package com.test.question.q100;

public class Pencil {

	private String hardness;
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		if (hardness == null) {
			this.hardness = null;
		} else if (hardness.equals("4B") || hardness.equals("3B") || hardness.equals("2B")
				|| hardness.equals("B") || hardness.equals("HB") || hardness.equals("H")
				|| hardness.equals("2H") || hardness.equals("3H") || hardness.equals("4H")) {
			
			this.hardness = hardness;
		}
	}
	
	public Pencil() {
		this(null);
	}
	
	public Pencil(String hardness) {
		this.setHardness(hardness);
	}

	public String info() {
		return String.format("%s 진하기 연필", hardness);
	}
	
}
