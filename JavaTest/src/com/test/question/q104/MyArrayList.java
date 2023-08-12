package com.test.question.q104;


public class MyArrayList {
	
	
	private String[] list;
	//문자열 배열이라는 가정으로 만듦 ArrayList<String>
	private int index;//**********
	
	public MyArrayList() {
		this.index = 0;
		this.list = new String[4];
	}
	
	public boolean add(String value) {
		
		try {
			
			//배열의 방이 남아있는지? > 있으면 ...
			//					> 없으면... > 두배로 늘리기!
			
			if (this.index == this.list.length) {
				//새로운 배열 생성
				String[] newList = new String[this.list.length * 2];
				//딥카피
				for (int i = 0; i < this.index; i++) {
					newList[i] = this.list[i];
				}
				this.list = newList;
				
			}
			
			this.list[this.index] = value;
			this.index++;
			return true;
			
		} catch (Exception e) {
			
			return false;
			
		}
		
	}
	
	public String get(int index) {
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
		}
		return this.list[index];
		
	}
	
	public int size() {
		return this.index;
	}
	
	public String set(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
		}
		
		String beforeSet = this.list[index];
		
		this.list[index] = value;
		
		return beforeSet;
	}
	
	public String remove(int index) {
		
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
		}
		
		String beforeRemove = this.list[index];
		
		
		for (int i = index; i < this.index - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.index--;
		
		return beforeRemove;
	}
	
	public boolean add(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
		}
	
		try {
			
			for (int i = this.index - 1; i > index; i--) {
				this.list[i] = this.list[i - 1];
			}
			
			this.list[index] = value;
			
			this.index++;
			
			return true;
		} catch (Exception e) {
			System.out.println("at MyArrayList.add");
			e.printStackTrace();
			return false;
		}
		
		
		
	}
	
	public int indexOf(String value) {
	
		for (int i = 0; i < this.index; i++) {
			
			if(this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(String value) {
	
		for (int i = this.index - 1; i >= 0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		
		this.list = new String[4];
		this.index = 0;
		
	}
	
	public void trimToSize() {
		if (this.index != this.list.length) {
			String[] newList = new String[this.index];
			for (int i = 0; i < this.index; i++) {
				newList[i] = this.list[i];
			}
			this.list = newList;
		}
	}
	
	
}
