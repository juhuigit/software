package Week04.Starbucks;

// Beverage는 추상클래스이며, description과 cost 두 개의 메소드를 가짐.
abstract class Beverage {
    String info = "제목 없음";

    public String getInfo() {
        return info;
    }

    // abstract가 붙으면 서브클래스에서 구현해야함.
    public abstract double cost();
}

class Espresso extends Beverage {
    public Espresso() {
        info = "에스프레소"; // 부모클래스에게 상속받은 인스턴스 변수
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

class ColdBlew extends Beverage {
    public ColdBlew() {
        info = "콜드브루"; // 부모클래스에게 상속받은 인스턴스 변수
    }
    @Override
    public double cost() {
        return 2.99;
    }
}

abstract class Decorator extends Beverage {
    Beverage beverage; // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체 지정
    public abstract String getInfo(); // 모든 데코레이터는 설명 메소드를 구현해야함.
}

class Whip extends Decorator {
    public Whip(Beverage beverage) { // 매개변수 생성자, 감싸고자 하는 음료 객체 전달
        this.beverage = beverage; // 감싸고자 하는 음료 저장하는 인스턴스 변수
    }
    @Override
    public String getInfo() {
        return beverage.getInfo() + ", 휘핑"; // 장식하고 있는 객체에 작업을 위임한 후, 휘핑을 더함.
    }
    @Override
    public double cost() {
        return beverage.cost() + .20;
        // 음료 가격에 휘핑 가격을 추가해야함.
        // 장식하고 있는 객체에 작업을 위임한 후(음료 가격), 휘핑 값을 더함.
    }
}
public class Main {
    public static void main(String[] args) {
        Beverage b1 = new Espresso(); // 아무것도 넣지 않은 에스프레소
        System.out.println(b1.getInfo() + " &" + b1.cost());

        Beverage b2 = new ColdBlew(); // 콜드브루 객체 생성
        b2 = new Whip(b2);
        b2 = new Whip(b2); // 휘핑 두번 추가
        System.out.println(b2.getInfo() + " &" + b2.cost());
    }
}
