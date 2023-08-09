package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {

	public static void main(String[] args) {

		/*
			
			TreeSet
			- Tree 구조 > 이진 트리 구조(이진 탐색 트리, Binary Search Tree)
			- Set 사용법
			(부모와 값 비교 > 작으면 왼쪽 자식 크면 오른쪽 자식)
			(물리적인 구조가 자동으로 오름차순 정렬이 되는 독특한 구조 .. ) 
			
			
			Set
			- 순서가 없다.
			- 중복값을 가지지 않는다.
			
		*/
		
		HashSet<Integer> hash = new HashSet<Integer>();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		hash.add(10);
		hash.add(30);
		hash.add(40);
		hash.add(20);
		hash.add(50);
		
		tree.add(10);
		tree.add(30);
		tree.add(40);
		tree.add(20);
		tree.add(50);
		
		System.out.println(hash); // 지맘대루
		System.out.println(tree); // 정렬됨
		
		//탐색 > for / iterator
		
		for (int n : tree) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter = tree.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//TreeSet 고유 기능
		System.out.println(tree.first()); //가장 작은 요소
		System.out.println(tree.last()); // 가장 큰 요소
		
		System.out.println(tree.headSet(30)); //exclusive 처음부터 30 전까지의 요소
		System.out.println(tree.tailSet(30)); //inclusive 30을 포함해서 끝까지의 요소
		System.out.println(tree.subSet(20, 40)); //20포함, 40제외
		System.out.println();
		System.out.println();
		
		
		//HashSet > ArrayList 바꿔서 정렬
		HashSet<Integer> hash2 = new HashSet<Integer>();
		hash2.add(20);
		hash2.add(50);
		hash2.add(30);
		hash2.add(10);
		hash2.add(40);
		
		System.out.println(hash2);
		
		ArrayList<Integer> list = new ArrayList<Integer>(hash2);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
