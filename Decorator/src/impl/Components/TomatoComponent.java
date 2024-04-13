package impl.Components;

import Interface.Component;
import impl.ComponentDecorator;

public class TomatoComponent extends ComponentDecorator {

   public TomatoComponent(Component wapper){
        super(wapper);

    }
    @Override
    public String getDesciption() {
        return super.getComponent().getDesciption()+" ,Tomato";
    }

    @Override
    public double getCost() {
        return super.getComponent().getCost()+1.2;
    }
}
