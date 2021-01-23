package observer;

public class StatisticsDisplay implements Observe, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp;
	private float averageTemp;
	private float totalTemp;
	private int tempNumber;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// displays the min, max, average and other statistical measurements
		System.out.printf("Average Temperature/ Max Temperature/ Min Temperature : %.2f / %.2f / %.2f%n ", averageTemp, maxTemp, minTemp);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		if(temp > maxTemp)
			maxTemp = temp;
		
		minTemp = maxTemp;
		if(temp < minTemp)
			minTemp = temp;
		
		tempNumber++;
		totalTemp += temp;
		averageTemp = totalTemp/tempNumber;
		
		display();
	}
	

}
