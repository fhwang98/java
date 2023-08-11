package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {
		
		//배열 or 컬렉션
		//- 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능
		
		//2 + 1 > JDK 제공 + 커스터마이징 + 익명클래스 사용(선택)
		
//		m1();
		
		//문자열
//		m2();
		
		//날짜
//		m3();
		
		//객체
//		m4();
		//컬렉션
		m5();
		
	}//main

	private static void m5() {

		//컬렉션의 정렬
		//1. ArrayList > 순서O > 정렬O
		//2. HashMap > 순서X > 정렬X
		//3. Queue > 정렬X
		//4. Stack > 정렬X
		//5. HashSet > 순서X > 정렬X
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100)); //0~99 난수
		}
		System.out.println(list);
		System.out.println();
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		//내림차순 정렬
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return o2 - o1;
//			}
//		});
//		System.out.println(list);
//		System.out.println();
		
		//ArrayList 자신이 직접 sort 메소드 갖고잇음
		//단! sort() 기본 메소드 없어서
		//오름차순이든 내림차순이든 직접 Comparator 구현해야함
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		
	}

	private static void m4() {
		
		//객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 98, 78, 88);
		list[2] = new Score("유재석", 78, 95, 79);
		list[3] = new Score("박명수", 56, 78, 76);
		list[4] = new Score("이순신", 99, 67, 79);
		
		System.out.println(Arrays.toString(list));

		//이름순으로 오름차순 정렬
		//Arrays.sort(list); //에러 > 복합데이터중 어떤 데이터를 기준으로 오름차순...? 몰라!
		
		Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				
				//이름 오름차순 정렬
				//return o1.getName().compareTo(o2.getName());
				
				//국어점수 내림차순 정렬
				//return o2.getKor() -o1.getKor();
				
				//총점 내림차순 정렬
				return (o2.getKor() + o2.getEng() + o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());
				
			}
		});
		
		System.out.println(Arrays.toString(list));
		
		
		
	}

	private static void m3() {
		
		Calendar[] dates = new Calendar[5];
		
		for (int i = 0; i < dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();

		//오름차순 정렬
		Arrays.sort(dates);
		
		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//내림차순 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return (int)(o2.getTimeInMillis() - o1.getTimeInMillis()); //문제가 생길 가능성 있음
				
				return o2.compareTo(o1);
			}
		});
		
		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}
		System.out.println();

		//날짜 상관없이 요일 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {
			
			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//자바 > 일(1) ~ 토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
			}
		});
		
		for (int i = 0; i < dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}
		System.out.println();
		
		
		
		
	}

	private static void m2() {
		
		//자료형별 정렬
		//1. 숫자형
		//2. 문자(열) > 문자코드값 > 숫자
		//3. 날짜시간 > 숫자
		//4. 객체
		
		//문자열
		
		String txt1 = "홍길동";
		String txt2 = "아무개";
		
		//System.out.println(txt1 > txt2); //참조형 = 주소값 주소값의 연산 > 불가능!
		//문자열 > 문자열 : 불가능(참조값)
		//문자 > 문자 : 가능(값)
		//System.out.println('A' > 'B');
		
		int n = 0;
		
		for (int i = 0; i < 3; i++) {
			
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1 > c2) {
				n = 1;
				break;
			} else if (c1 < c2) {
				n = -1;
				break;
			}
		}
		
		System.out.println(n);
		
		//이미 구현된 메소드
		System.out.println(txt1.compareTo(txt2));
		System.out.println(txt1.compareToIgnoreCase(txt2)); //영어 대소문자 구분 없이 비교
		
		//txt1 = "ABC";
		//txt2 = "abc";
		//System.out.println(txt1.compareTo(txt2));
		//System.out.println(txt1.compareToIgnoreCase(txt2));
		System.out.println();
		System.out.println();
		System.out.println();
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		
		//가나다순으로 오름차순정렬
		//System.out.println(Arrays.toString(names));
		//Arrays.sort(names);
		//System.out.println(Arrays.toString(names));
		
		//내림차순 정렬
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				//return o2.compareTo(o1); > 문자코드값 비교 > 가나다 내림차순
				//return o1.length() - o2.length(); //글자수 비교 정렬
				
				if (o1.length() > o2.length()) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else { //글자수가 같은 애들끼리 정렬
					
					//2차 정렬 기준
					return o2.compareTo(o1);
				}
			}
			
		});
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
		
		//int[] nums > JDK제공하는 방법을 사용하려면 값형x 래퍼클래스
		Integer[] nums = {1, 5, 2, 4, 3};
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		//Arrays.sort(nums); // Quick Sort
		
		System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬 > 지원안함 > 직접 구현
		//Arrays.sort(배열, Comparator); Comparator -> Comparator라는 인터페이스를 상속받은 클래스의 객체
		Arrays.sort(nums, new MyComparator());
		
		System.out.println(Arrays.toString(nums));
		
		//쓸모 없음 ... 일반적인 객체를 만들기 위해 만든 클래스가 아님 ..
		MyComparator mc1 = new MyComparator();  
		System.out.println(mc1.compare(10, 20)); 
		
		Double[] nums2 = {2.5, 7.1, 3.8, 9.2, 8.9};
		
		//Arrays.sort(nums2, new MyComparator()); //MyComparator는 Integer로 만들어서 안됨!
		Arrays.sort(nums2, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
				
				//return (int)((o2 - o1) * 10);
				
			}
			
		});
		
		System.out.println(Arrays.toString(nums2));
	}
}//class


//정렬때문에 선언한 클래스
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		//o1 vs o2
		//1. 오름차순
		//	a. o1이 더 크면 > 양수 반환 > 1
		//	b. o2가 더 크면 > 음수 반환 > -1
		//	c. 같으면 > 0 반환
		
		//o1 vs o2
		//2. 내림차순
		//	a. o1이 더 크면 > 음수 반환 > -1
		//	b. o2가 더 크면 > 양수 반환 > 1
		//	c. 같으면 > 0 반환
		
//		if (o1 < o2) {
//			return 1;
//		} else if (o1 > o2) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		return o2 - o1;
	}
	
}

class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math) {
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
}











