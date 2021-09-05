package strategy.algorithm.quack;

public class DuckPager implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("오리 호출기 실행");
    }
}
