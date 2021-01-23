import java.util.Scanner;
public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		int hourlyRate = 20;
		int overTimeRate = 30;
		int normalPay;
		int employee = 1;
		int grossSalary = 0;
		int salary;
		
		while (employee <= 3) {
			System.out.print("Enter hours worked: ");
			int hour = Input.nextInt();
				if (hour > 40) {
					normalPay = 40 * hourlyRate;
					int overTimePay = (hour - 40) * overTimeRate;
					salary = normalPay + overTimePay;
				}else {
					normalPay = 40 * hourlyRate;
					salary = normalPay;
				}
				System.out.println("$" + salary);
			grossSalary += salary;
			++employee;
		}
		System.out.printf("Employee gross salary is $%d%n", grossSalary);
	}

}
