package store;

import factory.SimpleFactoryPizza;
import pizza.Pizza;

public class PizzaStore {
    SimpleFactoryPizza factoryPizza ;

    public PizzaStore(SimpleFactoryPizza factoryPizza){
        this.factoryPizza= factoryPizza;
    }
    public Pizza orderPizaa(String type){
        Pizza pizza = factoryPizza.createPizza(type);

        pizza.prepare();
        pizza.baker();
        pizza.cut();
        pizza.cut();

        return pizza;
    }
}
