package Week03.Utube;

public class UtubeApp {
    public static void main(String[] args) {
        LandCh juhuiChannal = new LandCh();

        KoreanSubscriber ks1 = new KoreanSubscriber("꼬부기", juhuiChannal);
        KoreanSubscriber ks2 = new KoreanSubscriber("리자몽", juhuiChannal);

        juhuiChannal.setPrice(100);
        Subscriber ks3 = new KoreanSubscriber("개굴닌자", juhuiChannal);
        juhuiChannal.setPrice(200);
        juhuiChannal.removeSubscriber(ks2);
        juhuiChannal.setPrice(300);
    }
}
