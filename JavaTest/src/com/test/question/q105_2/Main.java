package com.test.question.q105_2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<String>();
		
		//배열 생성
		MyQueue queue = new MyQueue();

		System.out.println(q.peek()); //비어있을때 null
		System.out.println(q.poll()); //비어있을때 null
		
		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		
		q.add("빨강");
		q.add("노랑");
		q.add("파랑");
		q.add("주황");
		q.add("검정");

		//읽기
		System.out.println("myqueue: " + queue.poll());
		System.out.println("myqueue: " + queue.poll());
		System.out.println("myqueue: " + queue.poll());
		
		System.out.println("queue: " + q.poll());
		System.out.println("queue: " + q.poll());
		System.out.println("queue: " + q.poll());
		
		//개수
		System.out.println("myqueue: " + queue.size());
		System.out.println("queue: " + q.size());
		
		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

		//크기 조절
		queue.trimToSize();

		//초기화
		queue.clear();
		System.out.println(queue.size());
		
	}

}
