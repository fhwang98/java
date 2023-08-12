package com.test.question.q107_2;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		//배열 생성
		MyHashMap map = new MyHashMap();
		HashMap<String, String> m = new HashMap<String, String>();

		
		System.out.println(m.get("국어")); //null
		System.out.println(m.remove("국어")); //null
		
		//추가
		System.out.println("MyHashMap");
		map.put("국어", "합격");
		map.put("영어", "불합격");
		map.put("수학", "보류");
		//읽기
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));

		System.out.println("HashMap");
		m.put("국어", "합격");
		m.put("영어", "불합격");
		m.put("수학", "보류");
		
		System.out.println(m.get("국어"));
		System.out.println(m.get("영어"));
		System.out.println(m.get("수학"));
		
		//개수
		System.out.println(map.size());

		//수정
		System.out.println("MyHashMap, edit eng");
		map.put("영어", "합격");
		System.out.println(map.get("영어"));

		System.out.println("HashMap, edit eng");
		m.put("영어", "합격");
		System.out.println(m.get("영어"));
		
		//삭제
		System.out.println("MyHashMap, remove eng");
		map.remove("영어");
		System.out.println(map.get("영어"));

		System.out.println("HashMap, remove eng");
		m.remove("영어");
		System.out.println(m.get("영어"));
		
		//검색(key)
		if (map.containsKey("국어")) {
		      System.out.println("국어 점수 있음");
		} else {
		      System.out.println("국어 점수 없음");
		}

		//검색(value)
		if (map.containsValue("합격")) {
		      System.out.println("합격 과목 있음");
		} else {
		      System.out.println("합격 과목 없음");
		}

		//초기화
		map.clear();
		System.out.println(map.size());
	}

}
