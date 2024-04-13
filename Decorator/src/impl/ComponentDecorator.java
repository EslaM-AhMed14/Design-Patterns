package impl;

import Interface.Component;

public abstract class ComponentDecorator  implements Component {

    private Component wapper;

    public ComponentDecorator(Component wapper){
        this.wapper = wapper;
    }
    public abstract String getDesciption() ;


    public abstract  double getCost();

    public Component getComponent(){
        return wapper ;
    }
}
