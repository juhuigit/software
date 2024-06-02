package Week05.Animals;

public abstract class Animals {
    void speak() {}
}

class Dog extends Animals{
    @Override
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animals{
    @Override
    void speak() {
        System.out.println("야옹");
    }
}

class SeoulDog extends Animals {
    @Override
    void speak() {
        System.out.println("왈왈");
    }
}
