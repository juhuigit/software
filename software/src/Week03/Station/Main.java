package Week03.Station;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.List;

class WeatherData implements Subject {

    // .. 인스턴스 변수 ..
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers; // Obsever 객체들을 저장하는 ArrayList 추가

    public WeatherData() {
        observers = new ArrayList<Observer>(); // 기본 생성자 실행 시 Observer 빈 리스트 생성
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void valueChanged() {
        notifyObserver(); // 갱신된 측정값을 받으면 옵저버들에게 알림

        // 기존 코드 삭제 부분
    }

    public void setValue(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        valueChanged();
    }
}

interface Subject {
    public void registerObserver(Observer o); // 옵저버 등록
    public void removeObserver(Observer o); // 옵저버 제거
    public void notifyObserver(); // 주제의 상태가 변경되었을 때 모든 옵저버에게 알리기 위한 호출
}

interface Observer {
    public void update(float temp, float humidity, float pressure);
}

class Display1 implements Observer { // weatherData 객체로부터 변경 사항을 받기 위해 Observer 구현이 필요함.
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public Display1(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // 객체 생성
        Display1 d1 = new Display1(weatherData); // 옵저버 신규 생성
        weatherData.setValue(80, 65, 30); // 새로운 기상값 측정
    }
}
