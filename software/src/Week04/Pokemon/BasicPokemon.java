package Week04.Pokemon;

public class BasicPokemon extends Pokemon{
    public BasicPokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 공격 시전 !");
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public String getName() {
        return name;
    }
}
