package practise;

import java.util.logging.Logger;

public class Fish extends Animal {
	private Logger logger = Logger.getLogger(Fish.class.getName());
	
	public Fish(String name) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		logger.info("I'm swiming the ocean");
	}
}
