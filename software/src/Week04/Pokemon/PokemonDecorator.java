package Week04.Pokemon;

public abstract class PokemonDecorator extends Pokemon{
    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
