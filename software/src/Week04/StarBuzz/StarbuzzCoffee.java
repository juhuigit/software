package Week04.StarBuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        //
        beverage2 = new Mocha(beverage2); // 모카로 데코레이팅
        beverage2 = new Mocha(beverage2); // 모카 두샷
        beverage2 = new Whip(beverage2); // 휘핑 추가
        System.out.println(beverage2.getDescription()
        + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3); // 모카로 데코레이팅
        beverage3 = new Mocha(beverage3); // 모카 두샷
        beverage3 = new Whip(beverage3); // 휘핑 추가
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
