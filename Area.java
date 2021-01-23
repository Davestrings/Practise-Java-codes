//Exercise 2.28


import java.util. Scanner;
import java.lang.Math;
public class Area{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int r;
		int diameter;
		double area;
		double circumference;

		System.out.print("Enter the value of radius ");
		r = scan.nextInt();
		diameter = r * r;
		circumference = 2 * r * Math.PI;
		area =  r * r * Math.PI ;

		System.out.println("Area is: " + area);
		System.out.println("Circumference is: " + circumference);
		System.out.println("Diameter is: " + diameter);
	}
}