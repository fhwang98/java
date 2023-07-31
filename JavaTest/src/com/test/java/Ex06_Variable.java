package com.test.java;

public class Ex06_Variable {

	public static void main(String[] args) {
		
		//목표 > 자료형 + 변수 + 리터럴
		
		//1. 주변의 데이터 검색 > 내 몸무게 > 저장할 변수 생성
		//2. 형태 + 길이 > 자료형 결정 > double
		//3. 변수 생성 + 값 대입
		//4. 출력
		
		//1회
		double myWeight;
		myWeight = 70.5;
		System.out.println("제 몸무게는 " + myWeight + "kg입니다.");
		
		//각 자료형(값형 8가지, String) x 10회 = 9 x 10회
		
		
		//byte
		byte myScore;
		myScore = 100;
		System.out.println("제 점수는 " + myScore + "점 입니다.");
		
		byte month;
		month = 7;
		System.out.println("이번달은 " + month + "월 입니다.");
		
		byte day;
		day = 17;
		System.out.println("오늘은 " + day + "일 입니다.");
		
		byte myAge;
		myAge = 27; 
		System.out.println("제 나이는 " + myAge + "세 입니다.");
		
		byte myRanking;
		myRanking = 1;
		System.out.println("내 순위는 " + myRanking + "위 입니다.");
		
		byte currentHour;
		currentHour = 9;
		System.out.println("현재 시각은 " + currentHour + "시 입니다.");
		
		byte familyNumber;
		familyNumber = 5;
		System.out.println("우리 가족은 " + familyNumber + "명 입니다.");

		byte chairLeg;
		chairLeg = 4;
		System.out.println("의자 다리 개수는 " + chairLeg + "개 입니다.");
		
		byte purchaseCount;
		purchaseCount = 5;
		System.out.println("총 " + purchaseCount + "개 구매하시겠습니까?");
		
		byte dice;
		dice = 6;
		System.out.println("주사위의 눈이 " + dice + "입니다.");
		
		
		//short
		short bookPage;
		bookPage = 314;
		System.out.println(bookPage + "쪽으로 이동하시겠습까?");
		
		short year;
		year = 2023;
		System.out.println("올해는" + year + "년 입니다.");
		
		short distance;
		distance = 76;
		System.out.println("현재 위치에서 " + distance + "km 떨어져 있습니다.");
		
		short toeicScore;
		toeicScore = 990;
		System.out.println("토익 점수는 " + toeicScore + "점 입니다.");
		
		short tumblerCapacity;
		tumblerCapacity = 720;
		System.out.println("텀블러의 용량이 " + tumblerCapacity + "ml 입니다.");
		
		short storageCapacity;
		storageCapacity = 500;
		System.out.println("저장 공간이 " + storageCapacity + "GB 남았습니다.");
	
		short altitude;
		altitude = 2744;
		System.out.println("백두산의 해발고도는 " + altitude + "m 입니다.");
		
		short calorieIntake;
		calorieIntake = 2000;
		System.out.println("하루 권장 칼로리는 " + calorieIntake + "kcal 입니다.");
		
		short shortMax;
		shortMax = Short.MAX_VALUE;
		System.out.println("short의 최댓값은 " + shortMax + "입니다.");
		
		short shortMin;
		shortMin = Short.MIN_VALUE;
		System.out.println("short의 최솟값은 " + shortMin + "입니다.");
		
		
		//int
		int mySalary;
		mySalary = 100000000;
		System.out.println("이번달 급여는 " + mySalary + "원 입니다.");
		
		int rent;
		rent = 500000;
		System.out.println("집세는 " + rent + "원 입니다.");
		
		int phonePrice;
		phonePrice = 2000000;
		System.out.println("핸드폰 가격은 " + phonePrice + "원 입니다.");
		
		int loan;
		loan = 15000000;
		System.out.println("대출 금액은 " + loan + "원 입니다.");
		
		int laptopPrice;
		laptopPrice = 1800000;
		System.out.println("노트북 가격은 " + laptopPrice + "원 입니다.");
		
		int earthRound;
		earthRound = 40075;
		System.out.println("지구의 둘레는 " + earthRound + "km 입니다.");
		
		int sunRound;
		sunRound = 4379000;
		System.out.println("태양의 둘레는 " + sunRound + "km 입니다.");
		
		int viewCount;
		viewCount = 1000000;
		System.out.println("조회수가 " + viewCount + "회 입니다.");
		
		int intMax;
		intMax = Integer.MAX_VALUE;
		System.out.println("int의 최댓값은 " + intMax + "입니다.");
		
		int intMin;
		intMin = Integer.MIN_VALUE;
		System.out.println("int의 최솟값은 " + intMin + "입니다.");
	
		
		//longs
		long buildingPrice;
		buildingPrice = 650000000L;
		System.out.println(buildingPrice);
		
		long teraByte;
		teraByte = 1099511627776L;
		System.out.println(teraByte);
		
		long earthToSun;
		earthToSun = 150000000L;
		System.out.println("지구에서 태양까지 거리는 약 " + earthToSun + "km 입니다.");
		
		long earthToMercury;
		earthToMercury = 155000000L;
		System.out.println("지구에서 수성까지 거리는 약 " + earthToMercury + "km 입니다.");
		
		long earthAge;
		earthAge = 453400000L;
		System.out.println("지구는 약 " + earthAge + "살 입니다.");
		
		long sunAge;
		sunAge = 4603000000L;
		System.out.println("태양은 약 " + sunAge + "살 입니다.");
		
		long moonAge;
		moonAge = 4530000000L;
		System.out.println("달은 약 " + moonAge + "살 입니다.");
		
		long marsAge;
		marsAge = 4603000000L;
		System.out.println("화성은 약 " + marsAge + "살 입니다.");
		
		long longMax;
		longMax = Long.MAX_VALUE;
		System.out.println("long의 최댓값은 " + longMax + "입니다.");
		
		long longMin;
		longMin = Long.MIN_VALUE;
		System.out.println("long의 최솟값은 " + longMin + "입니다.");
		
		
		//float
		float myHeight;
		myHeight = 173.2f;
		System.out.println("제 키는 " + myHeight + "cm입니다.");
		
		float todayTemperature;
		todayTemperature = 27.4f;
		System.out.println("오늘의 기온은 " + todayTemperature + "도씨 입니다.");
		
		float bodyTemperature;
		bodyTemperature = 36.5f;
		System.out.println("체온이 " + bodyTemperature + "도 입니다.");
		
		float usdExchange;
		usdExchange = 1259.5f;
		System.out.println("오늘의 달러 시세는 " + usdExchange + "원 입니다.");
	
		float jpyExchange;
		jpyExchange = 909.75f;
		System.out.println("오늘의 엔화 시세는 " + jpyExchange + "원 입니다.");
		
		float eurExchange;
		eurExchange = 1417.57f;
		System.out.println("오늘의 유로 시세는 " + eurExchange + "원 입니다.");
		
		float cnyExchange;
		cnyExchange = 175.54f;
		System.out.println("오늘의 위안 시세는 " + cnyExchange + "원 입니다.");
		
		float gbpExchange;
		gbpExchange = 1649.57f;
		System.out.println("오늘의 파운드 시세는 " + gbpExchange + "원 입니다.");
		
		float audExchange;
		audExchange = 860.24f;
		System.out.println("오늘의 호주 달러 시세는 " + audExchange + "원 입니다.");
		
		float cadExchange;
		cadExchange = 955.18f;
		System.out.println("오늘의 캐나다 달러 시세는 " + cadExchange + "원 입니다.");
		
	
		//double
		double pi;
		pi = 3.141592653589793238462643383279D;
		System.out.println("원주율은 " + pi + "입니다.");
		
		double probabilityDice;
		probabilityDice = 0.1666666666666666666666666667D;
		System.out.println("주사위 눈이 1이 나올 확률은 " + probabilityDice + " 입니다.");
		
		double probabilityLotto;
		probabilityLotto = 0.0000123D;
		System.out.println("로또에 당첨될 확률은 " + probabilityLotto + "% 입니다. ");
		
		double root2;
		root2 = 1.41421356237309504880168872420969807856967187537694D;
		System.out.println("2의 제곱근은 " + root2 + "입니다. ");
		
		double root3;
		root3 = 1.73205080756887729352744634150587236694280525381038D;
		System.out.println("3의 제곱근은 " + root3 + "입니다. ");
		
		double seoulTemperature;
		seoulTemperature = 29.8;
		System.out.println("오늘 서울의 기온은 " + seoulTemperature + "도 입니다.");
		
		double sokchoTemperature;
		sokchoTemperature = 26.6;
		System.out.println("오늘 속초의 기온은 " + sokchoTemperature + "도 입니다.");
		
		double daejeonTemperature;
		daejeonTemperature = 20.4;
		System.out.println("오늘 대전의 기온은 " + daejeonTemperature + "도 입니다.");
		
		double busanTemperature;
		busanTemperature = -7.3;
		System.out.println("오늘 부산의 기온은 " + busanTemperature + "도 입니다.");
		
		double jejuTemperature;
		jejuTemperature = 32.7;
		System.out.println("오늘 제주의 기온은 " + jejuTemperature + "도 입니다.");
	
		
		//char
		char javaGrade;
		javaGrade = 'A';
		System.out.println("자바 수업 성적은 " + javaGrade + "입니다.");
		
		char sqlGrade;
		sqlGrade = 'B';
		System.out.println("sql 수업 성적은 " + sqlGrade+ "입니다.");
		
		char pythonGrade;
		pythonGrade = 'C';
		System.out.println("파이썬 수업 성적은 " + pythonGrade + "입니다.");
		
		char korGrade;
		korGrade = 'D';
		System.out.println("국어 수업 성적은 " + korGrade + "입니다.");
		
		char engGrade;
		engGrade = 'F';
		System.out.println("영어 수업 성적은 " + engGrade + "입니다.");
		
		char myBloodType;
		myBloodType = 'A';
		System.out.println("제 혈액형은 " + myBloodType + "형 입니다. ");
		
		char momBloodType;
		momBloodType = 'A';
		System.out.println("어머니의 혈액형은 " + momBloodType + "형 입니다. ");
		
		char dadBloodType;
		dadBloodType = 'O';
		System.out.println("아버지의 혈액형은 " + dadBloodType + "형 입니다. ");
		
		char c1;
		c1 = '가';
		System.out.println(c1);
		
		char c2;
		c2 = '♡';
		System.out.println(c2);
		
		
		//boolean
		boolean isUpperCase;
		isUpperCase = true;
		System.out.println("\'A\'는 대문자 입니다. : " + isUpperCase);
		
		boolean isLowerCase;
		isLowerCase = false;
		System.out.println("\'A\'는 소문자 입니다. : " + isLowerCase);
		
		boolean isMonday;
		isMonday = false;
		System.out.println("오늘은 월요일 입니다. : " + isMonday);
		
		boolean isSummer;
		isSummer = true;
		System.out.println("지금은 여름 입니다. : " + isSummer);
		
		boolean isFemale;
		isFemale = true;
		System.out.println("저는 여자 입니다. : " + isFemale );
		
		boolean isChinese;
		isChinese = false;
		System.out.println("저는 중국인 입니다. : " + isChinese );
		
		boolean isOperator;
		isOperator = true;
		System.out.println("+는 연산자 입니다. : " + isOperator );
		
		boolean javaDataType;
		javaDataType = false;
		System.out.println("자바의 자료형은 10개 입니다. : " + javaDataType );
		
		boolean intSize;
		intSize = false;
		System.out.println("int의 크기는 8byte 입니다. : " + intSize );
		
		boolean variableDeclaration;
		variableDeclaration = true;
		System.out.println("변수를 선언하는 방법은 \"자료형 변수명;\" 입니다. : " + variableDeclaration );
		
		
		//String
		String myName;
		myName = "황유진";
		System.out.println("제 이름은 " + myName + "입니다.");
		
		String dinnerMenu;
		dinnerMenu = "치킨";
		System.out.println("오늘 저녁 메뉴는 " + dinnerMenu + "입니다.");
		
		String bookTitle;
		bookTitle = "자바의 정석";
		System.out.println("이 책의 제목은 " + bookTitle + "입니다.");
	
		String favColor;
		favColor = "초록색";
		System.out.println("가장 좋아하는 색깔은 " + favColor + "입니다.");
		
		String favSeason;
		favSeason = "가을";
		System.out.println("가장 좋아하는 계절은 " + favSeason + "입니다.");
		
		String myId;
		myId = "hello123";
		System.out.println("제 아이디는 " + myId + "입니다.");
		
		String myCar;
		myCar = "123가 4567";
		System.out.println("제 차 번호는 " + myCar + "입니다.");
		
		String luckyNumber;
		luckyNumber = "7";
		System.out.println("오늘의 행운의 숫자는 " + luckyNumber + "입니다.");
		
		String newJeans;
		newJeans = "‘Cause I know what you like boy You’re my chemical hype boy";
		System.out.println(newJeans);
		
		String ive;
		ive = "우리만의 자유로운 nineteen's kitsch";
		System.out.println(ive);
		
	}
}