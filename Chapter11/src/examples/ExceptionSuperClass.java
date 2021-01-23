package examples;

public class ExceptionSuperClass extends Exception{
	public ExceptionSuperClass() {
		
	}
	public ExceptionSuperClass(String message) {
		super(message);
	}
	public ExceptionSuperClass(String message, Throwable thrown) {
		super(message, thrown);
	}
	public ExceptionSuperClass(Throwable thrown) {
		super(thrown);
	}
}
