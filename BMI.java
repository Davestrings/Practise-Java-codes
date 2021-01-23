import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);

		double height;
		double weight;
		double BMI;

		System.out.print("Enter your height in meters: ");
		height = value.nextDouble();

		System.out.print("Enter your weight in kg: ");
		weight = value.nextDouble();

		BMI = weight/ (height * height);

		System.out.println("Your BMI value is " + BMI);
		System.out.println();
		System.out.println("BMI VALUES \n Underweight: less than 18.5 \n Normal: between 18.5 and 24.9\n Overweight: between 25 and 29.9 \n Obese: 30 or greater");
		System.out.printf("value of %f + %f is %f%n", height, weight,(weight + height));
	}
}