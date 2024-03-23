package Week03.Utube;

public class EnglishSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landCh;

    public EnglishSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println("Mr/Mrs." + name + ", the price has been changed to " + value + " won.");
    }
}
