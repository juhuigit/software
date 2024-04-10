package Week03.HomeIoT;

import java.util.ArrayList;
import java.util.List;

public class Mother implements Family{
    private String name = "엄마";
    private List<IoTObserver> iot;

    public Mother() {
        iot = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void useIoT(IoTObserver i) {
        iot.add(i);
    }

    @Override
    public void removeIoT(IoTObserver i) {
        iot.remove(i);
    }

    @Override
    public void arrivedHome() {
        System.out.println(this.getName() + "가 집에 왔습니다.");
        iot.forEach(s -> s.HelloGenie());
    }
}
