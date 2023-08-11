package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;

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
			
			
			파이프 정리
			stream()
			
			중간파이프
			.filter(Predicate)
			.map(Function)
			.sorted(Comparator)
			.distinct()
			
			최종파이프
			.count()/max()/min()/average()/sum()
			.allMatch()/anyMatch()/noneMatch()
			.forEach()
			
			
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
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		m10();
		
	}//main

	private static void m10() {
		
		//집계, 통계, Reduce
		//- count(), max(), min(), sum(), average()
		//- 최종파이프
		//- 요소들을 가공해서 통계값
		
		System.out.println(Data.getIntList().stream().count());
		
		//Optional<Integer> null값도 가질 수 있는 Integer .. ? 나중에 수업 -> get()로 실제 Integer로 바꿈..
		System.out.println(Data.getIntList().stream().max((a, b) -> a - b).get());
		System.out.println(Data.getIntList().stream().min((a, b) -> a - b).get());
		System.out.println();
		
		int sum = Data.getIntList().stream()
						.mapToInt(n -> n) //반환값 Stream<Integer>(X), 전용스트림 IntStream(O)
						.sum();
		System.out.println(sum);
		
		double avg = Data.getIntList().stream()
						.mapToInt(n -> n)
						.average().getAsDouble();
		System.out.println(avg);
		
		
	}

	private static void m9() {

		//매칭
		//- allMatch(), anyMatch(), noneMAtch(0
		//- 최종 파이프
		//- 스트림 요소들이 제시한 조건을 만족하는지 유무를 판단?
		//	a. boolean allMatch(Predicate) > 모든 요소가 조건을 100% 만족
		//	b. boolean anyMatch(Predicate) > 일부 요소가 조건을 만족
		//	c. boolean noneMatch(Predicate) > 모든 요소가 조건을 만족하지 않음
		
		//요구사항] 배열 > 짝수만 있는지?
		
		int[] nums = {1, 2, 3, 4, 5};

		boolean result = false;
		
		for (int n : nums) {
			if (n % 2 == 0) {
				result = true;
				break;
			}
		}
		if (result) {
			System.out.println("홀수 발견!!");
		} else {
			System.out.println("짝수 배열~");
		}
		System.out.println();
		
		//스트림으로
		System.out.println(Arrays.stream(nums).allMatch(n -> n % 2 == 0)); //모두 짝수?
		System.out.println(Arrays.stream(nums).anyMatch(n -> n % 2 == 0)); //하나라도 짝수?
		System.out.println(Arrays.stream(nums).noneMatch(n -> n % 2 == 0)); //모두 짝수 아님?
		System.out.println();
		
		if (Arrays.stream(nums).allMatch(n -> n % 2 == 0)) {
			System.out.println("짝수 배열~");
		} else {
			System.out.println("홀수 발견!!");
		}
		System.out.println();
		
		
		
		
	}

	private static void m8() {

		//정렬
		//- sorted()
		//- 중간파이프
		//- 배열/컬렉션의 sort()와 사용법이 동일 > Comparator 구현
		
		Data.getIntList(10)
			.stream()
			.sorted() //오름차순
			.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println();
		
		Data.getIntList(10)
			.stream()
			.sorted((a, b) -> b - a)
			.forEach(n -> System.out.println(n));
		System.out.println();
		
	}

	private static void m7() {
		
		//매핑 
		//- map(), mapXXX()
		//- 중간파이프
		//- 변환 작업
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()							//Stream<String>
			.filter(word -> word.length() <= 3) //Stream<String>
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		list.stream()					//Stream<String>
			.map(word -> word.length()) //Stream<Integer> 스트림을 다른 자료형으로 바꿀 수 있음
			.forEach(num -> System.out.println(num)); //num : 글자수
		System.out.println();
		
		
		String[] names = {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군" , "연개소문"};
		
		//이름 추출(맨 앞글자만 제외)
		Arrays.stream(names)
				.map(name -> name.substring(1))
				.forEach(name -> System.out.println(name));
		System.out.println();
		
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("가가가", 100, 90, 80));
		slist.add(new Student("나나나", 77, 88, 99));
		slist.add(new Student("다다다", 60, 50, 40));
		slist.add(new Student("라라라", 82, 67, 91));
		slist.add(new Student("마마마", 67, 88, 68));
		
		slist.stream()
				.map(s -> {
					if ((s.getKor() + s.getEng() + s.getMath()) >= 180) {
						return s.getName() + ":합격"; //서로 다른 데이터가 합쳐짐.. 관리차원에서 안좋음!
					} else {
						return s.getName() + ":불합격";
					}
				}) //Stream<Student> -> Stream<String>
				.forEach(result -> System.out.println(result));
		System.out.println();
		
		
		//Result 객체를 만들어서 이름과 합격, 불합격 넣어줌
		slist.stream()
				.map(s -> {
					if ((s.getKor() + s.getEng() + s.getMath()) >= 180) {
						Result r = new Result();
						r.setName(s.getName());
						r.setResult("합격");
						return r;
					} else {
						Result r = new Result();
						r.setName(s.getName());
						r.setResult("불합격");
						return r;
					}
				}) //Stream<Student> -> Stream<Result>
				.forEach(r -> {
					System.out.println("이름: " + r.getName());
					System.out.println("결과: " + r.getResult());
				});
		System.out.println();
		
		
		
	}

	private static void m6() {
		
		//중복 제거
		//- distinct()
		//- 중간 파이프
		//- 앞의 스트림에서 중복 요소를 제거하고 > 유일한 요소만 남은 새로운 스트림을 반환한다.
		
		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size());
		System.out.println();
		
		//요구사항] 위의 배열에서 중복값 제거
		//Case 1.
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (int n : list) {
			set1.add(n); //중복값 제거
		}
		
		System.out.println(set1.size());
		System.out.println();
		
		//Case 2.
		Set<Integer> set2 = new HashSet<Integer>(list); //중복값 제거
		
		System.out.println(set2.size());
		System.out.println();
		
		//Case 3.
