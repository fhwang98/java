package com.test.question.q108;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//배열 생성
		MySet list = new MySet();
		HashSet set = new HashSet();

//		Iterator<Integer> iter = set.iterator();
		
		//System.out.println(iter.next());
//		System.out.println(list.next());
		
		
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		
		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		
		set.add("홍길동");
		set.add("아무개");
		set.add("하하하");
		
		

		//개수
		System.out.println("MySet: "+list.size());
		System.out.println("Set: "+set.size());

		
		//삭제
		list.remove("아무개");

		//개수
		System.out.println(list.size());
		System.out.println(list);

		//탐색 + 읽기
//		while (list.hasNext()) {
//		      System.out.println(list.next());
//		}
		System.out.println(list.size());

		//초기화
		list.clear();
		System.out.println(list.size());
		
	}

}