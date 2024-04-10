package Week03.HomeIoT;

import java.util.ArrayList;
import java.util.List;

public class Father implements Family{
    private String name = "아빠";
    private List<IoTObserver> iot;

    public Father() {
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
