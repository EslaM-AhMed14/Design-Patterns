package pizza;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("this is Prepare Veggie pizza");
    }

    @Override
    public void baker() {
        System.out.println("this is baker the Veggie pizza ");

    }

    @Override
    public void cut() {
        System.out.println("this is cut the Veggie Pizza");

    }

    @Override
    public void box() {
        System.out.println("this is box the Veggie pizza");
    }
}
