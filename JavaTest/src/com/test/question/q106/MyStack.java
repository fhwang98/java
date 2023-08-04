package com.test.question.q106;

public class MyStack {

	private String[] stack;
	private int index;
	
	public MyStack() {
		this.index = 0;
	}
	
	public boolean push(String value) {
		
		try {
			
			if (this.index == 0) {
				stack = new String[4];
			} else if (this.index == this.stack.length) {
				String[] newStack = new String[this.stack.length * 2];
				for (int i = 0; i < this.index; i++) {
					newStack[i] = this.stack[i];
				}
				this.stack = newStack;
			}
			this.stack[this.index] = value;
			this.index++;
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public String pop() {
		this.index--;
		String lastIn = this.stack[this.index];
		this.stack[this.index] = null;
		return lastIn;
	}
	
	public int size() {
		return index;
	}
	
	public String peek() {
		return this.stack[this.index - 1];
	}
	
	public void  clear() {
		this.stack = new String[4];
		this.index = 0;
	}
	public void trimToSize() {
		if (this.index != this.stack.length) {
			String[] newStack = new String[this.index];
			for (int i = 0; i < this.index; i++) {
				newStack[i] = this.stack[i];
			}
			this.stack = newStack;
		}
	}
	
}
