package com.test.question.q108;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		//배열 생성
		MySet myset = new MySet();
		HashSet<String> set = new HashSet<String>();
		
//		Iterator<String> iter = set.iterator();
//		System.out.println(iter.next()); // NoSuchElementException
//		System.out.println(iter.hasNext()); //false
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		System.out.println(set.remove("홍길동")); //false
		System.out.println(myset.remove("홍길동"));
		
		//추가
		myset.add("홍길동");
		myset.add("아무개");
		myset.add("하하하");
		myset.add("흠냐링");
		myset.add("호호호");
		myset.add("헤헤헤");
		
		set.add("홍길동");
		set.add("아무개");
		set.add("하하하");
		set.add("흠냐링");
		set.add("호호호");
		set.add("헤헤헤");
		
		System.out.println(myset);
		System.out.println("set: "+set+" size:"+set.size());
		
		//개수
		System.out.println("MySet: "+myset.size());
		System.out.println("Set: "+set.size());
		
		//삭제
		myset.remove("아무개");
		set.remove("아무개");

		//개수
		System.out.println(myset);
		System.out.println("set: "+set+" size:"+set.size());


		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		//System.out.println(iter.next()); //NoSuchElementException
		System.out.println(set.size());
		
		//탐색 + 읽기
		while (myset.hasNext()) {
			System.out.println(myset.next());
		}
		//System.out.println(myset.next());
		System.out.println(myset.size());
		
		

		//초기화
		System.out.println("clear myset");
		myset.clear();
		System.out.println("size: "+myset.size());
		
	}

}