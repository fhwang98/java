package com.test.question.q101;

public class Coffee { //Coffee 공용 정보 클래스 > 상속 아님!! static 변수

	private static int bean = 0;
	private static int water = 0;
	private static int ice = 0;
	private static int milk = 0;
	private static int beanUnitPrice = 1;
	private static double waterUnitPrice = 0.2;
	private static int iceUnitPrice = 3;
	private static int milkUnitPrice = 4;
	private static int beanTotalPrice = 0;
	private static int waterTotalPrice = 0;
	private static int iceTotalPrice = 0;
	private static int milkTotalPrice = 0;
	private static int americano = 0;
	private static int latte = 0;
	private static int espresso = 0;
	
	
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
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano() {
		Coffee.americano++;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte() {
		Coffee.latte++;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso() {
		Coffee.espresso++;
	}
	
	
	
	
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

 