package Week10;

interface Duck {
    public void quack();
    public void fly();
}

interface Turkey {
    public void gobble();
    public void fly();
}

class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}

class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있어요!");
    }
}

class TurkeyAdapter implements Duck { // aggregation(약한 결합)
    Turkey turkey; // 멤버변수로 갖고있음 -> 연관관계(association)

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        // 터키 객체를 터키 어댑터로 감싸서 Duck 객체처럼 보이게 합니다.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("\n터키가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);
//        duck.quack();
//        duck.fly();

        System.out.println("\n터키 어댑터가 말하길");
        testDuck(turkeyAdapter);
//        turkeyAdapter.quack();
//        turkeyAdapter.fly();
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
