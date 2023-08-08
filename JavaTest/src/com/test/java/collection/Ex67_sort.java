package com.test.java.collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {
		
		//배열 or 컬렉션
		//- 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능
		
		//2 + 1 > JDK 제공 + 커스터마이징 + 익명클래스 사용(선택)
		
		//int[] nums > JDK제공하는 방법을 사용하려면 값형x 래퍼클래스
		Integer[] nums = {1, 5, 2, 4, 3};
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		Arrays.sort(nums); // Quick Sort
		
		System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬 > 지원안함 > 직접 구현
		//Arrays.sort(배열, Comparator); Comparator -> Comparator라는 인터페이스를 상속받은 클래스의 객체
		
		
	}//main
}//class

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//TODO 구현 0809수업
		
		return 0;
	}
	
}