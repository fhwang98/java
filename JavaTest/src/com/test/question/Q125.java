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
				} else if (code == ')') { //닫는 괄호를 만났는데
					if (stack.size() == 0) { //스택이 비어있다
						System.out.println("안맞");
						break;
					}
					if (stack.pop() == '{') { //짝이 안맞는다
						System.out.println("안맞");
						break;
					}
				} else if (code == '}') {
					if (stack.size() == 0) {
						System.out.println("안맞");
						break;
					}
					if (stack.pop() == '(') {
						System.out.println("안맞");
						break;
					}
				}
			}
			
			System.out.println(stack);
			if (code == -1 && stack.size() == 0) {
				System.out.println("맞음!!");
			}
			
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at Q125.main");
			e.printStackTrace();
		}
	}
}
