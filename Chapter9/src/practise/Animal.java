package practise;

public class Animal {
	private String name;
	private double weight;
	private Color color;
	protected static int lifeSpan;
	private int xCoordinate;
	private int yCoordinate;
	
	public Animal(String animalName, double animalWeight, Color color) {
		name = animalName;
		weight = animalWeight;
		this.color = color;
	}
	public Animal() {
		
	}
	public Animal(String animalName) {
		
	}
	public Animal(String animalName, double animalWeight ) {
		
	}
	
	
	
	public void move() {
		System.out.println("This animal is on the move...");
	}
//	public void sound() {
//		
//	}

	public int getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public static int getLifeSpan() {
		return lifeSpan;
	}
	public static void setLifeSpan(int lifeSpan) {
		Animal.lifeSpan = lifeSpan;
	}

}
