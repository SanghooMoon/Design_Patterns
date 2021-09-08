package decorator.pizzaStore;

public class ThinPizza extends Pizza {

    public ThinPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }

    @Override
    public double cost() {
        return 1.0;
    }

}
