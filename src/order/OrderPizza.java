package order;

import pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {

        Pizza pizza = null;
        String orderType;

        do {

            orderType = getType();
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();


        } while (true);

    }

    private String getType() {

        try {

            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

            return bufr.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
