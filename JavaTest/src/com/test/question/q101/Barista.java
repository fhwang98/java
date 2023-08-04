package com.test.question.q101;


public class Barista {
	
	public Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso(bean);
		
		Coffee.setBean(espresso.getBean());
		Coffee.setBeanTotalPrice(espresso.getBean());
		Coffee.setEspresso();
		return espresso;		
	}
	
	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espressos = new Espresso[count];
		for (int i = 0; i < count; i++) {
			espressos[i] = new Espresso(bean);
			Coffee.setBean(espressos[i].getBean());
			Coffee.setBeanTotalPrice(espressos[i].getBean());
			Coffee.setEspresso();
		}
		return espressos; 
	}
	
	public Latte makeLatte(int bean, int milk) {
		Latte latte = new Latte(bean, milk);
		
		Coffee.setBean(latte.getBean());
		Coffee.setBeanTotalPrice(latte.getBean());
		Coffee.setMilk(latte.getMilk());
		Coffee.setMilkTotalPrice(latte.getMilk());
		Coffee.setLatte();
		return latte;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lattes = new Latte[count];
		for (int i = 0; i < count; i++) {
			lattes[i] = new Latte(bean, milk);
			
			Coffee.setBean(lattes[i].getBean());
			Coffee.setBeanTotalPrice(lattes[i].getBean());
			Coffee.setMilk(lattes[i].getMilk());
			Coffee.setMilkTotalPrice(lattes[i].getMilk());
			Coffee.setLatte();
		}
		return lattes;
	}
	
	public Americano  makeAmericano(int bean, int water, int ice) {
		Americano americano = new Americano(bean, water, ice);
		
		Coffee.setBean(americano.getBean());
		Coffee.setBeanTotalPrice(americano.getBean());
		Coffee.setWater(americano.getWater());
		Coffee.setWaterTotalPrice(americano.getWater());
		Coffee.setIce(americano.getIce());
		Coffee.setIceTotalPrice(americano.getIce());
		Coffee.setAmericano();
		return americano;
		
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] americanos = new Americano[count];
		for (int i = 0; i < count; i++) {
			americanos[i] = new Americano(bean, water, ice);
			
			Coffee.setBean(americanos[i].getBean());
			Coffee.setBeanTotalPrice(americanos[i].getBean());
			Coffee.setWater(americanos[i].getWater());
			Coffee.setWaterTotalPrice(americanos[i].getWater());
			Coffee.setIce(americanos[i].getIce());
			Coffee.setIceTotalPrice(americanos[i].getIce());
			Coffee.setAmericano();
		}
		return americanos;
	}
	
	
	public void result() {
	
		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %,d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %,d잔\n", Coffee.getAmericano());
		System.out.printf("라테 : %,d잔\n", Coffee.getLatte());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
	}
	
}