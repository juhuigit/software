package Week03.HomeIoT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Family> family = new ArrayList<>();
        family.add(new Mother());
        family.add(new Father());

        IoTObserver smartTv = new SmartTv(family);
        IoTObserver smartSpeaker = new SmartSpeaker(family);

        family.forEach(s -> s.arrivedHome());
    }
}
