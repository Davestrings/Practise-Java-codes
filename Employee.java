import java.util.Scanner;
public class Employee{
	private String lastName;
	private String firstName;
	private String role;
	private double salary;

	public Employee(String myLastName, String myFirstName, String myRole, double mySalary){
		this.lastName = myLastName;
		this.firstName = myFirstName;
		this.role = myRole;
		this.salary = mySalary; 
	}

	public Employee(){

	}

	Scanner takeInput = new Scanner(System.in);
	public void setFirstName(){
		System.out.print("Enter your first name ");
		String myFirstName = takeInput.nextLine();
		
		firstName = myFirstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(){
		System.out.print("Enter your last name: ");
		String myLastName = takeInput.nextLine();
		
		lastName = myLastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setRole(){
		System.out.print("Enter your role in this organization: ");
		String myRole = takeInput.nextLine();

		role = myRole;
	}

	public String getRole(){
		return role;
	}


	public void setSalary(){
		System.out.print("Enter your monthly salary: ");
		double mySalary = takeInput.nextDouble();
		if(mySalary > 0.0)
			salary = mySalary;
	}

	public double getSalary(){
		return salary;
	}
	public double getAnnualSalary(){
		double salary = (getSalary() *12);
			return salary;
	}


	public double getRaise(){
		double raise = getSalary() + ((10 * getSalary())/ 100);
		return raise;
	}

}