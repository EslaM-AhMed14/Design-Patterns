import Interface.Component;
import impl.ComponentBuilder;
import impl.Components.BeefComponent;
import impl.Components.PepperComponent;
import impl.Components.TomatoComponent;
import impl.PizzaDoughComponent;

public class Main {

    public static void main(String[] args) {
       Component pizza = new PizzaDoughComponent();
       pizza = new BeefComponent(pizza);

        System.out.println("Description: "+pizza.getDesciption());
        System.out.println("the cost: "+ pizza.getCost());
        System.out.println("-----------------------");

        pizza = new TomatoComponent(pizza);
        System.out.println("Description "+pizza.getDesciption());
        System.out.println("the cost: "+ pizza.getCost());
        System.out.println("-----------------------");

        pizza = new PepperComponent(pizza);
        System.out.println("Description "+pizza.getDesciption());
        System.out.println("the cost: "+ pizza.getCost());
        System.out.println("------------ Using builder -----------");

        Component pizza1 = new ComponentBuilder().addBeef().addPerrper().addTomato().addBeef().build();

        System.out.println("Description "+pizza1.getDesciption());
        System.out.println("the cost: "+ pizza1.getCost());





    }
}