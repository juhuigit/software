package Week03.HomeIoT;

import java.util.List;

public class SmartTv implements IoTObserver {

    public SmartTv(List<Family> f) {
        f.forEach(s -> s.useIoT(this));
    }

    @Override
    public void HelloGenie() {
        System.out.println("Tv가 재생되었습니다.");
    }
}
