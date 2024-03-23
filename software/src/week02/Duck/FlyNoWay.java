package week02.Duck;

public class FlyNoWay implements FlyBehavior{
    // 날 수 없는 오리들의 나는 행동을 구현한 클래스
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
