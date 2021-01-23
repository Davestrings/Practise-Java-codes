/**
 * 
 */
package accounts;

/**
 * @author USER
 *
 */
import java.util.Scanner;
public class SphereVolume {

	/**
	 * @param args
	 */
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		sphereVolume(radius());
		
	}
	public static double sphereVolume(double radius) {
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		System.out.printf("Volume of the sphere is %f%n", volume);
		return volume;
	}
	public static double radius() {
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		return radius;
	}

}
