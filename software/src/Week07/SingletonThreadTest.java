package Week07;

public class SingletonThreadTest {
    public static void main(String[] args) {
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            Singleton s3 = Singleton.getInstance();
            System.out.println(s3.hashCode());
        }
    });

    Thread t4 = new Thread(()-> {
            Singleton s3 = Singleton.getInstance();
            System.out.println(s3.hashCode());
    });

    t3.start(); // 736633542
    t4.start(); // 565844865  <- 값이 다름. 따라서 synchronized를 사용 or 처음부터 할당하고 시작 or enum으로 사용(또는 비슷한 LazyHolder) !!
    }
}
