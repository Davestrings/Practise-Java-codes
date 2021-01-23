package chapter7;

public class GradeBook {
	private String courseName;
	private int[][] grade;

	public GradeBook(String course, int[][] mygrade) {
		this.courseName = course;
		this.grade = mygrade;
	}

	public GradeBook() {
		String course = "Chemistry";
		this.courseName = course;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int[][] getGrade() {
		return grade;
	}

	public void setGrade(int[][] grade) {
		this.grade = grade;
	}
	
	public void processGrade() {
//		outputGrades();
	}
}
