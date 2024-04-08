package Week04.Pokemon;

public class FireDecorator extends PokemonDecorator{
    private Pokemon pokemon;

    public FireDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        pokemon.attack();
        System.out.println(getName() + " 화염 공격 시전 !");
    }

    @Override
    public int getLevel() {
        return pokemon.getLevel();
    }

    @Override
    public int getHp() {
        return pokemon.getHp();
    }

    @Override
    public String getName() {
        return pokemon.getName();
    }
}
