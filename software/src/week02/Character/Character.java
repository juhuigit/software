package week02.Character;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {}

    public void performWeapon() {weapon.useWeapon();}

    public void setWeapon(WeaponBehavior wp) {
        this.weapon = wp;
    }
}
