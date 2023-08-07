package com.test.question.q106_2;

public class MyStack {
	
	private String[] stack;
	private int index;
	
	public MyStack() {
		this.index = 0;
		this.stack = new String[4];
	}
	
	public boolean push(String value) {
		try {
			if (this.index == this.stack.length) {
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
			System.out.println("at MyStack.push");
			e.printStackTrace();
			return false;
		}
	}
	
	public String pop() {
		if (this.index == 0) {
			throw new IndexOutOfBoundsException();
		}
		this.index--;
		String lastIn = this.stack[this.index];
		this.stack[this.index] = null;
		return lastIn;
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		if (this.index == 0) {
			throw new IndexOutOfBoundsException();
		}
		return this.stack[this.index - 1];
	}
	
	public void clear() {
		this.index = 0;
	}
	
	public void trimToSize() {
		if (this.index == this.stack.length) {
			return;
		}
		String[] newStack = new String[this.index];
		for (int i = 0; i < this.index; i++) {
			newStack[i] = this.stack[i];
		}
		this.stack = newStack;
	}
	
}
