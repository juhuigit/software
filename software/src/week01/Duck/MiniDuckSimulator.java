package week01.Duck;

// 디자인패턴 1. 전략패턴
// : 알고리즘 군을 정의하고, 캡슐화해서 각각의 알고리즘 군을 수정해서 쓸 수 있게 해줍니다.
// 전략패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(); // MallardDuck 은 Duck을 Extends 함.
        mallard.performFly(); // Duck에서 정의한 함수
        mallard.performQuack(); // Duck에서 정의한 함수

        // model Duck 추가
        Duck model = new ModelDuck();
        model.performFly(); // 처음에는 날지 못하는 모형오리
        model.setFlyBehavior(new FlyRocketPowered()); // 로켓 추진력을 얻음으로써 날 수 있게 됨.
        model.performFly();
    }
}
