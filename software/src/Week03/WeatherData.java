package Week03;

// 기상 스테이션용 코드 추가하기 P.78
public class WeatherData {

    // 인스턴스 변수 선언

    public void measurementsChanged() {

        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

//        아래 부분은 구체적인 구현에 맞춰서 코딩했으므로,
//        프로그램을 고치지 않고는 다른 디스플레이 항목을 추가하거나 제거할 수 없음.
//        따라서 해당 부분은 바뀔 수 있는 부분으로 캡슐화 할 필요가 있음.
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    // 기타 메소드
}
