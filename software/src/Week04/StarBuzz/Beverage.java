package Week04.StarBuzz;

// Beverage는 추상클래스이며, getDescription() 과 cost()라는 2개의 메소드를 가진다.
public abstract class Beverage {
    // 사이즈 개념 신도입
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    // cost()는 서브클래스에서 구현
    public abstract double cost();;

    public void setSize(Size size) { this.size = size; }

    public Size getSize() { return this.size; }
}
