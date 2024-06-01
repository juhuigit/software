package Week13;

import week02.Duck.Duck;

interface Quackable {
    public void quack();
}

class MallarDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}

class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}

class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽉꽉");
    }
}

class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}

class Goose {
    public void honk() {
        System.out.println("끽끽");
    }
}

class GooseAdapter implements Quackable { // 어뎁터 패턴
    Goose goose;

    // agreegation
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}

class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks; // 모든 오리들의 합계를 위해 정적 메모리 공간 활용

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    // numberOfQuacks는 public이 없기 때문에, getter 사용
    public static int getQuacks() {
        return numberOfQuacks;
    }
}
class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallarDuck()); // 데코레이터로 감싸기
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose())); // 어뎁터 패턴으로 거위 컨트롤

        System.out.println("\n오리 시뮬레이션 게임");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck); // 어뎁트 패턴

        System.out.println("오리가 소리 낸 횟수: " +
                QuackCounter.getQuacks() + " 번");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}



public class Main {
}
