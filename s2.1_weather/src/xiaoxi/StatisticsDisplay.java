package xiaoxi;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float max = -999;
	private float min = 999;
	private float sum = 0;
	private float count = 0;
	private float avg = 0;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Max/Min/Avg:" + max + "/" + min + "/" + avg);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		count ++;
		sum += temperature;
		
		if(max < temperature)
			max = temperature;
		if(min > temperature)
			min = temperature;
		if(count!=0)
			avg = sum / count;
		
		display();
	}

}
