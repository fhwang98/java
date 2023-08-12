package com.test.question.q106_2;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		//배열 생성
		MyStack stack = new MyStack();
		Stack<String> s = new Stack<String>();
		
		
		//System.out.println(s.pop()); // EmptyStackException
		//System.out.println(s.peek()); // EmptyStackException
		
		//추가
		System.out.println("MyStack");
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		System.out.println(stack.size());
		
		System.out.println("Stack");
		s.push("빨강");
		s.push("노랑");
		s.push("파랑");
		s.push("주황");
		s.push("검정");
		System.out.println(s.size());
		
		
		//읽기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		//개수
		System.out.println(stack.size());

		//확인
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());

		//크기 조절
		stack.trimToSize();

		//초기화
		stack.clear();
		System.out.println(stack.size());
	}

}
