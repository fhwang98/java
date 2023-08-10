package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;

public class Ex74_Stream {

	public static void main(String[] args) {
		
		/*
			자바 스트림
			1. 입출력 스트림
				- 파일 입출력, 콘솔 입출력, 네트워크 입출력 ...
				
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원
				- 파일 입출력 지원
				- 디렉토리 탐색 지원
				
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. 스트림
			
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
				
			2. Supplier
				- () -> {return 값}
				
			3. Fumction
				- (매개변수) -> {return 값}
			
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일
			
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 boolean
			
			
			
			
		*/
		
		String path = "c:\\class\\code\\java\\com\\test\\test.java";
		
		//배포
		//- 개발자 자바 소스 > (전달) > 다른 개발자
		//1. 소스 자체 전달 > MyFile.java
		//2. 컴파일한 실행 파일을 전달 > MyFile.class > 압축(1개 파일) > *.jar
		
		
		//import > 같은 프로젝트내에서만 가능
//		MyFile mf = new MyFile(); //MyUtil.com.test.util.Myfile.java 
//		
//		System.out.println(mf.getFileNameWithoutExtension(path));
//		System.out.println(mf.getExtension(path));
//		
//		m1();
		
//		m2();
		
//		m3();
		
//		m4();
		
		m5();
		
		
	}//main

	private static void m5() {
		
		/*
			
			스트림
			- 데이터 소스로부터 탐색/조작 가능한 도구
			- list.stream().forEach()

			파이프, pipe
			- 스트림 객체 메소드
			1. 중간 파이프
				- 반환값 O + 스트림 반환
				
			2. 최종 파이프
				- 반환값 X + void
				- 반환값 O + 다른 자료형 반환 
			
			요소 처리
			- forEach()
			- 최종 파이프
			
			필터링
			- filter(0
			- 중간파이프
			
		*/

		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항] 짝수만 출력
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		
		
		list.stream().filter(num -> num % 2 == 0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m4() {
		
		//스트림을 얻어오는 방법
		
		//1. 배열로부터
		//2. 컬렉션으로부터
		
		//3. 숫자범위로부터
		//4. 파일로부터
		//5. 디렉토리로부터
		
		//1. 배열로부터
		int[] nums1 = {10, 20, 30};
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//2. 컬렉션으로부터
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//3. 숫자범위로부터
		
		//Stream<Integer> : 범용 스트림 > forEach > Consumer<Integer>
		//IntStream		  : 전용 스트림 > forEach > IntConsumer
		
		IntStream
			.range(1, 10)
			.forEach(num -> System.out.println(num));
		System.out.println();
		
		
		try {
			
			//4. 파일로부터
			//- 스트림 > 파일 읽기
			//Paths.get("C:\\class\\java\\code\\JavaTest\\data\\number.txt");
			
			//java.io > 버전업 > java.nio
			
			//. : 현재 실행파일이 있는 폴더
			//- 자바 콘솔 프로젝트에서는 프로젝트 루트 폴더를 표현
			//Paths.get(".\\data\\number.txt");
			Path path = Paths.get("data\\number.txt"); // (.\\ 생략 가능)
			
			Files.lines(path).forEach(line -> System.out.println(line));
			System.out.println();
			
			
			//5. 디렉토리로부터
			//- 목록보기 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
				System.out.println();
			});
			
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {

		//함수형 프로그래밍 == 의식의 흐름대로 ... 가독성 떨어짐 
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		Data
			.getIntList()
			.stream()
			.forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			System.out.println();
		});
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		
		
	}

	private static void m2() {
		
		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//1. for
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
		System.out.println();
		
		//2. for
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		//3. Iterator
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		//4. Stream
		Stream<String> stream =list.stream();
		
		Consumer<String> c1 = str -> System.out.println(str);
		
		//forEach 메소드
		//1. stream으로부터 얻어낸 데이터 > 1개씩 가져온다.(향상된 for문처럼)
		//2. 가져온 데이터 > Consumer.accept() 메소드의 인자 전달 + 메소드 호출
		//3. 반복 * 요소만큼
		stream.forEach(c1);
		System.out.println();
		//stream.forEach(c1); //stream has already been operated upon or closed 이미 다 소비
		
		stream = list.stream();
		stream.forEach(c1);
		System.out.println();
		
		//메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.println(str));
		
		
	}

	private static void m1() {
		
		//받은 data 파일
		
		int[] nums1 = Data.getIntArray();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println();
		
		int[] nums2 = Data.getIntArray(5);
		
		System.out.println(Arrays.toString(nums2));
		System.out.println();
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3.size());
		System.out.println();
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		System.out.println();
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		System.out.println();
		
		Item[] items = Data.getItemArray();
		System.out.println(Arrays.toString(items));
		System.out.println();
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
		System.out.println();
		
		
	}

}//class
