package Iterators;

public class NumberPyramid2 {

	public static void main(String[] args) {
		int num =1;
		
		for(int count = 1; count <= 5; count++) {
			for(int count2 = 5;count2>=count;count2--) {
				System.out.print(" ");
			}
			for(int count3= num; count3 > 1; count3--) {
				System.out.print(count3);
			}
			for(int count4 = 1; count4 <= num; count4++) {
				System.out.print(count4);
			}
			
			System.out.println();
			num++;
		}

	}

}
