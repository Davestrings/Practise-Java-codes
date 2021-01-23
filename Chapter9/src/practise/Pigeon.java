package practise;

import java.util.logging.Logger;

public class Pigeon extends Bird {
	private Logger logger = Logger.getLogger(Bird.class.getName());
	public Pigeon() {
		
	}

	public Pigeon(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		logger.info("I'm flapping away...");
	}
	
}
