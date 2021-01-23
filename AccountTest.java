import java.util. Scanner;

public class AccountTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account(" jean Green");
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		System.out.println("Please enter a name:");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
		System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
	}
}
class Account{
	private String name;   //instance variable

	// method to set the name in the object
	public Account(String name){
		this.name = name;
	}
	public void setName(String name){

		this.name = name; //store the name
	}

	// method to retrieve the name from the object
	public String getName(){

		return name; // return value of name to caller
	}
}