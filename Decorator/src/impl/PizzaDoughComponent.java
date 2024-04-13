package impl;

import Interface.Component;

public class PizzaDoughComponent implements Component {

    @Override
    public String getDesciption() {
        return "this is the Pizza dough";
    }

    @Override
    public double getCost() {
        return 10;
    }
}
