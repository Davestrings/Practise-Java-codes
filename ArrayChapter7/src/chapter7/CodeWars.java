package chapter7;
import java.util.Scanner;
import java.util.Arrays;

public class CodeWars {
	private static Scanner scan = new Scanner(System.in);
	static int row ;
	static int column;
	int[][] thearray;
	public static void main(String[] args) {
		System.out.print("Enter a number for row: ");
		row = scan.nextInt();
		System.out.print("Enter a number for column: ");
		column = scan.nextInt();
		int[][] thearray = new int[row][column];
		myArray(thearray);
		boolean gameWon = false;
		
		if(thearray[0][0] == thearray[0][1]) {
			if(thearray[0][1] == thearray[0][2]) {
				gameWon = true;
				System.out.println(gameWon);
			}
		}else if(thearray[1][0] == thearray[1][1]){
			if(thearray[1][1] == thearray[1][2]) {
				gameWon = true;
				System.out.println(gameWon);
			}
		}else if(thearray[2][0]== thearray[2][1]) {
			if(thearray[2][1] == thearray[2][2]) {
				gameWon = true;
				System.out.println(gameWon);
			}
		}else {
			System.out.println(gameWon);
		}
	}
	public static void myArray(int[][] thearray) {
		
		for(int i =0; i<thearray.length; i++) {
			for(int j= 0; j<thearray[i].length; j++) {
				System.out.println("Enter value");
				thearray[i][j] = scan.nextInt();
			}
		}
		
		for(int i= 0; i < thearray.length; i++) {
			for(int j= 0; j< thearray[i].length; j++) {
				System.out.printf("%d ",thearray[i][j]);
			}
			System.out.println();
		}
		
	}
}
