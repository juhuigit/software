package Week05.Car;

public interface CarIngredientFactory {
    public Tire createTire();
    public Door createDoor();
    public Window createWindow();
}

class KoreaIngredient implements CarIngredientFactory{
    @Override
    public Tire createTire() {
        return new KoreaTire();
    }

    @Override
    public Door createDoor() {
        return new KoreaDoor();
    }

    @Override
    public Window createWindow() {
        return new KoreaWindow();
    }
}

class USIngredient implements CarIngredientFactory{
    @Override
    public Tire createTire() {
        return new USTire();
    }

    @Override
    public Door createDoor() {
        return new USDoor();
    }

    @Override
    public Window createWindow() {
        return new USWindow();
    }
}

interface Tire {

}
class KoreaTire implements Tire {
    public KoreaTire() {
        System.out.println("한국산 타이어");
    }
}
class USTire implements Tire {
    public USTire() {
        System.out.println("미국산 타이어");
    }
}

interface Door {

}
class KoreaDoor implements Door {
    public KoreaDoor() {
        System.out.println("한국산 문");
    }
}
class USDoor implements Door {
    public USDoor() {
        System.out.println("미국산 문");
    }
}

interface Window {

}
class KoreaWindow implements Window{
    public KoreaWindow() {
        System.out.println("한국산 창문");
    }
}
class USWindow implements Window{
    public USWindow() {
        System.out.println("미국산 창문");
    }
}