package decorator.pizzaStore;

public class Olives extends PizzaDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.1;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}
