package order;

import pizza.BJCheesePizza;
import pizza.BJPepperPizza;
import pizza.Pizza;

public class BJPizzaOrder extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        switch (orderType) {
            case "cheese":
                pizza = new BJCheesePizza();
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                break;
        }

        return pizza;
    }
}
