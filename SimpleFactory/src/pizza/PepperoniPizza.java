package pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("this is Prepare Pepperoni pizza");
    }

    @Override
    public void baker() {
        System.out.println("this is baker the Pepperoni pizza ");

    }

    @Override
    public void cut() {
        System.out.println("this is cut the Pepperoni Pizza");

    }

    @Override
    public void box() {
        System.out.println("this is box the Pepperoni pizza");
    }
}
