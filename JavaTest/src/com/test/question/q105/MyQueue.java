package com.test.question.q105;

public class MyQueue {
	
	private String[] queue;
	private int index;
	
	public MyQueue() {
		this.index = 0;
	}
	
	public boolean add(String value) {
		try {
			
			if (this.index == 0) {
				this.queue = new String[4];
			} else if (this.index == this.queue.length){
				
				String[] newQueue = new String[this.queue.length * 2];
				for (int i = 0; i < this.index; i++) {
					newQueue[i] = queue[i];
				}
				this.queue = newQueue;
				
			}
			
			
			this.queue[this.index] = value;
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			System.out.println("at MyQueue.add");
			e.printStackTrace();
			return false;
		}
	}
	
	public String poll() {
		//인덱스 0 에 있는 값을 꺼내고 시프트, 인덱스--
		//리턴하기 위해 값을 기억해야...
		
		String first = this.queue[0];
		for (int i = 0; i < this.index - 1; i++) { //삭제 
			queue[i] = queue[i + 1];
		}
		this.index--;
		return first;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.queue[0];
	}
	
	public void clear() {
		this.queue = new String[4];
		this.index = 0;
	}
	
	public void trimToSize() {
		if (this.index != this.queue.length) {
			String[] newQueue = new String[this.index];
			for (int i = 0; i < this.index; i++) {
				newQueue[i] = queue[i];
			}
			this.queue = newQueue;
		}
	}
}
