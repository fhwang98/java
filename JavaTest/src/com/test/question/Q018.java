package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		int count;
		count = positive(10);
		System.out.println(count);
		count = positive(10, 20);
		System.out.println(count);
		count = positive(10, 20, -30);
		System.out.println(count);
		count = positive(10, 20, -30, 40);
		System.out.println(count);
		count = positive(10, 20, -30, 40, 50);
		System.out.println(count);
	}

	private static int positive(int i) {
		return (i >= 0) ? 1 : 0;
	}

	private static int positive(int i, int j) {
		
		int count = 0;
		
//		count = (i >= 0) ? (j >= 0) ? count + 2 
//									: count + 1
//						  : count;
		
		count = (i >= 0) ? count + 1 : count;
		count = (j >= 0) ? count + 1 : count;
		
		
		return count;
	}

	private static int positive(int i, int j, int k) {
		
		int count = 0;
		
		//어떻게 줄이지 ............
		//어려워용
		count = (i >= 0) ? count + 1 : count;
		count = (j >= 0) ? count + 1 : count;
		count = (k >= 0) ? count + 1 : count;

		
		return count;
	}

	private static int positive(int i, int j, int k, int l) {
		int count = 0;
		count = (i >= 0) ? count + 1 : count;
		count = (j >= 0) ? count + 1 : count;
		count = (k >= 0) ? count + 1 : count;
		count = (l >= 0) ? count + 1 : count;
		

		return count;
	}

	private static int positive(int i, int j, int k, int l, int m) {
		
		int count = 0;
		count = (i >= 0) ? count + 1 : count;
		count = (j >= 0) ? count + 1 : count;
		count = (k >= 0) ? count + 1 : count;
		count = (l >= 0) ? count + 1 : count;
		count = (m >= 0) ? count + 1 : count;
		
		return count;
	}
}
