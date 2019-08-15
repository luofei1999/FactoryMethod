package order;

import pizza.LDCheesePizza;
import pizza.LDPepperPizza;
import pizza.Pizza;

public class LDPizzaOrder extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        switch (orderType) {

            case "cheese":
                pizza = new LDCheesePizza();
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                break;

        }

        return pizza;
    }

}
