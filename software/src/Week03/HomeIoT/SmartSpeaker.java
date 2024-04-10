package Week03.HomeIoT;

import java.util.List;

public class SmartSpeaker implements IoTObserver {
    public SmartSpeaker(List<Family> f) {
        f.forEach(s -> s.useIoT(this));
    }

    @Override
    public void HelloGenie() {
        System.out.println("스피커가 재생되었습니다.");
    }
}
