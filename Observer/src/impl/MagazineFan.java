package impl;

import interfaces.Subscriber;

public class MagazineFan implements Subscriber {

    static int numberOfFans = 0;
    int id =0;
    public MagazineFan(){
       id = ++numberOfFans;
    }

    @Override
    public void update(String title) {
        System.out.println(title+"Arraved to Fan number "+ id);
    }
}
