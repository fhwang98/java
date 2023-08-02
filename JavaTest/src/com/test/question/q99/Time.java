package com.test.question.q99;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public Time() {
		this(0, 0, 0);
	}
	
	public Time(int hour, int minute, int second) {
		if (hour >= 0 && minute >= 0 && second >= 0) {
			
			if (second > 60) {
				this.second = second % 60;
				minute += second / 60;
			} else {
				this.second = second;
			}
			
			if (minute > 60) {
				this.minute = minute % 60;
				hour += minute / 60;
			} else {
				this.minute = minute;
			}
			this.hour = hour;
		}
	}
	
	public Time(int minute, int second) {
		this(0, minute, second);
	}
	
	public Time(int second) {
		this(0, 0, second);
	}
	
	public String info() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
}