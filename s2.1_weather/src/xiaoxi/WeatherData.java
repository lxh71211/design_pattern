package xiaoxi;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	//加上一个ArrayList来记录观察者，此ArrayList是在构造器中建立的
	public WeatherData() {
		observers = new ArrayList();
	}

	//注册观察者
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//移除观察者
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
		}
	}

	//在这里把状态告诉每一个观察者，观察者都实现了update()
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	//得到更新值时，通知观察者方法
	public void measurementsChanged() {
		notifyObservers();
	}
	
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
