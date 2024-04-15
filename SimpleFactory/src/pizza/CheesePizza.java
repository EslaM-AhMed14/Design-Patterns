package pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("this is Prepare Cheese pizza");
    }

    @Override
    public void baker() {
        System.out.println("this is baker the Cheese pizza ");

    }

    @Override
    public void cut() {
        System.out.println("this is cut the Cheese Pizza");

    }

    @Override
    public void box() {
        System.out.println("this is box the Cheese pizza");
    }
}
