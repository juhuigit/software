package week02.Character;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.performWeapon(); // 칼을 휘둘렀다 !
        king.setWeapon(new SwordBehavior());
        king.performWeapon(); // 검을 휘둘렀다 !

        Character queen = new Queen();
        queen.performWeapon(); // 활을 휘들렀다 !
    }
}
