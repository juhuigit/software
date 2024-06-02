package Week05.Car;

public abstract class Store {
    abstract Car createCar(String type); // 차량 구현은 서브 클래스에서 구현

    public Car orderCar(String type) { // 가게에 차량 주문 들어옴
        Car car;
        car = createCar(type); // 차종 결정

        System.out.println(car.getName());
        car.prepare();
        car.make();
        car.finish();

        return car;
    }
}

class KoreaStore extends Store{
    @Override
    public Car createCar(String type) {
        Car car = null;
        CarIngredientFactory factory = new KoreaIngredient();

        if (type.equals("Benz")) {
            car = new KRBenz(factory);
        } else if (type.equals("K5")) {
            car = new KRK5(factory);
        } else if (type.equals("Rei")) {
            car = new KRRei(factory);
        }
        return car;
    }
}

class USStore extends Store {
    @Override
    Car createCar(String type) {
        Car car = null;
        CarIngredientFactory factory = new USIngredient();

        if (type.equals("Benz")) {
            car = new USBenz(factory);
        } else if (type.equals("K5")) {
            car = new USK5(factory);
        } else if (type.equals("Rei")) {
            car = new USRei(factory);
        }
        return car;
    }
}
