package Week07;

class LazyHolderSingleton{
    // private static LazyHolderSingleton uniqueInstance = new LazyHolderSingleton();

    private LazyHolderSingleton() {}

    private static class singleInstanceHolder{ // 중첩클래스
        private static final LazyHolderSingleton UNIQUE_INSTANCE = new LazyHolderSingleton();// 더이상 값을 바꿀 수 없는 상수
    }
    public static LazyHolderSingleton getInstance() { // 주소 넘겨받기
        return singleInstanceHolder.UNIQUE_INSTANCE;
    }
}

public class LazyHolderTest {
    public static void main(String[] args) {
        // LazyHolderSingleton l1 = new LazyHolderSingleton(); // private이라 불가능
        LazyHolderSingleton l1 = LazyHolderSingleton.getInstance(); // 참조
        System.out.println(l1);

        LazyHolderSingleton l2 = LazyHolderSingleton.getInstance();
        System.out.println(l2);

         // enum과 가장 많이 쓰임.
    }
}
