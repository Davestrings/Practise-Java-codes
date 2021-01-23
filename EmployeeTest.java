public class EmployeeTest{
	public static void main(String[] args){
		Employee James = new Employee("Madu", "Chinelu", "Supervisor", 35000.569);
		Employee Dammy = new Employee();
		Employee Peter = new Employee();


		System.out.printf("%s %s, your salary is $%.3f", James.getFirstName(), James.getLastName(), James.getSalary());



		System.out.println();
		James.setFirstName();
		James.setLastName();
		James.setSalary();

		
		System.out.printf("Your anual salary is $%.3f%n",  James.getAnnualSalary());
		System.out.print(James.getRaise());

		System.out.println();

		Dammy.setRole();
		Dammy.setLastName();
		Dammy.setFirstName();
		Dammy.setSalary();

		System.out.printf("%s %s Your anual salary is $%.3f%n",Dammy.getLastName(), Dammy.getFirstName(),  Dammy.getAnnualSalary());
		
		System.out.printf("Your role '%s' attracts this pay raise: $%.3f%n", Dammy.getRole(), Dammy.getRaise());
	}
}