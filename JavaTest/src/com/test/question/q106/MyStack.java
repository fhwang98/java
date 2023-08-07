//코드리뷰
//배열이 비어있을 때 pop(), peek() 호출할 경우 에러 처리가 이루어지지 않아 이 부분 개선이 필요할 것 같습니다.
//팀원분 피드백
//1. push() 에서 try_catch 를 사용한 이유를 모르겠어요! catch로 넘어가는 경우가 있는지?
// -> 고민해보지 않고 작성한 부분이라 반성이 됐습니다..!! 
//2. trimToSize()에서
//if (this != this.stack.length) 로 전체 구문을 묶는 것보다
//if (this.index == this.stack.length) {return;}
//두 값이 같은 경우 바로 리턴해주는 방식이 더 좋을 것 같다는 피드백이 있었습니다.

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
		return this.index;
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
