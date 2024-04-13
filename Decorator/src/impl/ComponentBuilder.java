package impl;

import Interface.Component;
import impl.Components.BeefComponent;
import impl.Components.PepperComponent;
import impl.Components.TomatoComponent;

import java.awt.*;

public class ComponentBuilder {

   Component pizza = new PizzaDoughComponent();

  public ComponentBuilder addTomato(){
       pizza = new TomatoComponent(pizza);
       return  this;
   }

   public ComponentBuilder addBeef(){
        pizza = new BeefComponent(pizza);
        return  this;
    }

    public ComponentBuilder addPerrper(){
        pizza = new PepperComponent(pizza);

        return  this;
    }

    public Component build(){
      Component temp = this.pizza;
      pizza = new PizzaDoughComponent();

      return temp;
    }
}
