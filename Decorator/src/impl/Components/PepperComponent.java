package impl.Components;

import Interface.Component;
import impl.ComponentDecorator;

public class PepperComponent extends ComponentDecorator {

    public PepperComponent(Component wapper) {
        super(wapper);
    }

    @Override
    public String getDesciption() {
        return super.getComponent().getDesciption()+", Perpper";
    }

    @Override
    public double getCost() {
        return super.getComponent().getCost()+2;
    }
}
