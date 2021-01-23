package examples;

import java.math.BigInteger;

public class RecursiveFactorial {

	public static void main(String[] args) {
		int number = 8;
		System.out.println(factorial(number));
		System.out.println(factorial(BigInteger.valueOf(number)));
	}
	public static long factorial(long n) {
		
		if(n < 0)
			return 1;
		else if(n == 1)
			return 1;
		else
			return n * factorial(n-1);
	} 
	public static BigInteger factorial(BigInteger n) {
		if(n.compareTo(BigInteger.ONE) <= 0)
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}
