package strategy.client;

import strategy.algorithm.quack.DuckPager;
import strategy.algorithm.quack.QuackBehavior;

public class Hunter {

    QuackBehavior quackBehavior;

    public Hunter() {
        quackBehavior = new DuckPager();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
