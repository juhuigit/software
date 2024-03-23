package Week03.Utube;

public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private LandCh landCh;

    public KoreanSubscriber(String name, LandCh landCh) {
        this.name = name; // 구독자의 이름
        this.landCh = landCh; // 구독자가 구독하는 채널
        landCh.registerSubscriber(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println(name + "님 가격이 " + value + "원으로 변경되었습니다.");
    }
}
