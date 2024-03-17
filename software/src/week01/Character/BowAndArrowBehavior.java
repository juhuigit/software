package week01.Character;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("활을 휘둘렀다 !");
    }
}
