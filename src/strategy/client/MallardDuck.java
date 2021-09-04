package strategy.client;

import strategy.algorithm.fly.FlyWithWings;
import strategy.algorithm.quack.Quack;

public class MallardDuck extends Duck {

    // quackBehavior, flyBehavior 인스턴스 변수는 Duck 부모 클래스로부터 상속받아 사용가능능
   public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
