package Iterators;

public class NumberPyramid3 {

	public static void main(String[] args) {
		
		for(int count = 1; count<=5;count++) {
			for(int count2 = 5; count2>=count; count2--) {
				System.out.print("*");
			}
			for(int count3 = 1; count3 <= count; count3++) {
				System.out.print(count - count3 + 1);
			}
			for(int count4 = 2; count4 <= count; count4++) {
				System.out.print(count4);
			}
			System.out.println();
		}

	}

}
