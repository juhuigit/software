package Week04.Pokemon;

public abstract class Pokemon {
    int level;
    int hp;
    String name;

    public void attack(){}
    public int getLevel(){ return this.level; }
    public int getHp(){ return this.hp; }
    public String getName(){ return this.name; }
}
