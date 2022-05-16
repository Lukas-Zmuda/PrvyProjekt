package edu.oop.zaklady;

public class MyTime {
	
	//modifikatory pristupu
	//public, private, protected, ziaden
	
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second){
		setTime(hour, minute, second);
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		if(hour > -1 && hour < 24) {
			this.hour = hour;
		}else {
			this.hour = 0;
		}
	}
		
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute > -1 && minute < 60) {
			this.minute = minute;
		}else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second > -1 && second < 60) {
			this.second = second;
		}else {
			this.second = 0;
		}	
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);	
	}
	
	public String toString() {
		String cas = "";
		cas += (hour < 10)? "0" + this.hour: "" + this.hour;
		cas += ":";
		cas += (minute < 10)? "0" + this.minute: "" + this.minute;
		cas += ":";
		cas += (second < 10)? "0" + this.second: "" + this.second;
		return cas;
	}
}