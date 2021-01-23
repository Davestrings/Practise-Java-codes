package practise;

import java.util.logging.Logger;

public class Cat extends Animal {
	private Logger logger = Logger.getLogger(Cat.class.getName());
	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		logger.info("Pouncing away...");
	}
}
