//코드리뷰
//합격자 목록과 불합격자 목록을 저장하기 위해 ArrayList를 선언했습니다.
//BufferedReader을 통해 읽은 줄을 while문을 통해 확인했습니다.
//해당 줄에 들어있는 정보(시험 점수)가 합격에 해당된다면 이름을 pass, 불합격자는 nonpass에 저장하고
//완성된 ArrayList를 for-each로 출력해주었습니다. 
//팀원분들 의견
//String[] temp를 선언해서 split(",")의 결과를 저장하고
//배열을 통해 값을 불러오는 방법을 사용하는것이
//split()을 여러번 호출하지 않을 수 있다는 의견이 있었습니다.
//이외에는 풀이방식이 거의 유사하다는 의견이었습니다.

package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q122 {

	public static void main(String[] args) {
		//CSV, comma separated value
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\성적.dat"));
			
			String line = null;

			ArrayList<String> pass = new ArrayList<String>();
			ArrayList<String> nonpass = new ArrayList<String>();
			
			
			while ((line = reader.readLine()) != null) {
				String name = line.split(",")[0];
				int kor = Integer.parseInt(line.split(",")[1]);
				int eng = Integer.parseInt(line.split(",")[2]);
				int math = Integer.parseInt(line.split(",")[3]);
				int total = kor + eng + math;
				double avg = total / 3.0;
				if (avg < 60 || kor < 40 || eng < 40 || math < 40) {
					nonpass.add(name);
				} else {
					pass.add(name);
				}
			}
			reader.close();
			
			
			System.out.println("[합격자]");
			for (String name : pass) {
				System.out.println(name);
			}
			
			System.out.println("[불합격자]");
			for (String name : nonpass) {
				System.out.println(name);
			}
			
			
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
	}
}