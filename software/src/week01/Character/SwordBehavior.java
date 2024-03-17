package week01.Character;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검을 휘둘렀다 !");
    }
}
