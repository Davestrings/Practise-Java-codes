package observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observe> observers;
	private float temperature;
	private float pressure;
	private float humidity;
	
	public WeatherData(float temperature, float pressure, float humidity) {
		this.humidity =humidity;
		this.pressure = pressure;
		this.temperature = temperature;
	}
	public WeatherData() {
		observers = new ArrayList<Observe>();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}

	@Override
	public void registerObserver(Observe o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observe o) {
		int i = observers.indexOf(o);
		if(i>=0)
			observers.remove(i);
		
		//An alternative way to implement removeObserver
//		for(Observe j : observers) {
//			if(j.equals(o))
//				observers.remove(o);
//		}
		
	}

	@Override
	public void notifyObserver() {
		for(Observe obj : observers) {
			obj.update(temperature, humidity, pressure);
		}
		
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature =temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// other weatherData methods
}
