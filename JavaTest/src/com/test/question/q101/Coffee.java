package com.test.question.q101;

public class Coffee { //Coffee 공용 정보 클래스 > 상속 아님!! static 변수

	private static int bean;
	private static int water;
	private static int ice;
	private static int milk;
	private static int beanUnitPrice;
	private static double waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	private static int beanTotalPrice;
	private static int waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	private static int americano;
	private static int latte;
	private static int espresso;
	
	static {
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;
	}
	
	
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean += bean;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int bean) {
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * bean;
	}
	
	public static void countEspresso(Espresso espresso) {
		Coffee.setBean(espresso.getBean());
		Coffee.setBeanTotalPrice(espresso.getBean());
		Coffee.espresso++;
	}
	
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water += water;
	}
	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(int water) {
		Coffee.waterTotalPrice += (int)(Coffee.waterUnitPrice * water);
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice += ice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int ice) {
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * ice;
	}
	public static void countAmericano(Americano americano) {
		Coffee.setBean(americano.getBean());
		Coffee.setBeanTotalPrice(americano.getBean());
		Coffee.setWater(americano.getWater());
		Coffee.setWaterTotalPrice(americano.getWater());
		Coffee.setIce(americano.getIce());
		Coffee.setIceTotalPrice(americano.getIce());
		Coffee.americano++;
	}
	
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk += milk;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milk) {
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * milk;
	}
	

	public static void countLatte(Latte latte) {
		Coffee.setBean(latte.getBean());
		Coffee.setBeanTotalPrice(latte.getBean());
		Coffee.setMilk(latte.getMilk());
		Coffee.setMilkTotalPrice(latte.getMilk());
		Coffee.latte++;
		
	}
	
// 총 잔수	
	public static int getAmericano() {
		return americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	
// 단위당 가격
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	
	

}





