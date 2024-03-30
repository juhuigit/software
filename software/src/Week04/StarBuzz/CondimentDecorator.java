package Week04.StarBuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; // has-a 관계(약한 결합 관계)

    public abstract String getDescription();
}
