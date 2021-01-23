package beverages;

public class StarbuzzCoffeeShop {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//when a customer orders a DarkRoast with two shots of Mocha and whip
		
		Beverage beverage2 = new DarkRoast();// make a DarkRoast object
		beverage2 = new Mocha(beverage2); //wrap it with a Mocha
		beverage2 = new Mocha(beverage2); // wrap it in a second Mocha
		beverage2 = new Whip(beverage2); //wrap it in a whip
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		//Another customer orders HousBlend with Soy, Mocha and Whip
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
	}
}
