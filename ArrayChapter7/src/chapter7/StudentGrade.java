package chapter7;

public class StudentGrade {
	private int[] arrayOfGradesCollected = {2, 8, 8, 1, 20};

	public void setStudentGrade(int[] arrayOfGrades) {
		
		arrayOfGradesCollected = arrayOfGrades;
	}

	public int[] getStudentGrade() {
		return arrayOfGradesCollected;
		
	}

	public double getAverage() {
		return (double)addGrades()/ arrayOfGradesCollected.length;
		
	}

	public int addGrades() {
		int sum = 0;
		for(int grade: arrayOfGradesCollected) {
			sum = sum + grade;
		}
		return sum;
	}

	public int maxScore() {
		int highest = 0;
		for(int grade : arrayOfGradesCollected) {
			if(grade > highest)
				highest = grade;
		}
		return highest;
	}

	public int minScore() {
		int lowest = maxScore();
		for(int grade : arrayOfGradesCollected) {
			if(grade < lowest)
				lowest = grade;
		}
		return lowest;
	}

}
