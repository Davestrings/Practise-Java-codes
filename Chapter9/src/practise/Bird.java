package practise;

import java.util.logging.Logger;

public class Bird extends Animal {
	private Logger logger = Logger.getLogger(Bird.class.getName());
	private Wing leftWing;
	private Wing rightWing;
	private boolean flyer;
	
	

	public boolean isFlyer() {
		return flyer;
	}
	public void setFlyer(boolean flyer) {
		this.flyer = flyer;
	}
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bird(String name) {
		super();
		this.setName(name);
		// TODO Auto-generated constructor stub
	}
	public Bird(String name, double animalWeight) {
		super( name, animalWeight);
		// TODO Auto-generated constructor stub
	}

	public Wing getLeftWing() {
		return leftWing;
	}

	public void setLeftWing(Wing leftWing) {
		this.leftWing = leftWing;
	}

	public Wing getRightWing() {
		return rightWing;
	}

	public void setRightWing(Wing rightWing) {
		this.rightWing = rightWing;
	}
	
	@Override
	public void move() {
		logger.info("I'm flapping my wings...");
		
	}
	
	
}
