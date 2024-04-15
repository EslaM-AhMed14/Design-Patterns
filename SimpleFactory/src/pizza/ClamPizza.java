package pizza;

public class ClamPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("this is Prepare Clam pizza");
    }

    @Override
    public void baker() {
        System.out.println("this is baker the Clam pizza ");

    }

    @Override
    public void cut() {
        System.out.println("this is cut the Clam Pizza");

    }

    @Override
    public void box() {
        System.out.println("this is box the Clam pizza");
    }
}
