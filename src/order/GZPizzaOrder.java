package order;

import pizza.GZCheesePizza;
import pizza.GZPepperPizza;
import pizza.Pizza;

public class GZPizzaOrder extends OrderPizza{


    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        switch (orderType) {
            case "cheese":
                pizza = new GZCheesePizza();
                break;
            case "pepper":
                pizza = new GZPepperPizza();
                break;
        }

        return pizza;
    }
}
