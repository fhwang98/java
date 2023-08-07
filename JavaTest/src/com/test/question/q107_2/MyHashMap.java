package com.test.question.q107_2;

public class MyHashMap {

	private String[] keys;
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.index = 0;
		this.keys = new String[4];
		this.values = new String[4];
	}
	
	public String put(String key, String value) {
		
		if (indexOfKey(key) > -1) {
			this.values[indexOfKey(key)] = value;
			return null;
		} else if (this.index == this.keys.length){
			String[] newKeys = new String[this.keys.length * 2];
			String[] newValues = new String[this.keys.length * 2];
			for (int i = 0; i < this.index; i++) {
				newKeys[i] = this.keys[i];
				newValues[i] = this.values[i];
			}
			this.keys = newKeys;
			this.values = newValues;
		}
		this.keys[this.index] = key;
		this.values[this.index] = value;
		this.index++;
		 
		return null;
		
	}

	private int indexOfKey(String key) {
		for (int i = 0; i < this.index; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public int size() {
		return this.index;
	}
	
	public String get(String key) {
		if (indexOfKey(key) == -1) {
			//map 없는 값 넣었을때 에러 없이 null 반환
			return null;
		}
		return this.values[indexOfKey(key)];
	}
	
//	public String remove(String key) {
//		
//	}
//	
	
	
}
