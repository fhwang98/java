package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex26_DataTime {

	
	public static void main(String[] args) {
		
		/*
			
			자바 자료형
			1. 값형
				- 8가지
			2. 참조형
				-클래스
					- String
					- 날짜시간
					
			자바 날짜/시간 자료형
			1. Date 클래스
			2. Calendar 클래스
			3. 추가 클래스 > JDK 1.8(2014)
			
			- 시각
			- 시간
			
			2023년 7월 20일 오후 4시 9분 15초 > 시각
			8시간 수업 > 시간
			
			시각 > 시간의 흐름 > 포인트, 점
			
			
			시각, 시간 > 연산
			시각 + 시각 = X
			시각 - 시각 = O(시간)
			
			시간 + 시간 = O(시간)
			시간 - 시간 = O(시간)
			
			시각 + 시간 = O(시각)
			시각 - 시간 = O(시각)
		
						
		*/
		
		
//		m1();
//		m2();
		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
		
	}//main

	private static void m8() {
		//현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		//전용 메소드(현재 시각의 tick을 구하는 전용 메소드)
		System.out.println(System.currentTimeMillis());
	}

	private static void m7() {
		//연산
		//- 시간 + 시간 = 시간
		//- 시간 - 시간 = 시간
		
		//점심: 2시간
		
		Calendar a = Calendar.getInstance();
		a.set(Calendar.HOUR, 2); //이건 두시간이 아니구 두시!
		System.out.printf("%tF %tT\n", a, a); //나머지 시간은 불필요
		
		//점심시간: 2시간 + 1시간
		int hour = 2;
		int add = 1;
		System.out.println(hour + add);
		
		//2시간 30분
		hour = 2;
		int min = 30;
		
		//2시간 30분 + 10분 = 2시간 40분
		min += 10;
		
		System.out.printf("%d시간 %d분 \n", hour, min);
		
		//2시간 40분 + 30분 = 2시간 70분 = 3시간 10분
		
		hour = 2;
		min = 40;
		
		min += 30;
		
		System.out.printf("%d시간 %d분 \n", hour, min);
		
		hour = hour + (min / 60);
		min = min % 60;
		
		System.out.printf("%d시간 %d분 \n", hour, min);
		
		
	}

	private static void m6() {

		//연산
		//- 시각 - 시각 = 시간
		//과거의 기준일로부터 일수 차이(단위 일로 통일) 
		
		//현재 
		Calendar now = Calendar.getInstance(); 
		
		//종강일 
		Calendar end = Calendar.getInstance();
		end.set(2023, 11, 27);
		
		//- epoch time
		//- tick
		long nowTick = now.getTimeInMillis();
		System.out.println(nowTick); //1689898941116ms
		
		long endTick = end.getTimeInMillis();
		System.out.println(endTick); // 1703636727849
		
		long gap = endTick - nowTick;
		
		System.out.printf("수업 남은 시간: %,d\n"
										, gap / 1000 / 60 / 60 / 24);
		
		
		Calendar  christmas = Calendar.getInstance();
		christmas.set(2023, 11, 25);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("올해 크리스마스는 %d일 남았습니다. \n"
				, (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		Calendar  birthday = Calendar.getInstance();
		birthday.set(1997, 9, 5);
		
		long birthdayTick = birthday.getTimeInMillis();
		System.out.printf("살아온 년: %d,년\n"
											, (birthdayTick - nowTick) / 1000 / 60 / 60 / 24 / 365 ); //일년이 정확이 365일 아니라 정확한 연산은 아님... 
		System.out.printf("살아온 월: %,d월\n"
											, (birthdayTick - nowTick) / 1000 / 60 / 60 / 24 / 30);
		System.out.printf("살아온 일: %,d일\n"
											, (birthdayTick - nowTick) / 1000 / 60 / 60 / 24 );
		System.out.printf("살아온 시: %,d시\n"
											, (birthdayTick - nowTick) / 1000 / 60 / 60 );
		
		
		
		
		
	}

	private static void m5() {

		//현재 시각
		Calendar now = Calendar.getInstance(); // 설명 보면 반환값이 Calendar니까 Calendar로 받아주는거임!
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.printf("%tF %tA %tT\n", now, now, now);
		
		//특정 시각
		Calendar start = Calendar.getInstance();
		start.set(Calendar.HOUR_OF_DAY, 9);
		start.set(2023, 6, 14);
		System.out.printf("%tF %tA %tT\n", start, start, start);
		
		
		//시각 + 시간 
		start.add(Calendar.DATE, 3);
		System.out.printf("%tF %tA %tT\n", start, start, start);
		
		
	}

	private static void m4() {

		//연산
		//- 시각 + 시간
		//- 시각 - 시간
		
		//오늘 만난 커플 > 100일
		//오늘(시각) + 100일(시간) = 기념일(시각)
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차:	%tF\n", now);
		
		//now를 수정
		now.add(Calendar.DATE, 100);
		System.out.printf("100일차:	%tF\n", now);
		System.out.println();
		
		//돌잔치
		Calendar birthday = Calendar.getInstance();
		birthday.set(1997, 6, 20);
		
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("돌잔치: %tF\n", birthday);
		System.out.println();
		
		//12일전?
		//현재시각으로 초기화
		now = Calendar.getInstance();
		now.add(Calendar.DATE, -12);
		System.out.printf("12일전: %tF\n", now);
		System.out.println();
		
		//지금 > 3시간 25분뒤에 약 복용
		now = Calendar.getInstance();
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 25);
		
		System.out.printf("약 복용 시간: %tT\n", now);
		System.out.println();
		
	}

	private static void m3() {

		//특정 시각을 생성하기 > 원하는 시각 생성 > 올해 크리스마스
		Calendar christmas = Calendar.getInstance();
		
		//현재 시각 생성
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		//수정
		//- void set(오버로딩)
		
		//2023-07-20 > 2023-12-25
		christmas.set(Calendar.MONTH,11);
		christmas.set(Calendar.DATE, 25);
		
		//시분초 > 19시 정각
		christmas.set(Calendar.HOUR_OF_DAY,19);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
				
		System.out.printf("%tF %tT\n", christmas, christmas);
		System.out.println();
		
		//내 생일
		//현재시각생성
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(1997, 3, 20);
		System.out.printf("%tF\n", birthday);
		
		birthday.set(1997, 4, 20, 10, 30);
		System.out.printf("%tF %tT\n", birthday, birthday);
		
//		birthday.set(0, 0, 0, 0, 0, 0); 초까지 지정
		birthday.set(1997, 4, 20, 10, 30, 30);
		System.out.printf("%tF %tT \n", birthday, birthday);
		
	}

	private static void m2() {
		
		//두번째 예제
		
		//Calendar 클래스
		
		
		Calendar c1 = Calendar.getInstance();
		
		//java.util.GregorianCalendar[time=1689838596846,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=201,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=36,SECOND=36,MILLISECOND=846,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		//System.out.println(c1);
		
		//집합 데이터 > 내가 원하는 항목만 추출
		//- int get(int)
		
		System.out.println(c1.get(1));
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));
		System.out.println();
		
		int year = 1;
		
		System.out.println(c1.get(year));
		System.out.println();
		
		//어떤 항목을 추출 > 필요한 숫자 > 미리 수로 제공 > Calendar 상수
		System.out.println(Calendar.YEAR);
		System.out.println(c1.get(Calendar.YEAR)); //실제 사용 예
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println(c1.get(Calendar.YEAR)); //2023 > 년
		System.out.println(c1.get(Calendar.MONTH)); //6 > 월(0~11)
		System.out.println(c1.get(Calendar.DATE)); //20 > 일
		System.out.println(c1.get(Calendar.HOUR)); //4 > 시(12H)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); //16 > 시(24H)
		System.out.println(c1.get(Calendar.MINUTE)); //46 > 분
		System.out.println(c1.get(Calendar.SECOND)); //0 > 초
		System.out.println(c1.get(Calendar.MILLISECOND)); //551 > 밀리초(ms)
		System.out.println(c1.get(Calendar.AM_PM)); //오전 0 오후 1
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); //201 > 일 //올해들어서 며칠째
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //20 > 일 //이번달들어서 며칠째
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); //5 > 1(일) ~ 7(토) //이번주 며칠째
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); //29 > 주 //올해 몇주째
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); //4 > 주 //이번달 몇주째
		System.out.println();
		
		
		//요구사항] "오늘은 2023년 7월 20일입니다."
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
							, c1.get(Calendar.YEAR)
							, c1.get(Calendar.MONTH) + 1
							, c1.get(Calendar.DATE));
		System.out.println();
		
		//요구사항]	"지금은 17시 05분 50초입니다."	- 24H
		//			"지금은 오후 5시 05분 50초입니다."	- 12H
		System.out.printf("지금은 %d시 %02d분 %2d초입니다.\n" //%d 자릿수 앞에 0을 붙이면 나머지를 0으로 채워줌
							, c1.get(Calendar.HOUR_OF_DAY)
							, c1.get(Calendar.MINUTE)
							, c1.get(Calendar.SECOND));
		System.out.println();
		
		System.out.printf("지금은 %s %d시 %02d분 %2d초입니다.\n"
							, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
							, c1.get(Calendar.HOUR)
							, c1.get(Calendar.MINUTE)
							, c1.get(Calendar.SECOND));
		System.out.println();
		
		
		//printf() > 형식문자 > 날짜시간
		System.out.printf("%tF\n", c1); // 2023-07-20
		System.out.printf("%tT\n", c1); // 17:16:06
		System.out.printf("%tA\n", c1); // 목요일 > Locale > 지역 설정
		
	}

	private static void m1() {

		//첫번째 예제
		
		//Date 클래스
		
		//날짜시간을 저장하는 변수
		Date date = new Date(); //컴퓨터의 시각을 가져온다
		
		//Thu Jul 20 16:28:54 KST 2023
		System.out.println(date);
		
	}
}