package chapter_8;

public enum Book {
	//enum constants
	JHTP("Java How to Program", "2015"),
	CHTP("C How to Program", "2013"),
	IW3HTP("Internet & World Wide Web How to Program", "2012"),
	CPPHTP("C++ How to Program", "2014"),
	VBHTP("Visual Basic How to Program", "2014"),
	CSHARPHTP("Visual C# How to Program", "2014");
	
	// instance field
	private final String title;
	private final String copyrightYear;
	
	//enum constructor
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}
	
	//accessor methods
	public String getTitle() {
		return title;
	}
	public String getCopyrightYear() {
		return copyrightYear;
	}
	
	
	
}
