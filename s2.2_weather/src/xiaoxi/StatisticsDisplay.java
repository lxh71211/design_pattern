package xiaoxi;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private float max = -999;
	private float min = 999;
	private float sum = 0;
	private float count = 0;
	private float avg = 0;
	
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Max/Min/Avg:" + max + "/" + min + "/" + avg);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			count ++;
			sum += this.temperature;
			
			if(max < this.temperature)
				max = this.temperature;
			if(min > this.temperature)
				min = this.temperature;
			if(count!=0)
				avg = sum / count;
			
			display();		
		}
	}

}
