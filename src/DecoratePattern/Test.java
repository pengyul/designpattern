package DecoratePattern;

import ObserverPattern.Whip;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ", " + beverage.cost());
    }
}
