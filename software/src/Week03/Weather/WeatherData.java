package Week03.Weather;

import java.util.*;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
//            observer.update(temperature, humidity, pressure);
            observer.update(); // pull 방식으로 변경
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // 인스턴스 변수 선언

//    public void measurementsChanged() {
//
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();
//
////        아래 부분은 구체적인 구현에 맞춰서 코딩했으므로,
////        프로그램을 고치지 않고는 다른 디스플레이 항목을 추가하거나 제거할 수 없음.
////        따라서 해당 부분은 바뀔 수 있는 부분으로 캡슐화 할 필요가 있음.
//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
//    }

    // 기타 메소드
}
