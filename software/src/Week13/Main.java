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

abstract class AbstractDuckFactory { // 추상팩토리 패턴 (의존성 역전의 원칙, 추상화된 존재에 의존)
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}

class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallarDuck(); // 객체 생성
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}

class CountingDuckFactory extends AbstractDuckFactory { // 카운팅하는 팩토리
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallarDuck()); // 객체 생성 시 데코레이터 랩핑 되어있음
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory(); // 팩토리 생성

        simulator.simulate(duckFactory);
    }

    // simulate() 메소드는 AbstractDuckFactory를 인자로 받습니다.
    // 객체의 인스턴스를 직접 생성하지 않고, 팩토리의 메소드로 생성합니다.
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck(); // 메소드를 통한 객체 생성
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose()); // 어뎁터 패턴으로 거위 컨트롤

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
