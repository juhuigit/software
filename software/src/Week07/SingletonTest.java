package Week07;

class Singleton {
    private static Singleton uniqueInstance; // 직접적인 access 불가능
    //private static Singleton uniqueInstance = new Singleton(); // 직접적인 access 불가능

    // 생성자를 private으로 선헌
    private Singleton() {}

    public static synchronized Singleton getInstance() { // 주소 넘겨받기
        if (uniqueInstance == null) { // 단 하나의 객체 생성
            uniqueInstance = new Singleton(); // Singleton 객체 생성 후 uniqueInstance에 연결
        }
        return uniqueInstance;
    }

    public class SingletonTest {
        public static void main(String[] args) {
            // Singleton s0 = new Singleton();
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
