package StrategyPattern;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();
    }
}
