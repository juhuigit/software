package week02.Card;

public class User {
    public static void main(String[] args) {
        PaymentStrategy a = new KAKAOCardPayment();
        a.pay(10000);

        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("맥북 에어", 2000000);
        Item B = new Item("에어팟", 300000);
        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new KBCardPayment());
        cart.pay(new KAKAOCardPayment());
    }
}
