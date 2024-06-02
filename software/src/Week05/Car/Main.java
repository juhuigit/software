package Week05.Car;

public class Main {
    public static void main(String[] args) {
        Store koreaStore = new KoreaStore();
        Car korea_benz = koreaStore.orderCar("Benz");

        Store usStore = new USStore();
        Car us_Rei = usStore.orderCar("Rei");
    }
}
