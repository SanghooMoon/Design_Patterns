package decorator.pizzaStore;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThinPizza();
        Pizza olivesPizza = new Olives(pizza);

        System.out.println(olivesPizza.getDescription());
        System.out.println(olivesPizza.cost());
    }
}
