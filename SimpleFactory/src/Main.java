import factory.SimpleFactoryPizza;
import store.PizzaStore;

public class Main {
    public static void main(String[] args) {

        SimpleFactoryPizza factory = new SimpleFactoryPizza();
        PizzaStore pizzaStore = new PizzaStore(factory);

        System.out.println("----- cheese -----");
        pizzaStore.orderPizaa("cheese");

        System.out.println("----- clam -----");
        pizzaStore.orderPizaa("clam");
    }
}