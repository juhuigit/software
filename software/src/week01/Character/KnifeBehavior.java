package week01.Character;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("칼을 휘둘렀다 !");
    }
}
