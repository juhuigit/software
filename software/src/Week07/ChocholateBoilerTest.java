package Week07;

class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static class ChocolateBoilerHolder {
        private static ChocolateBoiler UNIQUE_INSTACNE = new ChocolateBoiler();
    }


    // 생성자를 private으로 선언
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    private static ChocolateBoiler getInstance() {
        return ChocolateBoilerHolder.UNIQUE_INSTACNE; // 정적 클래스 내의 상수를 참조
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill () { // 재료 넣기
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() { // 끓이기
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public void drain () { // 다 끓여진 초콜릿을 다음 단계로 넘기기
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
}

public class ChocholateBoilerTest {
    public static void main(String[] args) {

    }
}

