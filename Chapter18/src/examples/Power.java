package examples;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("result: %d", power(3,4));
	}
	public static int power(int base, int exponent) {
		int a = 1;
		
		if(exponent == 1) {
			return a * base;
		}else {
			a = a * base;
		}
		
		return power(base, exponent-1);
	}

}
