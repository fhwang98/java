package com.test.question.q101;

public class Americano {

	private int bean;
	private int water;
	private int ice;
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		if (bean > 0 ) {
			this.bean = bean;
		}
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		if (water > 0) {
			this.water = water;
		}
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		if (ice > 0) {
			this.ice = ice;
		}
	}
	
	//생성자
	public Americano() {
		this(0, 0, 0);
	}
	
	public Americano(int bean, int water, int ice) {
		this.setBean(bean);
		this.setWater(water);
		this.setIce(ice);
	}
	
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", this.bean, this.water, this.ice);
	}
}
