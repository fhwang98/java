package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {

	public static void main(String[] args) {

		//TreeMap
		//- Tree > 이진 탐색 트리 > 자동 정렬
		//- Map > 키 + 값 > 연관 배열
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map.size());
		
		System.out.println(map); //key가 자동으로 정렬
		
		System.out.println(map.get("green"));
		
		map.put("green", "녹색");
		System.out.println(map.get("green"));
		System.out.println();
		
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println();
		
		System.out.println(map.headMap("m"));
		System.out.println();
		System.out.println(map.tailMap("m"));
		System.out.println();
		System.out.println(map.subMap("r", "y"));
		System.out.println();
		
		//Vector > ArrayList로 대체되어감... 쓸일 거의 없다
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		System.out.println(vector.get(0));
		
		
		/*
		
			List
			- ArrayList > 배열이 필요할 때 / 삽입, 삭제(X) 성능 떨어짐 **********
			- LinkedList > ArrayList 대체제 / 삽입, 삭제(O)
			- Stack > 스택 구조 필요
			- Queue > 큐 구조 필요
			- Vector (이제 잘 안씀)
			
			Set
			- HashSet > 중복값 배체, 유일한 집합 **********
			- TreeSet > HashSet + 정렬이 필요한 경우 (드물다)
			
			Map
			- HashMap > 키/값 연관배열이 필요할 때 **********
			- TreeMap > HashMap + 정렬 (드물다)
			- HashTable (이제 잘 안씀)
			
			- Properties > JSON, XML로 대체
			
		
		*/
	}

}
