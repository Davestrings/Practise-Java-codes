package practise;

public enum Wing {
	LEFT_BIG_WING(4),
	RIGHT_BIG_WING(4),
	LEFT_SHORT_WING(2),
	RIGHT_SHORT_WING(2);
	
	private int size;
	
	public void setWingSize(int wingSize) {
		this.size = wingSize;
	}
	public int getWingSize() {
		return size;
	}
	// wing constructor method
	private Wing(int Size) {
		this.size = Size;
	}

}
