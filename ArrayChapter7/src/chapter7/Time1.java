package chapter7;



public class Time1 {
	private int hour;
	private int minute;
	private int seconds;

	public void setTime(int hour, int minute, int seconds) {
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || seconds < 0 || seconds >= 60) {
			throw new IllegalArgumentException("Hour, Minute and/or Second is out of range");
		}else {
			this.hour = hour;
			this.minute = minute;
			this.seconds = seconds;
		}
		
	}

	public Time1() {
		
	}
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, seconds);
	}
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0|| hour == 12) ? 12 : hour %12), minute,seconds, (hour < 12 )? "AM": "PM");
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}



}
