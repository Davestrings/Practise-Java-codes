package beverages;
/**
 * Super class for coffees classes (Decaf, Espresso, HouseBlend and DarkRoast).
 * This is aimed at implementing decorator pattern.
 * 
 * */

public abstract class Beverage {
	String description = "Unknown beverage";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
