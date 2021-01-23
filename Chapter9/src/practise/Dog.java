package practise;

import java.util.logging.Logger;

public class Dog extends Animal {
	private Logger logger = Logger.getLogger(Dog.class.getName());
	public Dog(String name) {
		super();
		this.setName("Bingo");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void move() {
		logger.info("Dog is running away");
	}
	

}
