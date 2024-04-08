package week02.Card;

public class KBCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + "원이 KB카드로 결제되었습니다.");
    }
}
