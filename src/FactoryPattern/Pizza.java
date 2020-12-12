package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList();
    void prepare(){
        System.out.println("name:" + name);
        System.out.println("dough:" + dough);
        System.out.println("sauce:" + sauce);
        for (String topping: toppings) {
            System.out.println("toppings:" + topping);
        }
    }

    void bake(){
        System.out.println("bake...");
    }

    void cut(){
        System.out.println("cut...");
    }

    void box(){
        System.out.println("box...");
    }

    public String getName(){
        return name;
    }
}
