package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex76 {

	public static void main(String[] args) {
		
		//Open API, Open Application Programming Interface
		//- 공개된 프로그래밍 기능
		//- 공공 데이터 포털
		//- 구글, 아마존, 네이버, 다음 등 ... > 지도
		
		//Open API > 데이터 확보 > 전부 실제 데이터
		
		m1();
		
		
		
		
		
	}//main

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[지하철 정보 검색]");
		System.out.print("역 검색: ");
		String name = scan.nextLine();
		
		
		//1. 요청 URL 만들기
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?"; //url + ?
		
		//키 = 데이터
		url += "ServiceKey=uwQ5Lo5miVLY7HopSn7JkwucG3F1Z7s%2Faq3JDU70J5sepjDap7q%2BTPl1Hbg3ej6FtZGkbtg%2FenQZpf%2BL5hJ1%2Fw%3D%3D"; //일반인증키(Encoding) 
		
		url += "&_type=json"; //XML or JSON ? 
		
		url += "&numOfRows=10"; //데이터를 10개씩 가져온다
		
		url += "&pageNo=1"; // 10개씩 나눠진 데이터 중에 첫번째
		
		url += "&subwayStationName=" + name;
		
		//System.out.println(url);
		
		//QueryString
		//url + ? + 키=데이터&키=데이터&키=데이터...
		
		
		try {
			
			//URL 객체 생성
			URL obj_url = new URL(url);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속
			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
				
			}
			
			//reader > 검색 결과 읽기 가능
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			conn.disconnect();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//m1

}//class





