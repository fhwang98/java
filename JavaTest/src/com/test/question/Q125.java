package com.test.question;

import java.io.FileReader;
import java.util.Stack;

public class Q125 {

	public static void main(String[] args) {
		//Stack활용
		//한글자씩 read()
		//여는 괄호('(', '{')를 만나면 스택에 쌓는다
		//닫는 괄호(')', '}')를 만나면 쌓인 스택을 꺼낸다 -> 둘이 짝이 맞는지 확인
		//짝이 맞지 않으면 올바르지 않은 소스
		
		try {
			
			FileReader reader = new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\Q110.java");
			Stack<Character> stack = new Stack<Character>();
			
			int code = -1;
			
			while ((code = reader.read()) != -1) {
				if (code == '(' || code == '{') { //여는 괄호를 만나면 스택에 쌓는다
					stack.add((char)code);
				} else if (code == ')' || code == '}') { //닫는 괄호를 만나면 확인한다
					if (stack.pop() == '(' && code == ')') {
						continue;
					} else if (stack.pop() == '(' && code == '}') {
						System.out.println("안맞음");
						break;
					} else if (stack.pop() == '{' && code == '}') {
						continue;
					} else if (stack.pop() == '{' && code == ')') {
						System.out.println("안맞음");
						break;
					}
				}
			}
			
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q125.main");
			e.printStackTrace();
		}
	}
}
