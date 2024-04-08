package week02.Card;

public class KAKAOCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원이 KAKAO카드로 결제되었습니다.");
    }
}
