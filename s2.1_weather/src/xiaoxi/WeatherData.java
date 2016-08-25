package xiaoxi;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	//����һ��ArrayList����¼�۲��ߣ���ArrayList���ڹ������н�����
	public WeatherData() {
		observers = new ArrayList();
	}

	//ע��۲���
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//�Ƴ��۲���
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > 0) {
			observers.remove(i);
		}
	}

	//�������״̬����ÿһ���۲��ߣ��۲��߶�ʵ����update()
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	//�õ�����ֵʱ��֪ͨ�۲��߷���
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
