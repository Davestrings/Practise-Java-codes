import java.util.Scanner;
public class Employee{
	private String lastName;
	private String firstName;
	private String role;
	private double salary;

	public Employee(String lastName, Stinng firstName, String role, double salary){
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary; 
	}

	Scanner takeInput = new Scanner(System.in);
	public void setFirstName(){
		System.out.print("Enter your first name ");
		String myFirstName = takeInput.nextLine;
		
		firstName = myFirstname;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(){
		System.out.print("Enter your last name ");
		String myLastName = takeInput.nextLine;
		
		lastName = myLastName;
	}

	public String getLastName(){
		return lsatName;
	}

	public void setRole(){
		System.out.print("Enter your role in this organization ");
		String myRole = takeInput.nextLine;

		role = myRole;
	}

	public String getRole(){
		return role;
	}

	public void setSalary(){
		System.out.print("Enter your monthly salary ");
		double mySalary = takeInput.nextdouble();
		if(mySalary > 0.0)
			salary = mySalary;
	}
}