package impl;

import interfaces.Subscriber;

public class MagazineReader  implements Subscriber {

    static int numberOfReader = 0;
    int id ;
    public  MagazineReader(){
        id = ++numberOfReader;
    }
    @Override
    public void update(String title) {
        System.out.println(title + " Arraved to Reader number " +id);
    }


}
