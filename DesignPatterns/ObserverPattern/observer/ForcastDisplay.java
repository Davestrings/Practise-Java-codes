package observer;

public class ForcastDisplay implements Observe, DisplayElement {
	private float prevPressure;
	private float currentPressure;
	private Subject weatherData;
	
	public ForcastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// display the forcast
		System.out.println();
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		prevPressure = currentPressure;
		currentPressure = pressure;
		if(currentPressure > prevPressure)
			System.out.println("Expect an improved weather");
		else if(currentPressure == prevPressure)
			System.out.println("More of the same");
		else
			System.out.println("Expect a cold and rainy weather");
		display();

	}

}
