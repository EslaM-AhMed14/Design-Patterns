package impl.Components;

import Interface.Component;
import impl.ComponentDecorator;

public class BeefComponent extends ComponentDecorator {


    public BeefComponent(Component wapper) {
        super(wapper);
    }

    @Override
    public String getDesciption() {
        return super.getComponent().getDesciption()+" ,Beef";
    }

    @Override
    public double getCost() {
        return super.getComponent().getCost()+13;
    }
}
