package com.test.question;

public class Q041 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; ; i++) {
			if (sum > 1000) {
				System.out.printf("%d = %d\n", --i, sum); // 반복 돌면서 i하나 늘어났으니까 한칸 다시 밀어줘야댐
				break;
			}
			System.out.printf("%d + ", i);
			sum += i;
		}
	}
}
