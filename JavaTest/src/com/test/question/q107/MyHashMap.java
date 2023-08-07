package com.test.question.q107;

public class MyHashMap {

	private String[] keys;
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.index = 0;
	}
	
	public String put(String key, String value) {
		 if (indexOfKey(key) > -1) {
			this.values[indexOfKey(key)] = value;
			return null;
		} else if (this.index == 0) {
			this.keys = new String[4];
			this.values= new String[4]; 
		} else if (this.index == this.keys.length) {
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
		if (indexOfKey(key) >  -1) {
			return this.values[indexOfKey(key)]; 
		} else {
			return null;
		}
	}
	
	public String remove(String key) {
		if (indexOfKey(key) > -1) {
			String origin = this.values[indexOfKey(key)];
			for (int i = indexOfKey(key); i < this.index; i++) {
				this.keys[i] = this.keys[i + 1];
				this.values[i] = this.values[i + 1];
			}
			this.index--;
			
			return origin;
		} else {
			return null;
		}
	}
	
	
	public boolean containsKey(String key) {
		if (indexOfKey(key) > -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean containsValue(String value) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	public void trimToSize() {
		if (this.index != this.keys.length) {
			String[] newKeys = new String[this.index];
			String[] newValues = new String[this.index];
			for (int i = 0; i < this.index; i++) {
				newKeys[i] = this.keys[i];
				newValues[i] = this.values[i];
			}
			this.keys = newKeys;
			this.values = newValues;
		}
	}
}

 