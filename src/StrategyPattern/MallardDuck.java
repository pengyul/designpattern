package StrategyPattern;

public class MallardDuck extends Duck {
    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void swim() {
        System.out.println("Mallard Duck Swim!!!");
    }
}
