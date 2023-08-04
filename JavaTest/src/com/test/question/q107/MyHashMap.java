package com.test.question.q107;

public class MyHashMap {

	private String[][] hashmap;
	private int index;
	
	public MyHashMap() {
		index = 0;
	}
	
//	public String put(String key, String value) {
//		
//		
//		for (int i = 0; i < this.index; i++) {
//			if (this.hashmap[i][0].equals(key)) {
//				String beforePut = this.hashmap[i][1];
//				this.hashmap[i][1] = value;
//				return beforePut;
//			}
//		}
//		return null;
//	}
//	
//	
	public String put(String key, String value) {
		if (this.index == 0) {
			hashmap = new String[4][2];
		} else if (this.index == this.hashmap.length) {
			String[][] newHashmap = new String[this.hashmap.length * 2][2];
			for (int i = 0; i < this.index; i++) {
				for (int j = 0; j < 2; j++	) {
					newHashmap[i][j] = this.hashmap[i][j];
				}
			}
			this.hashmap = newHashmap;
		}
		this.hashmap[this.index][0] = key;
		this.hashmap[this.index][1] = value;
		this.index++;
		
		return null;
	}
	
	public String get(String key) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.hashmap[i][0].equals(key)) {
				return this.hashmap[i][1];
			}
		}
		
		return null; 
	}
	
	public int size() {
		return index;
	}
	
	
	
	
	
	
	
	
}

 