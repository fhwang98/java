package com.test.question.q104;

public class Main {

	public static void main(String[] args) {

		// 배열 생성
		MyArrayList list = new MyArrayList();

		// 추가
		System.out.println("add \"홍길동\", \"아무개\", \"하하하\" ");
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");
		list.add("삼삼삼");
		list.add("사사사");
		list.add("오오오");
		list.add("육육육");
		list.add("칠칠칠");
		list.add("팔팔팔");
		System.out.println();

		// 읽기
		System.out.println("get");
		System.out.println(0 + list.get(0));
		System.out.println(1 + list.get(1));
		System.out.println(2 + list.get(2));
		System.out.println();
		
		// 개수
		System.out.println("size");
		System.out.println(list.size());
		System.out.println();

		// 탐색 + 읽기
		System.out.println("size만큼 탐색 + get");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		System.out.println();

		// 수정
		System.out.println("set(0, 우하하)");
		list.set(0, "우하하");
		System.out.println("size만큼 탐색 + get");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		System.out.println();

		// 삭제
		System.out.println("remove(1)");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		System.out.println("size : " + list.size());
		System.out.println();

		// 삽입
		System.out.println("add(1, 호호호)");
		list.add(1, "호호호");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + list.get(i));
		}
		System.out.println("size : " + list.size());
		System.out.println();

		// 검색
		System.out.println("홍길동 검색");
		System.out.println("list.indexOf(\"홍길동\") : " + list.indexOf("홍길동"));
		System.out.println("list.lastIndexOf(\"홍길동\") : " + list.lastIndexOf("홍길동"));
		if (list.indexOf("홍길동") > -1) {
			System.out.println("홍길동 있음");
		} else {
			System.out.println("홍길동 없음");
		}
		System.out.println();

		// 초기화
		list.clear();
		System.out.println(list.size());
		System.out.println(0 + list.get(0));
		System.out.println();
	}
}
