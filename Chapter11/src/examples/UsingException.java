package examples;

public class UsingException {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception exception) {
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();
			StackTraceElement[] traceElement = exception.getStackTrace();
			System.out.printf("%n StackTrace from getStackTrace%n");
			System.out.println("Class \t\t\tFile\t\t\tLine\tMethod\n");
			
			for(StackTraceElement element : traceElement) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
				
				
			}
		}
		
	}

	public static void method1() throws Exception {
		method2();
		
	}

	public static void method2() throws Exception {
		method3();
		
	}

	public static void method3() throws Exception {
		throw new Exception("Exception thrown in method3");
		
	}

}
