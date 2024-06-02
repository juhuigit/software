package Week07;

class Class {
    private static Class uniqueInstance; // 하나뿐인 인스턴스를 저장하는 정적 변수
    private Class() {} // 생성자를 private으로 선언했으므로 해당 클래스에서만 클래스의 인스턴스를 만들 수 있음.
    static Class getInstance() { // 인스턴스를 만들어서 리턴
        if(uniqueInstance == null) {
            uniqueInstance = new Class();// 가능 Class Scope 내에서 객체 생성
        }
        return uniqueInstance;
    }
}

public class MyClass {
    public static void main(String[] args) {
        // Class c1 = new Class(); // 불가능 (생성자가 private)
        Class c1 = Class.getInstance();
    }
}
