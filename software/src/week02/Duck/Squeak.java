package week02.Duck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
