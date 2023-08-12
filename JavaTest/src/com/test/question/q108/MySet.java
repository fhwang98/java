package com.test.question.q108;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySet {

	private String[] set;
	private int index;
	private int iterIndex;
	
	public MySet() {
		this.index = 0;
		this.iterIndex = 0; // 한바퀴만 도는 인덱스 ... 
		this.set = new String[4];
	}

	public boolean add(String value) {
		if (getIndex(value) > -1) { //value 있다
			return false;
		} else if (this.index == this.set.length) {
			doubleLength();
		}
		this.set[this.index] = value;
		this.index++;
		
		return true;
	}

	public void doubleLength() {
		String[] newSet = new String[this.set.length * 2];
		for (int i = 0; i < this.set.length; i++) {
			newSet[i] = this.set[i];
		}
		this.set = newSet;
	}

	
	public int size() {
		return this.index;
	}
	
	public boolean remove(String value) {
	
		if (getIndex(value) == -1) { //value 없다
			return false;
		}
		
		//삭제 Left Shift
		//시작 위치 value의 index부터
		for (int i = getIndex(value); i < this.index - 1; i++) {
			this.set[i] = this.set[i + 1];
		}
		this.index--;
		
		return true;
		
	}

	private int getIndex(String value) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.set[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}

	public void clear() {
		this.index = 0;
	}
	
	
	//어려워요 ... 
	public boolean hasNext() {
		//다음 요소가 있으면 true 없으면 false 반환
		if (this.iterIndex == this.index) {
			return false;
		}
		return true;
	}
	
	public String next() {
		//다음 요소가 없으면 NoSuchElementException
		//반환값 : 다음 요소
		if (this.iterIndex == this.index) { //this.index까지 한바퀴 다 돌았다
			throw new NoSuchElementException();
		}
		return this.set[this.iterIndex++]; //값 반환하고 인덱스 하나 올려줌
				
	}
	
	@Override
	public String toString() {
		return "MySet [set=" + Arrays.toString(set) + ", index=" + index + "]";
	}
	
}
