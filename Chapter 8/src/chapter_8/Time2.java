package chapter_8;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		this(0, 0, 0);
	}

	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute) {
		this(hour, minute, 0);
		
	}
	public Time2(int hour, int minute, int second) {
		if(hour < 0|| hour >=24)
			throw new IllegalArgumentException("hour should between 0 - 24");
		if(minute < 0 || minute > 59)
			throw new IllegalArgumentException("minute should be between 0 - 59");
		if(second < 0 || second > 59)
			throw new IllegalArgumentException("seconds should be between 0 - 59");
		
		this.hour = hour * 3600;
		this.minute = minute * 60;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(hour < 0 || hour >=24)
			throw new IllegalArgumentException("Hour should be between 0 - 24");
		this.hour = hour * 3600;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute < 0 || minute > 59)
			throw new IllegalArgumentException("Minute should be between 0 - 59");
		this.minute = minute * 60;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0 || second > 59)
			throw new IllegalArgumentException("Seconds should be between 0 - 59");
		this.second = second;
	}
	
	public int getTimeAsSeconds() {
		int seconds = getHour() + getMinute() + getSecond();
		return seconds;
	}
	public String toString() {
		return String.format("%,10d", getTimeAsSeconds());
	}

}
