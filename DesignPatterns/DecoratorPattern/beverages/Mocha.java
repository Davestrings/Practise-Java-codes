package beverages;
/**
 * Mocha is a decorator, so it extends ocndimentDecorator
 * */

public class Mocha extends CondimentDecorator {
	Beverage beverage; // instance variable to hold the beverage we are wrapping
	
	public Mocha(Beverage beverage) {
		/*
		 * A way to set this instance variable to the object we are wrapping
		 * we are going to pass the beverage we are wrapping to the ddecorator's constructor.
		 * */
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		/**
		 * we want our description to not only include the beverage - say "Dark Roast" -
		 * but also to include each item decorating the beverage (for instance, "Dark Roast, Mocha").
		 * */
		return beverage.getDescription() + ", Moncha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .20;
	}

}