//		list.stream()
//			.distinct()
//			.forEach(n -> System.out.println(n));
		
		System.out.println(list.stream().count()); //count() 최종파이프, 앞에서 넘겨받은 스트림의 요소 개수 반환
		System.out.println(list.stream().distinct().count());
		System.out.println();
		
		
		
		String[] names = {"홍길동", "아무개", "이순신", "권율", "강감찬", "연개소문", "홍길동", "이순신", "남궁장군" , "연개소문"};
		
		Arrays.stream(names)
				.distinct()
				.filter(name -> name.length() == 3)
				.forEach(name -> System.out.println(name));
		System.out.println();
		System.out.println();
		
		
		
		//Cup class
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.BLUE, 300));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.WHITE, 500)); // 1 
		clist.add(new Cup(Cup.YELLOW, 600)); //2 
		clist.add(new Cup(Cup.BLACK, 700));
		clist.add(new Cup(Cup.BLUE, 800));
		clist.add(new Cup(Cup.RED, 900));
		clist.add(new Cup(Cup.WHITE, 500)); // 1
		clist.add(new Cup(Cup.YELLOW, 600)); //2
		
		
		clist.stream()
			.distinct() //1, 2 중복처럼 보이지만 다른 객체 -> hashcode(), equals() 재정의로 같은 컵으로 생각할수있음
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		
		//Set, distinct() > 중복객체를 제거하려면?
		//1. hashcode() 재정의
		//2. equals() 재정의
		
		
		
	}

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
			- Consumer
			
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
		System.out.println();
		System.out.println("====================");
		
		
		//0811 수업
		Data.getStringList().stream()
			.filter(word -> word.length() >= 5)
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
			.filter(user -> user.getWeight() >= 70 && user.getGender() == 1)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		//가독성 높이기 (&&일때만 가능, ||는 안됨!)
		Data.getUserList().stream()
			.filter(user -> user.getWeight() >= 70)
			.filter(user -> user.getGender() == 1)
			.filter(user -> user.getHeight() >= 180)
			.forEach(user -> System.out.println(user));
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


//이전 > Set 수업 내용
class Cup {

	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLOW = 4;
	public final static int BLUE = 5;
	
	private int color; //객관식 > 빨강, 파랑 ... 선택 > 열거값
	//private String color; // 주관식 > "wite" 오타가 날수도..
	private int size;
	
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}


	public int getColor() {
		return color;
	}


	public void setColor(int color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	
	
	//개발자의 의도대로 객체를 비교하려면....
	@Override
	public int hashCode() {
		return ("" + this.color + this.size).hashCode() ;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}


//m7
//Stream<Student> -> map() -> Stream<Result>
class Result {
	
	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}






















