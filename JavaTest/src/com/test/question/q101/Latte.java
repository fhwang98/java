package com.test.question.q101;

public class Latte {

	private int bean;
	private int milk;
	
	public int getBean() {
		return bean;
	}
	public void setBean(int bean) {
		if (bean > 0) {
			this.bean = bean;
		}
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		if (milk > 0) {
			this.milk = milk;
		}
	}
	
	//생성자
	public Latte() {
		this(0, 0);
	}
	
	public Latte(int bean, int milk) {
		this.setBean(bean);
		this.setMilk(milk);
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다.\n", this.bean, this.milk);
	}
}
