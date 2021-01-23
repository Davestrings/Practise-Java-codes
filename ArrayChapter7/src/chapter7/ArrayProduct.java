package chapter7;

public class ArrayProduct {
	public static int product(int...numbers) {
		int product = 1; 
		for(int  num = 0 ; num < numbers.length; num++) {
			product *= numbers[num];
		}
		return product;
			
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 15;
		int num4 = 16;
		int[] num5 = {2,4};
		int[] num6 = {1, 2, 3};
		
		System.out.println(product(num1, num2));
		System.out.println(product(num1, num2, num3));
		System.out.println(product(num1, num2, num3, num4));
		System.out.println(product(num5));
		System.out.println(product(num6));

	}

}
