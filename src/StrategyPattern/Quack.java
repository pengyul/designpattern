package StrategyPattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gua gua gua!");
    }
}
