package Week03.Utube;

import java.util.concurrent.Flow;

public interface Subject {
    public void registerSubscriber(Subscriber s);
    public void removeSubscriber(Subscriber s);
    public void notifySubscriber();
}
