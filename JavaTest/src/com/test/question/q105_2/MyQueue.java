package com.test.question.q105_2;

public class MyQueue {

	private int index;
	private String[] queue;
	
	public MyQueue() {
		this.index = 0;
		this.queue = new String[4];
	}
	
	public boolean add(String value) {
		try {
			if (this.index == this.queue.length) {
				String[] newQueue = new String[this.queue.length * 2];
				for (int i = 0; i < this.index; i++) {
					newQueue[i] = this.queue[i];
				}
				this.queue = newQueue;
			}
			this.queue[this.index] = value;
			this.index++;
			return true;
			//try catch 결과적으로는 필요 없지만 만약 코드 설계가 잘못될 경우를 대비해서 try catch 감싸줌..
			
		} catch (Exception e) {
			System.out.println("at MyQueue.add");
			e.printStackTrace();
			return false;
		}
		
	}
	
	public String poll() {
		if (this.index == 0) {
			return null;
		}
		String firstIn = this.queue[0];
		for (int i = 0; i < this.index - 1; i++) {
			this.queue[i] = this.queue[i + 1];
		}
		this.index--;
		return firstIn;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		if (this.index == 0) {
			return null;
		}
		return this.queue[0];
	}
	
	public void clear() {
		this.index = 0;
	}
	
	public void trimToSize() {
		if (this.index == this.queue.length) {
			return;
		}
		String[] newQueue = new String[this.index];
		for (int i = 0; i < this.index; i++) {
			newQueue[i] = this.queue[i];
		}
		this.queue = newQueue;
	}
	
}
