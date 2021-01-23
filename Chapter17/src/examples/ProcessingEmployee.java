package examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployee {

	public static void main(String[] args) {
		Employee[] employees = {
				new Employee("Jason", "Red", 5000, "IT"),
				new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"),
				new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "sales"),
				new Employee("Wendy", "Brown", 4236.4, "Marketing")
		};
		
		List<Employee> list = Arrays.asList(employees);
		
		System.out.println("Complete Employee List: ");
		
		list.stream().forEach(System.out::println);
		
		//predicate that returns true for salaries in the range $4000 - $6000
		Predicate<Employee> fourToSixThousand = e ->(e.getSalary() >= 4000 && e.getSalary() <= 6000);

		System.out.printf("%nEmployees earning $4000-$6000 per month sorted by salary: %n");
		list.stream()
			.filter(fourToSixThousand)
			.sorted(Comparator.comparing(Employee::getSalary))
			.forEach(System.out::println);
		
		System.out.printf("%nFirst Employee who earns $4000-$6000: %n%s%n", 
				list.stream()
					.filter(fourToSixThousand)
					.findFirst()
					.get());
		
		//Function for getting first and last names from an employee
		Function<Employee, String> byLastName = Employee::getLastName;
		Function<Employee, String> byFirstName = Employee::getFirstName;
		
		//Comparator for comparing employees by first name then last name
		Comparator<Employee> lastNameThenFirstName = Comparator.comparing(byLastName)
				.thenComparing(byFirstName);
		
		//sort employees by last name, then first name
		System.out.printf("%nEmployees in ascending order: %n");
		list.stream().sorted(lastNameThenFirstName).forEach(System.out::println);
		
		System.out.printf("%nEmployees in descending order: %n");
		list.stream().sorted(lastNameThenFirstName.reversed()).forEach(System.out::println);
		
		//map employee by last name only
		System.out.printf("%nUnique employee last names: %n");
		list.stream().map(Employee::getLastName)
			.distinct().sorted().forEach(System.out::println);
		
		System.out.printf("%nEmployee names in order by last name then first name: %n");
		list.stream()
			.sorted(lastNameThenFirstName)
			.map(Employee::getName)
			.forEach(System.out::println);
		
		System.out.printf("%nEmployee in department: %n");
		Map<String, List<Employee>> groupedByDepartment = 
				list.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment));//returns the employee's department as a string which serves as the key in the map
		
		groupedByDepartment.forEach((department, employeesInDepartment) -> {
			System.out.println(department);
			employeesInDepartment.forEach(employee -> System.out.printf("    %s%n", employee));
		});
		
		System.out.printf("%nCount of employees by department: %n");
		Map<String, Long> employeeCountByDepartment = 
				list.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		employeeCountByDepartment.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));
		
		System.out.printf("%nSum of Employees' salaries (via sum method): %.2f", list.stream()
					.mapToDouble(Employee::getSalary)
					.sum());
		System.out.printf("%nSum of Employees; salaries (via reduce method): %.2f", list.stream()
					.mapToDouble(Employee::getSalary)
					.reduce(0, (value1, value2) -> value1 + value2));
		System.out.printf("%nAverage of employees' salaries: %.2f", list.stream()
					.mapToDouble(Employee::getSalary)
					.average().getAsDouble());
		
	}

}
