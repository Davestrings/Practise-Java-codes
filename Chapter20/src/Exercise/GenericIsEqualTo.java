package Exercise;

public class GenericIsEqualTo {
	private static <T> boolean isEqualTo(T value1, T value2) {
		if(value1.equals(value2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String name = "david";
		String fName = "jenny lind";
		
		Integer number = 90;
		Integer newNumber = 90;
		
		System.out.println(isEqualTo(name, fName));
		System.out.println(isEqualTo(number, newNumber));
	}

}
