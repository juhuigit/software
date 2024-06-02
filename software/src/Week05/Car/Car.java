package Week05.Car;

public abstract class Car {
    String name;

    // 타이어
    Tire tire;
    // 문
    Door door;
    // 창문
    Window window;

    abstract void prepare();
    void make() {
        System.out.println("재료를 조립하기");
    }

    void finish() {
        System.out.println("완성하기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class KRBenz extends Car {
    CarIngredientFactory factory;
    public KRBenz(CarIngredientFactory factory) {
        this.factory = factory;
        setName("한국산 벤츠");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}
class KRK5 extends Car {
    CarIngredientFactory factory;
    public KRK5(CarIngredientFactory factory) {
        this.factory = factory;
        setName("한국산 K5");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}
class KRRei extends Car {
    CarIngredientFactory factory;
    public KRRei(CarIngredientFactory factory) {
        this.factory = factory;
        setName("한국산 Rei");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}

class USBenz extends Car {
    CarIngredientFactory factory;
    public USBenz(CarIngredientFactory factory) {
        this.factory = factory;
        setName("미국산 벤츠");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}
class USK5 extends Car {
    CarIngredientFactory factory;
    public USK5(CarIngredientFactory factory) {
        this.factory = factory;
        setName("미국산 K5");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}

class USRei extends Car {
    CarIngredientFactory factory;
    public USRei(CarIngredientFactory factory) {
        this.factory = factory;
        setName("미국산 레이");
    }

    @Override
    void prepare() {
        System.out.println("준비중 : " + name);
        tire = factory.createTire();
        door = factory.createDoor();
        window = factory.createWindow();
    }
}
